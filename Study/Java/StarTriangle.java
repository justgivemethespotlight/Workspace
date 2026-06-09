public class StarTriangle {
    public static void main(String[] args) {
        // 바깥쪽 for문: 5층까지 반복 (행)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // 한 층의 별 출력이 끝나면 줄바꿈
            System.out.println();
        }
    }
}