public class ControlStudy {
    public static void main(String[] args) {
        char c = 65;
        System.out.println(c); // A
        System.out.println((char) c + 32); // a
        System.out.println(((char) c + 32)); // 97

        char c1 = '\u0041'; // 'A'
        char c2 = '\u0042'; // 'B'
        char c3 = '\u0061'; // 'a'
        char c4 = '\u4C00'; // '가'
        char c5 = '\uD7A3'; // '힣'
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }
}
