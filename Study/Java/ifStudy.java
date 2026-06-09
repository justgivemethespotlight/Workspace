import java.util.Scanner;

public class ifStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 20;
        if (a==b) {
            System.out.println("같습니다. 값: " + a);
        }
        else {
            System.out.println("다릅니다. 입력된 값: " + b);
            System.out.println("같은 값: " + a);

        }
    }
}
