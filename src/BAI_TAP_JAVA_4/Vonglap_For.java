package BAI_TAP_JAVA_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vonglap_For {
    int numbers[] = new int[26];
    public void SoChan(){
        System.out.print("Các số chẵn từ 0 - 50 là: ");
        for(int i = 0; i <= 50; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
                numbers[i/2] = i;
            }
        }
        System.out.print("\n" + "Duyệt mảng số chẵn được lưu: ");
        for (int number:numbers){
            System.out.print( number + " ");
        }
    }

    public static void main(String[] args) {
        Vonglap_For vonglapFor = new Vonglap_For();
        vonglapFor.SoChan();
    }
}
