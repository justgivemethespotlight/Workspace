print("Hello world!")
local number = 9

while wait(1) do
	local a = os.date("!*t")

	game.Lighting.ClockTime = a.hour + 9 + a.min/60 + a.sec/60/60
end