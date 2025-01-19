package day2;

public class BTVH_b2 {

	public static void main(String[] args) {
        // Khởi tạo mảng
        int arr[] = {1, 4, 352, 52134, 231, 312, 123};

        // Tính tổng
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        // In kết quả
        System.out.println("Tổng các giá trị trong mảng là: " + sum);
    }
}
