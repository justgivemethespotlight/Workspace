import java.util.Random;

public class RandomUtilDemo {
    public static void main(String[] args) {
        Random random = new Random();

        int dice = random.nextInt(6) + 1;          // 1~6
        int randInRange = random.nextInt(10, 21);  // 10~20
        double randDouble = random.nextDouble();
        boolean randBool = random.nextBoolean();
    }
}
