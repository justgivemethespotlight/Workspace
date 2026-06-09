#!/usr/bin/env python3

def main():
    # 입력을 받습니다. 앞뒤 공백 제거하고 소문자로 비교합니다.
    s = input().strip().lower()
    if s == "hello":
        print("world")


if __name__ == "__main__":
    main()