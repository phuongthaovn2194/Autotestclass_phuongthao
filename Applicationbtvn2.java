package day5_BTVN_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Applicationbtvn2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> devList = new ArrayList<>();
        ArrayList<Employee> testList = new ArrayList<>();
        ArrayList<Employee> baList = new ArrayList<>();

        while (true) {
            System.out.println("Nhap phong ban (1 - Dev, 2 - Test, 3 - BA, 0 - Thoat):");
            int phongBan = scanner.nextInt();
            scanner.nextLine(); 

            switch (phongBan) {
                case 1:
                    System.out.println("Nhap so luong nhan vien phong ban Dev:");
                    int soLuongDev = scanner.nextInt();
                    scanner.nextLine(); 

                    for (int i = 0; i < soLuongDev; i++) {
                        System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
                        System.out.print("Ho ten: ");
                        String hoTen = scanner.nextLine();
                        System.out.print("Ma NV: ");
                        String maNV = scanner.nextLine();
                        System.out.print("SDT: ");
                        String sdt = scanner.nextLine();
                        devList.add(new Employee(hoTen, maNV, sdt));
                    }

                    System.out.println("Danh sach nhan vien phong ban Dev:");
                    for (Employee emp : devList) {
                        System.out.println(emp);
                    }
                    break;

                case 2:
                    System.out.println("Nhap so luong nhan vien phong ban Test:");
                    int soLuongTest = scanner.nextInt();
                    scanner.nextLine(); 

                    for (int i = 0; i < soLuongTest; i++) {
                        System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
                        System.out.print("Ho ten: ");
                        String hoTen = scanner.nextLine();
                        System.out.print("Ma NV: ");
                        String maNV = scanner.nextLine();
                        System.out.print("SDT: ");
                        String sdt = scanner.nextLine();
                        testList.add(new Employee(hoTen, maNV, sdt));
                    }

                    System.out.println("Danh sach nhan vien phong ban Test:");
                    for (Employee emp : testList) {
                        System.out.println(emp);
                    }
                    break;

                case 3:
                    System.out.println("Nhap so luong nhan vien phong ban BA:");
                    int soLuongBA = scanner.nextInt();
                    scanner.nextLine(); 

                    for (int i = 0; i < soLuongBA; i++) {
                        System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
                        System.out.print("Ho ten: ");
                        String hoTen = scanner.nextLine();
                        System.out.print("Ma NV: ");
                        String maNV = scanner.nextLine();
                        System.out.print("SDT: ");
                        String sdt = scanner.nextLine();
                        baList.add(new Employee(hoTen, maNV, sdt));
                    }

                    System.out.println("Danh sach nhan vien phong ban BA:");
                    for (Employee emp : baList) {
                        System.out.println(emp);
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Thong tin khong hop le.");
                    break;
            }
        }
    }

}
