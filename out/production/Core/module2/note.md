// lỗi
//import module2.package01.Abc;
//import module2.package02.Abc;

//import module2.java.utils.Scanner;
//import module2.java.utils.HandleMath;

// hiểu là em import tất các những gì (class, interface..) nằm trong gói utils
import module2.java.utils.*;


        System.out.println("\uD83E\uDD23");
        System.out.println("❤️");
         bảng mã Unicode
      Java được xây dựng trên bảng chữ cái Unicode, một hệ thống mã hóa quốc tế bao gồm hầu hết các ngôn ngữ và biểu
      tượng trên thế giới. Điều này cho phép ngôn ngữ Java hỗ trợ nhiều ngôn ngữ và ký tự đặc biệt.
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j <= 10; j++) {
                if (i >=  1) {
                    break;
                }
                System.out.println("j: " + j );
            }
        }

        int a = 1;// định danh a
        int b = 2;// định danh b

         Quy tắc định danh trong java
        Trong java tên được đặt theo quy tắc sau:
            Không trùng với từ khoá VD: int int  = 1; tên biến int trùng từ khoá
            Không bắt đầu bằng một số, tên phải bắt đầu bằng kí tự hoặc bắt đầu bằng kí tự $,_
            Không chứa dấu cách, các kí tự toán học như +, -, *,/, %..
            Không trùng với một định danh khác trong cùng một phạm vi

        int 123 = 1;
        int 1a = 2;
        int $_1 = 1;
        int _1 = 1;
        int a*b  = 1;

        String b = "a";
        int b = 2;

         khuyên dùng khi định danh trong java
        Tên nên đặt sao cho có thể mô tả được đối tượng trong thực tế
        Java có phân biệt chữ hoa chữ thường
        Trong java ta có thể đặt tên với độ dài tuỳ ý
        Ta có thể sử dụng các kí tự tiếng việt để đặt tên
        int mạnh = 12;
        System.out.println(mạnh);

        String product = "Bim bim";
        String Product = "Kẹo mút";

        Đối với biến và phương thức thì tên bao giờ cũng bắt đầu bằng ký tự thường, nếu tên có nhiều từ thì ghép lại thì: ghép tất cả các từ thành một, ghi từ đầu tiên chữ thường,
        viết hoa kí tự đầu tiên của mỗi từ theo sau trong tên, ví dụ area, radius, readInteger, …
        Đối với tên lớp, giao diện (interface) ta viết hoa các kí tự đầu tiên của mỗi từ trong tên, ví dụ lớp WhileTest, Circle
        Tên hằng bao giờ cũng viết hoa, nếu tên gồm nhiều từ thì chúng được nối với hau bởi kí tự gạch dưới ‘_’, ví dụ PI, MAX_VALUE;

        int a = 1;
        final float PI = 3.13F;
             Khối lệnh trong java {} được sử dụng để tạo phạm vi cục bộ (local scope). Phạm vi cục bộ nghĩa là các biến hãy
         các giá trị khác nếu được định nghĩa trong khối lệnh thì sẽ chỉ được sử dụng bên trong khối lệnh đó


    
# Packge là gì?
- Có 2 loại package là:
+, Package có sẵn
+, package tự xây dựng
- Package là một gói chứa các class, interface, abclass...
- Ưu điểm package là:
+, Tổ chức mã nguồn một cách có logic và quản lý dễ dàng
+, Cho phép đặt tên các class trùng nhau miễn là khác package
+, Tăng khả năng tái sử dụng code bằng từ khoá import

# Ví dụ sử dụng khi package trùng tên nhưng khác gói
  module2.package01.Abc.sayHello();
  module2.package02.Abc.sayHello();
# Import * => import tất cả các class, interface.. nằm bên trong gói đó
import module.*
  Scanner.sayHelloScanner();
  HandleMath.HanleStaticWeb();

# Nhập xuất trong Java
 Lớp Scanner cung cấp nhiều chức năng cho việc đọc dữ liệu từ màn hình console và có thể phân loại dữ liệu theo các kiểu khác nhau 
như số nguyên, số thực, chuỗi, và nhiều loại khác.
# Sử dụng lớp Scanner:
+, scanner.nextInt(): Hàm giúp nhập vào số nguyên
+, scanner.nextFloat(): Hàm này giúp nhập vào số thực
+, scanner.nextDouble(): Hàm này giúp nhập vào số thực lớn
+, scanner.nextLine(): Hàm này giúp nhập vào 1 chuỗi
+, scanner.nextLong(): Hàm này giúp nhập vào số nguyên lớn
+, scanner.nextBoolean: Hàm này giúp nhập vào số boolean
+, scanner.nextByte(): Hàm này nhập vào byte
# Về đọc thêm
....

#Comment trong Java
+, Comment trên 1 dòng: VD: // int a = 1; Thường ít sử dụng, chủ yếu được được sử dụng để debug, và mô tả ngắn cho các biến phức tạp
+, Comment trên nhiều dòng // /****/; Sử dụng rất nhiều trong thực tế, và nó dùng để viết mô tả lớp, tài liệu..

# Các kiểu dữ liệu trong Java
Java có 2 loại kiểu dữ liệu:
- Các kiểu dữ liệu nguyên thủy (Primitive Data Types)
  Có 8 kiểu dữ liệu nguyên thủy (Primitive Data type) đó là: boolean, byte, char, short, int, long, float, double. 
  * Đặc điểm của các biến có kiểu nguyên thủy là vùng nhớ của chúng được cấp phát ở phần stack. Do vậy việc truy xuất vào một biến kiểu nguyên 
  * thủy rất nhanh.
// Với kiểu nguyên thuỷ dữ liệu mặc định của số nguyên là: 0; số thực là: 0.0; boolƯean: false
- Các kiểu dữ liệu tham chiếu (Reference Types
  Trong Java có 3 kiểu dữ liệu tham chiếu:
+, Mảng (Array): Tập hợp các dữ liệu cùng kiểu.
+, Lớp (Class): Là sự cài đặt mô tả về một đối tượng trong bài toán.
+, Giao diện (Interface): Là một lớp thuần trừu tượng được tạo ra cho phép cài đặt đa thừa kế trong Java.
  Đặc điểm của các biến kiểu tham chiếu là nó chứa địa chỉ của đối tượng mà nó trỏ đến.

Vùng nhớ của biến tham chiếu được cấp phát ở vùng nhớ stack còn vùng nhớ của đối tượng được cấp phát ở vùng nhớ heap. 
Việc truy xất vào vùng nhớ heap chậm hơn truy xất vào vùng nhớ stack tuy nhiên java có cơ chế cho phép truy cập vào vùng nhớ
heap với tốc độ xấp xỉ bằng tốc độ truy cập vào vùng nhớ stack.

Note:
+, byte, short khi thực hiện nó được máy ảo conver về int
+, 2.2 -> mặc định là double. Để biều diễn số float ta thêm f đằng sau VD: 2.2f
+, Trong java 0 -> không phải là false, 1 -> không phải là true

# Biến và phạm vi của biến

Trong java, biến là một liên kết tới một vị trí trên bộ nhớ (memory) để chứa dữ liệu. Có 3 kiểu biến trong java, bao gồm biến cục bộ 
(hay còn gọi là biến local), biến toàn cục (biến instance) và biến tĩnh(biến static).
Giá trị trên bộ nhớ mà biến liên kết tới chính là giá trị của biến.
Kiểu dữ liệu của biến cũng chính là kiểu dữ liệu lưu trên bộ nhớ đó.

=> Phạm vi của biến trong Java
+, Local: Là biến được khai báo nằm bên trong phương thức, hàm. Nó khởi tạo khi dùng hàm đó và sẽ xoá đi khỏi bộ nhớ khi kết thúc hàm
+, Biến cục bộ được tạo bên trong các phương thức, constructor, block và sẽ bị phá hủy khi kết thúc các phương thức, constructor và block.
+, Các biến cục bộ sẽ nằm trên vùng bộ nhớ stack của bộ nhớ.
+, Bạn cần khởi tạo giá trị mặc định cho biến cục bộ trước khi có thể sử dụng.
+, Không được sử dụng access modifier khi khai báo biến cục bộ.
+, Ta có thể sử dụng được biện cục bộ trong phạm vi của khôi block đó, hoặc các khối block bên trong nó


# Biến biến instance (biến toàn cục) trong java

+, Biến instance được khai báo trong một lớp(class), bên ngoài các phương thức, constructor và các block.
+, Biến instance được lưu trong bộ nhớ heap.
+, Biến instance được tạo khi một đối tượng được tạo bằng việc sử dụng từ khóa new và sẽ bị phá hủy khi đối tượng bị phá hủy.
+, Biến instance có thể được sử dụng bởi các phương thức, constructor, block, ... Nhưng nó phải được sử dụng thông qua một đối tượng cụ thể.
+, Biến instance có giá trị mặc định phụ thuộc vào kiểu dữ liệu của nó.
+, Bên trong class mà bạn khai báo biến instance, bạn có thể gọi nó trực tiếp bằng tên khi sử dụng ở khắp nơi bên trong class đó.
+, Bạn được phép sử dụng access modifier khi khai báo biến instance, mặc định là default.