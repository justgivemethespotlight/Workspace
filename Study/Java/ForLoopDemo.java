import java.util.Random;
import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1부터 N까지의 합 - N 입력: ");
        int sumLimit = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= sumLimit; i++) {
            sum += i;
        }
        System.out.println("합계: " + sum);
        System.out.println();

        System.out.print("구구단 단 입력: ");
        int dan = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
        System.out.println();

        System.out.print("1부터 N까지 짝수의 합 - N 입력: ");
        int evenLimit = sc.nextInt();
        int evenSum = 0;
        for (int i = 1; i <= evenLimit; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println("짝수 합계: " + evenSum);
        System.out.println();

        System.out.print("팩토리얼 N 입력: ");
        int factorialLimit = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= factorialLimit; i++) {
            factorial *= i;
        }
        System.out.println(factorialLimit + "! = " + factorial);
        System.out.println();

        int answer = new Random().nextInt(100) + 1;
        System.out.println("숫자 맞히기 게임 시작 (1~100)");
        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int guess = sc.nextInt();

            if (guess < answer) {
                System.out.println("더 큰 수입니다.");
            } else if (guess > answer) {
                System.out.println("더 작은 수입니다.");
            } else {
                System.out.println("정답입니다!");
                break;
            }
        }
    }
}
