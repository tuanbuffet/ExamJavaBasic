package BAI_TAP_JAVA_3;

public class Logic {
    public static int check(int n) {
        int Number = 100;
        if (n == Number) {
            System.out.println("n bằng " + Number);
        } else if (n < Number) {
            System.out.println("n nhỏ hơn " + Number);
        } else {
            System.out.println("n lớn hơn " + Number);
        }
        return 0;
    }

    public static void main(String[] args) {
        Logic logic = new Logic();
        logic.check(20);

    }
}
