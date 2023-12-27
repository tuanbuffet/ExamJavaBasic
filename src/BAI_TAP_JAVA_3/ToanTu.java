package BAI_TAP_JAVA_3;

public class ToanTu {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        boolean condition1 = (a < b) && (b > c); // &&
        boolean condition2 = (a < b) || (b > c); // ||
        boolean condition3 = a > b; // >
        boolean condition4 = a < b; // <
        boolean condition5 = a == b; // ==

        System.out.println("a < b && b > c: " + condition1);
        System.out.println("a < b || b > c: " + condition2);
        System.out.println("a > b: " + condition3);
        System.out.println("a < b: " + condition4);
        System.out.println("a == b: " + condition5);
    }
}
