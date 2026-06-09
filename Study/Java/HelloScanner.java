import java.util.Scanner;

public class HelloScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력: ");
        String name = sc.nextLine();
        System.out.println("안녕하세요, " + name + "님!");
    }
}


