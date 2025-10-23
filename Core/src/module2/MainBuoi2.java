package module2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainBuoi2 {

    static void swap(int a, int b) {
        int c = a;// giữ giá trị của biến hiện tại
        a = b; // gán a bằng giá trị của b
        b = c; // gán b bằng giá trị cũ của a sau khi gán cho b
        System.out.println("Giá trị a: " + a);
        System.out.println("Giá trị b: " + b);
        // Java -> Python, JS
    }


    public static void main(String[] args) throws ParseException {
//        System.out.println(Math.round(3.49));
//        System.out.println(Math.floorDiv(-10, 3));
//        System.out.println(Math.round(3.49));

        for (int i = 0; i < 1000; i++) {
            Double kq = Math.random() * 100;
            if (kq >= 99) {
                System.out.println("Ghép đồ thành công");
            }
        }

//        Integer kq = 12;
//        System.out.println((kq + "") instanceof String);
//        String sDate = "17/07/2017";
//        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
//        System.out.println(sDate + "\t" + date);
//        Integer a = 12;
        // Chuyển về chuỗi
//        String s = a.toString();// chuỗi cuỗi
//        System.out.println(s instanceof String);


//        String reusltString = String.valueOf(a);
        // Chuyển Số nguyên về số thực
//        Float reusltFLoat = Float.parseFloat(s);
//        System.out.println(reusltFLoat);
//        // Chuyển đồ về Double
//        Double resultDouble = Double.parseDouble(String.valueOf(a));
//        System.out.println(resultDouble);

//        System.out.println(reusltString instanceof String);



//        float kq = (int)

//        double kq = 1 +  (float) (2  * 3 / 4);
//        System.out.println(kq);

//        int a = 5;
//        System.out.println(a++);// Tăng a lên 1 và trả về giá trị sau tăng -> a tăng lên một = 6 -> giá trị trước tăng = 5
//        System.out.println(a);// 6
//
//        System.out.println(++a); // Tăng a lên 1 đơn vị trước, và trả về giá trị sau khi đã tăng
//        System.out.println(a);



//        int a = 5, b = 4;
//        swap(a, b);
//        System.out.println("Gia tri a sau do: " + a);
//        System.out.println("Gia tri b sau do: " + b);


////        MainBuoi2 main = new MainBuoi2();
////        main.sleep();
//
//        sleep();
    }

//     static void sleep() { // phương thức
//        System.out.println("Ngủ");
//    }
}
