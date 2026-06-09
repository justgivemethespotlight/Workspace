public class PatternPrint {
    public static void main(String[] args) {
        int size = 6; // 전체 줄 수

        for (int i = 0; i < size; i++) {
            for (int j = 1; j <= 5; j++) {
                // 출력할 숫자가 (5 - 현재 줄 번호)보다 작거나 같으면 숫자 출력
                if (j <= 5 - i) {
                    System.out.print(j + " ");
                } else {
                    // 그 외에는 별 출력
                    System.out.print("* ");
                }
            }
            // 한 줄이 끝나면 줄바꿈
            System.out.println();
        }
    }
}