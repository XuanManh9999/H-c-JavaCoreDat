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

# Biến static trong java
+, Biến static được khai báo trong một class với từ khóa static, phía bên ngoài các phương thức, constructor và block.
+, Sẽ chỉ có duy nhất một bản sao của các biến static được tạo ra, dù bạn tạo bao nhiêu đối tượng từ lớp tương ứng.
+, Biến static được lưu trữ trong bộ nhớ static riêng.
+, Biến static được tạo khi chương trình bắt đầu chạy và chỉ bị phá hủy khi chương trình dừng.
+, Giá trị mặc định của biến static phụ thuộc vào kiểu dữ liệu bạn khai báo tương tự biến instance.
+, Biến static được truy cập thông qua tên của class chứa nó, với cú pháp: TenClass.tenBien.
+, Trong class, các phương thức sử dụng biến static bằng cách gọi tên của nó khi phương thức đó cũng được khai báo với từ khóa static.
-- Buổi 2 trong chương 2
# Hàm - Phương thức trong Java
Hàm hay phương thức (method) trong Java là một khối lệnh để thực hiện một hành động cụ thể.
Ví dụ khi chúng ta gọi hàm System.out.println() thì hệ thống sẽ hiện thị dữ liệu của chúng ta truyền vào
Cú pháp:
modifier returnType nameOfMethod (Parameter List) {
// method body
}

Trong đó:

Modifiers: Tạm dịch là phạm vi sửa đổi và truy cập (public, private, protected)
returnType: Là kiểu dữ liệu trả về (int, float, void, boolean...)
nameOfMethod: Là tên của hàm (method) (tên hàm: handleCreateUser)
Parameter là các tham số đầu vào của hàm (có thể có nhiều tham số với nhiều kiểu dữ liệu khác nhau)
method body: là các mã code bên trong hàm

Trước khi chúng ta tìm hiểu về cách gọi hàm thì chúng ta tìm hiểu về các loại hàm. Java có 2 loại hàm, mỗi loại sẽ có cách gọi khác nhau:

+, Hàm có trả về kết quả
+, Hàm không trả về kết quả

Có thể bạn chưa biết

Hàm hoanDoiViTri sẽ không làm ảnh hưởng đến giá trị của của các tham số truyền vào.
Trong một class nếu có 2 method cùng tên và cùng tham số đầu vào thì trình biên dịch sẽ báo lỗi
Thông thường trong một lớp các phương thức nên được khai báo dùng từ khóa public, khác với vùng dữ liệu thường là dùng tiền tố private vì mục đích an toàn.

# Cần nhớ về hàm
+, Khi dùng hàm nếu ta truyền các giá trị kiểu nguyên thuỷ vào đối số của hàm, thì không làm thay đổi giá trị ban đầu
+, Hàm trong lớp thì thường được khai báo dạng public vì thường để đối tượng có thể truy cập 
+, Tính chất orverloading trong java
# Nếu 2 method có cùng tên nhưng khác tham số đầu vào thì đó gọi là method overloading.



# Các toán tử trong Java
        System.out.println(a++);// Tăng a lên 1 và trả về giá trị sau tăng -> a tăng lên một = 6 -> giá trị trước tăng = 5
        System.out.println(a);// 6

        System.out.println(++a); // Tăng a lên 1 đơn vị trước, và trả về giá trị sau khi đã tăng
        System.out.println(a);
+, Kết quả của phép so sánh (>=, <=, !=, ==, >, <): Luôn trả về true, false
+, Phép toán logic gồm (&&, ||, !)


# Các thứ tự ưu tiên khi thực thi
Thứ tự ưu tiên của các phép toán xác định trình tự tính toán giá trị của một biểu thức, java có những quy tắc riêng để xác định trình tự tính toán của biểu thức, ta phải nhớ quy tắc sau:

Các phép toán một ngôi bao giờ cũng được thực hiện trước tiên
Trong một biểu thức có nhiều phép toán thì phép toán nào có độ ưu tiên cao hơn sẽ được thực hiện trước phép toán có độ ưu tiên thấp
Trong một biểu thức có nhiều phép toán có độ ưu tiên ngang nhau thì chúng sẽ được tính theo trình tự từ trái qua phải
Ta có bảng tóm tắt thứ tự ưu tiên của các phép toán trong bảng sau:

+, Nhân chia trước, cộng trừ sau
+, Nếu mà cùng thứ tự ưu tiên VD: Nhân, chia thì nó sẽ đi từ trái qua phai


# Ép kiểu trong Java

+, Ép kiểu trong java là việc gán giá trị của một biến có kiểu dữ liệu này tới biến khác có kiểu dữ liệu khác,
chú ý là trong bài này chỉ nói đến ép kiểu dữ liệu đối với dữ liệu nguyên thủy. Có 2 kiểu ép kiểu (chuyển đổi kiểu) đó là

+, Ép kiểu không tường minh:
  Việc ép kiểu thường được diễn ra một cách tự động trong trường hợp biểu thức gồm 
  nhiều toán hạng có kiểu dữ liệu khác nhau. Điều này đôi khi làm cho bạn khá ngạc nhiên vì nhận được
  một kết quả không theo ý muốn.
VD: int two=2, three=3;

float result= 1.5 + three/two; // out -> 2.5 -> sai

Kết quả nhận được của result là 2.5. Điều mà bạn mong muốn là 3.0 chứ không phải là 2.5. Kết quả 2.5 nhận được
là do three và two là hai giá trị nguyên nên kết quả của phép chia three/two cho ta một giá trị nguyên bằng 1 chứ 
không phải là 1.5. Để nói rằng kết quả của phép chia three/two là một giá trị thực chứ không phải là một giá trị 
nguyên thì một trong hai toán hạng của phép chia này phải là một số thực. Do vậy ta cần phải chuyển kiểu của một
trong hai toán hạng này hoặc cả hai thành số thực. Để nhận được kết quả đúng trong trường hợp này bạn cần viết như sau:

float result=1.5 + (float) three/two; // hoặc
float result=1.5 + three/(float)two; // hoặc
float result=1.5 +(float)three/(float)two;
+, Ép kiểu tường minh

([kiểu dữ liệu muốn chuyển đổi]) [biểu thức];

Khi gặp câu lệnh này java sẽ tính toán giá trị của biểu thức sau đó chuyển đổi kiểu giá trị
của biểu thức thành kiểu kiểu dữ liệu muốn chuyển đổi

(int) 2.5 * 2 = 4
(int) 2.5 * 2.5 = 5
(int)(2.5 * 2.5) = 6
1 + (float) 5 / 2 = 1 + 5 / (float)2 =1 + (float)5 / (float)2 = 3.5

Có thể bạn chưa biết

Phép toán chuyển kiểu là phép toán có độ ưu tiên cao
Cần chú ý khi chuyển một biểu thức kiểu dữ liệu có miền giá trị lớn sang một kiểu có miền giá trị nhỏ hơn. 
Trong trường hợp này có thể bạn sẽ bị mất thông tin.


# Chuyển đổi kiểu dữ liệu trong Java
Chuyển đổi String thành int trong java
int i = Integer.parseInt("200");

Keyword: KiểuDuLieu.parseKieuDuLie(value muốn chuyển đổi)
Ví dụ:
        Integer a = 12;
        // Chuyển về chuỗi
        String s = a.toString();// chuỗi cuỗi
//        System.out.println(s instanceof String);


        String reusltString = String.valueOf(a);
        // Chuyển Số nguyên về số thực
        Float reusltFLoat = Float.parseFloat(s);
        System.out.println(reusltFLoat);
        // Chuyển đồ về Double
        Double resultDouble = Double.parseDouble(String.valueOf(a));
        System.out.println(resultDouble);

Chuyển đổi String thành Date trong java
Chúng ta có thể chuyển đổi String thành Date trong java bằng cách sử dụng phương thức parse()
của các lớp DateFormat và SimpleDateFormat.

public static void main(String[] args) throws Exception {
    String sDate = "17/07/2017";
    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
    System.out.println(sDate + "\t" + date);
}

+, Ngoài các cách chuyển đổi kiểu dữ liệu số học thành String ở trên, java cung cấp toán tử cộng 
+ cũng được sử dụng để chuyển các kiểu số thành String.
VD: 1 + "" = "1"
  Integer kq = 12;
  System.out.println((kq + "") instanceof String);

# Các hàm toán học trong java
Java là một ngôn ngữ lập trình mạnh mẽ không chỉ trong việc xử lý dữ liệu và chuỗi, mà còn 
cung cấp một loạt các hàm toán học phong phú thông qua lớp Math. Lớp này được đặt sẵn trong gói java.lang, 
do đó bạn không cần phải thêm câu lệnh import để sử dụng các hàm toán học này. Hãy cùng điểm qua các hàm toán 
học quan trọng trong Java.
+, Các giá trị cần nhớ:
- E có kq là bằng: 2.7
- PI có kq là bằng: 3.14
- abc(value) -> giá trị tuyệt đối VD: Math.abc(-3.5) => 3.5
- Math.ceil(value) -> dùng để làm tròn lên. VD: Math.ceil(3.1) => 4
- Math.floor(value) -> dùng để làm trong xuống. VDL Math.floor(3.9) -> 3
- Math.round(value) -> hàm làm tròn đều VD: Math.round(3.5) -> 4, Math.round(3.49) -> 3
- Math.floorDiv(-100, 9) -> -12 -> chia một số nguyên cho một số khác và làm tròn kết quả xuống đến số nguyên gần nhất.
- Math.max(...list số, danh sách số) -> tìm số lớn nhất
- Math.min(...list số, danh sách số) -> tìm số bé nhất
- Math.pow(giá trị, số mũ) -> dùng để tính luỹ thừa
- Math.sqrt(giá trị) -> tính căng bậc 2
- Math.random() ->  trả về một số ngẫu nhiên trong khoảng từ 0 (bao gồm) đến 1 (không bao gồm).
# Kiểu dữ liệu rẽ nhánh

+, Trong Java có 2 cấu trúc rẽ nhánh if là dạng khuyết và dạng đủ
=> Dạng if là dạng nó chỉ có mỗi IF không thôi
=> Dạng đầy đủ là dạng mà có cả IF cả else

# Câu lệnh rẽ nhánh nó chỉ vào thực thi 1 nhánh thôi

# Câu lệnh switch-case
switch(biến) {
case giá trị 1:
câu lệnh 1;
câu lệnh 2;
...
break;
case giá trị 2:
câu lệnh 1;
câu lệnh 2;
...
break;
...
case giá trị n:
câu lệnh 1;
câu lệnh 2;
...
break;
}

# Toán tử 3 ngôi    
Toán tử điều kiện là một loại toán tử đặc biệt vì nó gồm ba thành phần cấu thành biểu thức điều kiện, 
hay nói cách khác toán tử điều kiện là toán tử 3 ngôi.

biến kq = Biểu thức logic ? Câu lệnh khi biểu thức trả về true : Câu lệnh khi biểu thức trả về false;
//        String result = gender == "Nam" ? "True" : "False";
//        System.out.println(result);


# Vòng lặp trong Java
Khi chúng ta cần thực hiện một đoạn code một vài lần, điều này có thể được xem như một vòng lặp.

Java có 3 kỹ thuật lặp linh động, bạn có thể sử dụng một trong ba vòng lặp sau:
# Block dùng để thoát khỏi vòng lặp gần nó nhất (hay nói là vòng lặp mà nó đang nằm trong)
+, Vòng lặp for
for (giá trị khởi tạo; điều kiện; bước nhảy) {
    // block
}
+, Vòng lặp while
+, Vòng lặp do…while

Vòng lặp for trong java thường được sử dụng trong trường hợp biết trước số lần lặp, còn nếu số lần lặp không 
cố định thì nên sử dụng vòng lặp while hoặc do while. Trong bài này chúng ta sẽ cùng nhau tìm hiểu về vòng lặp
for trong Java nhé.



Có thể bạn chưa biết
    Nếu ta khai báo biến chạy trong Biểu thức khởi tạo vòng lặp thì sau khi kết thúc, biến chạy tự giải phóng
    Thân của cấu trúc lặp for ta chỉ có thể đặt được duy nhất một lệnh, do vậy để có thể thực hiện nhiều tác vụ trong thân for ta phải bao chúng trong khối lệnh
    Thân vòng lặp for có thể không được thực hiện lần nào
    Các phần Khởi tạo biến chạy, Biểu thức điều kiện, Thay đổi biến chạy có thể khuyết tuy nhiên dấy phẩy dành cho nó vẫn phải có
    Số lần thực hiện Khởi tạo biến chạy là 1 lần
    Số lần thực hiện Biểu thức điều kiện bằng số lần lặp + 1
    Số lần thực hiện Biểu thức điều kiện bằng số lần lặp
    Ta có thể đặt một vài khai báo biến trong phần Khởi tạo biến chạy
    Ta có thể mô tả cấu trúc while thông qua cấu trúc for như sau for(; Biểu thức boolean;) statement;
VD:
for (int i = 0, k = 12;( i < 10) && (k <= 12); i++, k++) {
    System.out.println("i" + i);
    System.out.println("k" + k);
}

int k = 12;
for (;k != 0;) {
   System.out.println(k); 
   k--; 
}


# Từ khóa break và continue
    Bên trong thân của các cấu trúc lặp ta có thể điều khiển luồng thực hiện bằng cách sử dụng lệnh break hoặc continue. 
    Từ khóa break trong java dùng để thoát một vòng lặp, từ khóa continue được dùng để bỏ tiếp tục vòng lặp.
# Tóm lại lệnh break sẽ thoát khỏi vòng lặp mà nó nằm trong đó (lưu ý nếu có nhiều vòng lặp thì nó chỉ thoát 1 vòng)
# continue thì hiểu đơn giản là khi vòng lặp chạy đến continue thì nó sẽ bỏ qua các câu lệnh nằm bên dưới nó, và nó sẽ
# chuyên đến phần bước nhảy và điều kiện luôn



# Chuỗi trong Java (được lưu trong vùng nhớ heap )
    String là một chuỗi các ký tự kết hợp lại. Ví dụ "thaycacac" là một chuỗi gồm 9 ký tự 't', 'h', 'a', 'y', 'c', 'a', 'c', 'a', 'c' kết hợp lại.
    String trong java là một object immutable, nghĩa là bạn không thể thay đổi giá trị của String khi nó đã được khởi tạo.

    Khởi tạo String trong java
    Trong java chúng ta có 2 cách để tạo một chuỗi
    
    Chuỗi ký tự
    Sử dụng từ khoá new

    Sau khi khởi tạo string1 thì chuỗi "Thaycacac" sẽ được lưu vào vùng nhớ heap tại string pool. Đến khi khởi 
    tạo khởi string2, việc đầu tiên là tìm kiếm trong string2, nếu đã có chuỗi tương tự thì sẽ không cần khởi tạo 
    thêm mà gán thẳng cho string2, nếu không thì mới bắt đầu khởi tạo.

# Các hàm thường sử dụng của String
+, length(): Trả về số lượng ký tự trong chuỗi
+, substring(int begin, int end): Trả về chuỗi con từ vị trí begin đến end + 1
+, concat(String s): Nối chuối s vào cuối chuỗi # name.concat("Nguyễn Xuân Mạnh")
+, indexOf(String str, int fromIndex): Trả về vị trí xuất hiện đầu tiên của str bắt đầu từ vị trí
+, lastIndexOf(String str): Trả về vị trí xuất hiện cuối cùng của str
+, boolean equals(Object obj): So sánh với string obj
+, boolean equalsIgnoreCase(String str): So sánh với chuỗi str, bỏ
+, String toLowerCase(): Chuyển tất cả các ký tự thành ký tự thường.
+, String toUpperCase(): Chuyển tất cả các ký tự thành ký tự hoa
+, String trim(): Xoá các khoảng trắng ở đầu và cuối chuỗi
+, String replace(char old, char new): thay thế các ký tự old thành new