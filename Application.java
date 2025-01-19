package day5_BTVN_1;

public class Application {
	public static void main(String[] args) {
        
        HinhTron hinhTron = new HinhTron(5); 
        hinhTron.setTenHinh("Hinh Tron");

        
        HinhChuNhat hinhChuNhat = new HinhChuNhat(4, 6); 
        hinhChuNhat.setTenHinh("Hinh Chu Nhat");

        System.out.println("Ten hinh: " + hinhTron.getTenHinh());
        hinhTron.tinhDienTich();

        System.out.println("Ten hinh: " + hinhChuNhat.getTenHinh());
        hinhChuNhat.tinhDienTich();
    }
}
