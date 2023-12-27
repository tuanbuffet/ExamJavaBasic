package org.example;

import org.openqa.selenium.By;

import static org.example.WebUI.*;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[][] infomations = {
                {"tranthanhlong.28022000@gmail.com","Long","","","Cts Galaxy Play Easy IELTS Video_Video_ Introduction"},
                {"dohuongpt@gmail.com","Hương","","","Cts Viettel Money Easy IELTS Video_Video_ Introduction"},
                {"dohoanganh15052000@gmail.com","Đỗ Hoàng Anh","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"giang.cat.luongg@gmail.com","Vũ Trường Giang","","","Cts Viettel Money Easy IELTS Video_Preparation"},
                {"dongt20044@gmail.com","Trương Đông","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"longtap445@gmail.com","Lương thanh long","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"anhemmotnha389@gmail.com","Nguyễn Trọng Nguyên","","","Cts Viettel Money Easy IELTS Video_ Introduction"},
                {"sonchichchuyen123@gmail.com","Trần Hồng Sơn","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"hoanglinhk47@gmail.com","Hoàng Nhật Linh","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"vy236447@gmail.com","Nguyễn Trần Phương Vy","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"nguyenquanghiep3404@gmail.com","Nguyễn Quang Hiệp","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"hoangnhph38783@fpt.edu.vn","Nguyễn Huy Hoàng","","","Cts Viettel Money Easy IELTS Video_Preparation"},
                {"damthinga0904@gmail.com","Đàm Thị Ngà","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"ngoan.nghiem@gmail.com","Nghiem Ngoan","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"nguyenhuukhuong11a8myhao.hy@gmail.com","Nguyễn Hữu Khương","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"phuonglytruong2k4@gmail.com","Trương Thị Mỹ Ly","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"khacgiang987@gmail.com","Đồng khắc Giang","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"phamn8447@gmail.com","Phạm Hoàng Bảo Ngọc","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"nguyenlamtanlinh2004@gmail.com","nguyen linh","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"hoaihoangthu13@gmail.com","Hoàng Thu Hoài","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"ledao22796@gmail.com","Lê Thị Đào","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"nguyenmine.nnm@gmail.com","nguyễn thị ngọc mai","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"kiethtpc06192@fpt.edu.vn","Hà Tuấn Kiệt","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"thptdaian.tranthithaok1922@gmail.com","Trần Thị Thảo","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"ttwlmobile@gmail.com","Nguyễn Minh Đăng","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"lophuongthao134@gmail.com","Lỗ Thị Phương Thảo","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"lthuynh42@gmail.com","Lưu Trọng Huỳnh","","","Cts Viettel Money Easy IELTS Video_Preparation"},
                {"panhloveme@gmail.com","Ha Phuong Anh","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"maumebebet54@gmail.com","Kiều Phúc Lâm","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"dothinhutranghnue@gmail.com","Đỗ Thị Như Trang","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"zeding612@gmail.com","Nguyễn Gia Lâm","","","Cts Viettel Money Easy IELTS Video_Preparation"},
                {"ngtly2003@gmail.com","Nguyễn Thị Ly","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"manhvann193@gmail.com","Nguyễn Văn Mạnh","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"nguyenngocchinh21112001@gmail.com","NGUYỄN NGỌC CHINH","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"jinxdelia@gmail.com","Võ Huyền Trân","","","Cts Viettel Money Easy IELTS Video_Preparation"},
                {"phamngan07072004@gmail.com","Phạm Thị Kim Ngân","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"nguyendat162003@gmail.com","Nguyễn Văn Đạt","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"nguyendat162003@gmail.com","Nguyễn Văn Đạt","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"nthi8237@gmail.com","Nguyễn Kiều Anh Thi","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"hai6cltt@gmail.com","Hoàng Hải","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"dungt1689@gmail.com","Trần Tiến Dũng","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"ngocnhihv19@gmail.com","Đào Ngọc Nhi","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"linhnhph33830@fpt.edu.vn","Nguyễn Hải Linh","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"quangduy011001@gmail.com","Tạ Quang Duy","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"sonhand1999@gmail.con","Ngô Sơn Hà","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"vonamjp56@gmail.com","Võ Việt Nam","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"levietha0210@gmail.com","Lê Việt Hà","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"glassboy204@gmail.com","Luen","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"ducth3765@gmail.com","Hoàng Anh Đức","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"manhlinhnguyen51@gmail.com","Nguyễn Mạnh Linh","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"xuanthuc1512@gmail.com","Nguyễn Xuân Thức","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"aaaaxxx090@gmail.com","Trần Nhựt","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"ptchang53@gmail.com","Nguyễn Thị Huyền Trang","","","Cts Viettel Money Easy IELTS Video_Preparation"},
                {"hothimongtien132003@gmail.com","Hồ Thi Mộng Tiên","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"datpham352003@gmail.com","Phạm Dương Thành Đạt","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"thu922002@gmail.com","Nguyễn Thị Thu","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"nguyenngocchinh21112001@gmail.com","Chinh","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"anhduongphung374@gmaill.com","Phùng Ánh Dương","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"anhduongphung374@gmail.com","Phùng Ánh Dương","","","Cts Viettel Money Easy IELTS Video_Preparation"},
                {"tuannghia058@gmail.com","Nguyễn Tuấn Nghĩa","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"951huyen@gmail.com","Hà Thị Huyền","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"quynhhihi04@gmail.com","Nguyễn Thị Quỳnh","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"webera4d20@gmail.com","Bùi Văn Đại","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"ngocvy0327@gmail.com","VŨ NGỌC VY","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"ngocvy0327@gmail.com","VŨ NGỌC VY","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"minhngoccute237@gmail.com","Ngô Minh ngọc","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"trishnguyen213@icloud.com","Nguyễn Ngọc Phương Trinh","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"nguyennd2810@gmail.com","Nguyễn Đức Nguyên","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"lehongha638@gmail.com","Lê Hồng Hà","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"quangngan03@gmail.com","Trần Lê Anh Quang","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"minhquang2929@gmail.com","Lê Quang Minh","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"thanhkhanh3806@gmail.com","nguyen thanh khanh","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"thanhkhanh3806@gmail.com","nguyen thanh khanh","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"hamanhduc3@gmail.com","Hà Mạnh Đức","","","Cts Viettel Money Easy IELTS Video_Preparation"},
                {"lethuongmytrinh@gmail.com","Lê Thị Chí Thương","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"vuvantho190604@gmail.com","Vũ Văn Thọ","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"trinhthisen0212@gmail.com","TRỊNH THỊ SEN","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"bolun0112@gmail.com","Huỳnh Thảo","","","Cts Viettel Money Easy IELTS Video_Preparation"},
                {"hongngoctran1903@gmail.com","Trần Thị Hồng Ngọc","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"hoanglong10122004@gmail.com","Trương Hoàng Long","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"nhanchuoibanana@gmail.com","Phạm Thị Thanh Nhàn","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"hoanganh.luong2906@gmail.com","Lương Hoàng Anh","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"lehieuhuy1404@gmail.com","Lê Hiếu Huy","","","Cts Viettel Money Easy IELTS Video_Intensive"},
                {"luonghang536@gmail.co","Lương Thu Hằng","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"nguyenphuocmanh2003@gmail.com","Nguyễn Phước Mạnh","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"codienkt2002@gmail.com","Nguyễn Vũ Đình Tuấn","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"hoangtrunq18@gmail.com","Hoàng Viết Trung","","","Cts Viettel Money Easy IELTS Video_Foundation"},
                {"thuongntph32042@fpt.edu.vn","Nguyễn Thị Thương","","","Cts Viettel Money Easy IELTS Video_Introduction"},
                {"quylai62@gmail.com","Lại Ngọc Quý","","","Cts Viettel Money Easy IELTS Video_ Introduction"},
                {"kieutrangks35@gmail.com","Trần kiều trang","","","Cts Viettel Money Easy IELTS Video_Preparation"},
        };

        Login login = new Login();
        ManageAccounts manageAccounts = new ManageAccounts();
        ManageCohorst manageCohorst = new ManageCohorst();
        ManageBooks manageBooks = new ManageBooks();
        /*login.ManageLogin(infomations);*/
        login.Login();
        manageAccounts.RUN(infomations);
        manageCohorst.RUN(infomations);
        manageBooks.manageBooks(infomations);
    }
}