package day3;
import java.util.Scanner;

public class BTVH_day3b2 {
	
	   public static void main(String[] args) {
	            timSoThoaMan(20);
	        }
	    public static void timSoThoaMan(int n) {
	        Scanner myObj = new Scanner(System.in); // Tạo đối tượng Scanner để nhập liệu
	        for (int i = 1; i <= n; i++) {
	            System.out.print("Nhap so thu " + i + " : ");
	            int number = myObj.nextInt(); // Nhập số từ bàn phím
	            
	            // Kiểm tra điều kiện số chia hết cho cả 2 và 3
	            if (number % 2 == 0 && number % 3 == 0) {
	                System.out.println("So thoa man la: " + number);
	                myObj.close(); // Đóng Scanner
	                return; // Thoát chương trình
	            }
	        }

	        // Nếu vòng lặp kết thúc mà không tìm thấy số thỏa mãn
	        System.out.println("Khong co so thoa man");
	        myObj.close(); // Đóng Scanner
	    }
	}