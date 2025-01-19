package day3;

public class thucHanhloopfor {

	public static void main(String[] args) {
        int sum = 0;
        
        // In các số chẵn từ 0 đến 100
        System.out.println("Các số chẵn từ 0 đến 100:");
        for (int i = 0; i <= 100; i = i + 2 ) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i; // Cộng dồn tổng
            }
        }

        // In tổng các số chẵn
        System.out.println("\nTổng của các số chẵn từ 0 đến 100 là: " + sum);

	}

}
