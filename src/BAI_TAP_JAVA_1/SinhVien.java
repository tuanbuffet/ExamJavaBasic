package BAI_TAP_JAVA_1;
public class SinhVien {
    public String Name; //biến instance
    public static String Gender="Nam"; //biến static

    public String setInf(String Name) {
        this.Name = Name;
        return Name;
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        System.out.println("Họ tên: " + sv.setInf("Nguyễn Tuấn Anh"));
        System.out.println("Giới tính:"+Gender);
        System.out.println("Nghề nghiệp:"+ ThongTin.Job);
        System.out.println("Địa chỉ:" + ThongTin.Address);
    }

}
