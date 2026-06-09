public class OperatorStudy {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        double x = 0.1 + 0.2;
        System.out.println("0.1 + 0.2 = " + x);
        System.out.println("0.2 + 0.2 = " + (0.2 + 0.2));

        if (x == 0.3) {
            System.out.println("0.1 + 0.2 = 0.3입니다.");
        } else {
            System.out.println("실수 연산은 오차가 있을 수 있습니다.");
        }

        double epsilon = 1e-9;
        double target = 0.3;
        double n1 = 0.1;
        double n2 = 0.2;
        double absDiff = Math.abs(target - (n1 + n2));

        System.out.println("epsilon: " + epsilon);
        System.out.println("absDiff: " + absDiff);
        System.out.println();

        if (absDiff < epsilon) {
            System.out.println("두 값을 같다고 인정하기");
        } else {
            System.out.println("두 값이 다르다고 판단하기");
        }
    }
}
