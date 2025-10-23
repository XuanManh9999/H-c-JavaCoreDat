package module2;

public class VongLap {
    public static void main(String[] args) {

        //        for (int i = 1; i < 10; i++) {
        //            System.out.println("Bảng i: " + i);
        //            for (int j = 0; j <= 10;j++) {
        //                System.out.println(i + " * " + j + " = " + (i * j));
        //            }
        //            for (int k = 0; k <= 10; k++) {
        //
        //            }
        //        }
//        int i = 0;
//        while (i <= 10) {
//            while (i >= 5 && i <= 10) {
//                System.out.println("kq" + i);
//                break;
//            }
//            System.out.println(i);
//            i++;
//        }
        // 0 -> 4 kq5, 5, k6, 6 -> kq10, 10

//        boolean kq = false;
//        do {
//            System.out.println("Vào đây");
//            int i = 0;
//            do {
//                System.out.println(i);
//                i++;
//            }while (i < 0);
//        }while (kq == true);


        // for biết trước số lần lặp
        // 0 -> 10
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        // while không biến trước lần lặp VD: đảo ngược số
        // 2345 -> 5432
//        int r = 2345;
//        int result = 0;
//        while (r != 0) {
//            result = result * 10 + r % 10;
//            r /= 10;
//        }
//        System.out.println(result);
        // em sẽ thử connect tới DB cho tới bao giờ được thì thôi
//        boolean result = false;
//
//        while (result != true) {
//            // conect check db
//        }


//        for (int i = 0, k = 12;( i < 10) && (k <= 12); i++, k++) {
//            System.out.println("i" + i);
//            System.out.println("k" + k);
//        }

//        int k = 12;
//        for (;k != 0;) {
//
//            System.out.println(k);
//            k--;
//        }


        for (int i = 2; i <= 5; i++) {
//            if (i == 4) {
//                break;
//            }

            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("END");
    }
}
