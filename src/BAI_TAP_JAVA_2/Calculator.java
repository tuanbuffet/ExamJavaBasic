package BAI_TAP_JAVA_2;

public class Calculator {
    public int Tong2SoNguyen(int number1, int number2){
        System.out.print("Tổng 2 số: " + number1 + " và" +number2+ " là: " );
        return number1 + number2;
    }
    public static void Tich2SoThuc(double number1, double number2){
        System.out.print( "Tích của 2 số: " + number1 + " và " + number2 + " là: " + number1 * number2);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.Tong2SoNguyen(5,3));
        Tich2SoThuc(0.5,1.9);
    }
}
