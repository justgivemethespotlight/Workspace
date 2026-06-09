while True:
    a = float(input("첫 번째 숫자: "))
    op = input("연산자(+ - * /): ").strip()
    b = float(input("두 번째 숫자: "))

    if op == "+":
        print(a + b)
    elif op == "-":
        print(a - b)
    elif op == "*":
        print(a * b)
    elif op == "/":
        if b == 0:
            print("0으로 나눌 수 없어요.")
        else:
            print(a / b)
    else:
        print("지원하지 않는 연산자예요.")

    if input("계속? (y/n): ").strip().lower() != "y":
        break