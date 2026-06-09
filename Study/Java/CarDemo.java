class MyCar {
    String color;
    int speed;
}

public class CarDemo {
    public static void main(String[] args) {
        MyCar c1 = new MyCar();
        c1.color = "Alpine White";
        c1.speed = 250;

        MyCar c2 = new MyCar();
        c2.color = "Black Sapphire Metallic";
        c2.speed = 230;

        System.out.println(c1.color + " 자동차, 속도: " + c1.speed);
        System.out.println(c2.color + " 자동차, 속도: " + c2.speed);
    }
}
