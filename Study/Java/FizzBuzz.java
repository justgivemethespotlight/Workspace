import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N을 입력: ");
        int N = sc.nextInt();
        
        // 1부터 N
        for (int i = 1; i <= N; i++) {
            // (X) 3의 배수면 "Fizz" 출력
            // 3이 되면 i 대신 Fizz
            if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

// 정수 N을 입력받아 1부터 N까지 순서대로 출력하되, 아래 조건에 따라 출력하는 프로그램을 작성하시오.

// 조건1. 3과 5의 공배수이면 "FizzBuzz"를 출력한다.
// 조건2. 3의 배수이면 "Fizz"를 출력한다.
// 조건3. 5의 배수이면 "Buzz"를 출력한다.
// 조건4. 그 외에는 숫자를 그대로 출력한다.

// 입력 예시 : 15
// 출력 예시 : 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz