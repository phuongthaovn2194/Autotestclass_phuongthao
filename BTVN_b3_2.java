package day3;
import java.util.Scanner;

public class BTVN_b3_2 {
	public static void main(String[] args) {
		  timGiaTriLonNhat(); 
    }

    public static float[] nhapSoThapPhan() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhập số lượng số thập phân: ");
            int num = sc.nextInt(); 
            float[] arr = new float[num];
            for (int i = 0; i < num; i++) {
                System.out.print("Số thứ " + i + ": ");
                arr[i] = sc.nextFloat(); 
            }
            return arr;
        }
    }

    public static void timGiaTriLonNhat() {
        float[] arr = nhapSoThapPhan();
        float max = arr[0]; 
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] > max) { 
                max = arr[i]; 
            }
        }
        System.out.println("Số lớn nhất: " + max);
    }
}


