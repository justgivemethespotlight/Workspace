extends Node2D

const SPEED = 400;
const CHARACTER_HALF_WIDTH = 40
var no_dir_input

signal player_hit

var health
var dead = false

# Called when the node enters the scene tree for the first time.
func _ready():
	$AnimatedSprite2D.play("idle")
	health = 3

# Called every frame. 'delta' is the elapsed time since the previous frame.
func _process(delta):
	if not dead:
		no_dir_input = true
	
		if Input.is_action_pressed("left"):
			no_dir_input = false
			scale.x = -1
			$AnimatedSprite2D.play("run")
			position.x -= SPEED * delta
			if (position.x - CHARACTER_HALF_WIDTH) <= 0:
				position.x = (0 + CHARACTER_HALF_WIDTH)
			
		if Input.is_action_pressed("right"):
			no_dir_input = false
			scale.x = 1
			$AnimatedSprite2D.play("run")
			position.x += SPEED * delta
			if (position.x + CHARACTER_HALF_WIDTH) >= 540:
				position.x = (540 - CHARACTER_HALF_WIDTH)
		
		if no_dir_input:
			$AnimatedSprite2D.play("idle")

func _on_area_2d_area_entered(area):
	if area.is_in_group("rock"):
		hit()

func hit():
	health -= 1
	player_hit.emit()
	if health == 0:
		on_dead()

func on_dead():
	dead = true
	$AnimatedSprite2D.animation.finshed.connect(_on_dead_animation_finished)
	$AnimatedSprite2D.play("dead")
	
func _on_dead_animation_finished():
	queue_free()
