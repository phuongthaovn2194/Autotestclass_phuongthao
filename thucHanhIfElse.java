package day3;

import java.util.Scanner;

public class thucHanhIfElse {

	public static void main(String[] args) {
		kiemTraChanLe();
		timSoLonHon();

	}
	
	public static void kiemTraChanLe() {	//Bài tập 2
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số bất kỳ:");
		int number = sc.nextInt();
		if(number % 2==0) 
			result="Số chẵn";
		else 
			result ="số lẻ";
		
		result = (number%2==0)?"Số chẵn":"số lẻ";
		System.out.println(result);		
	}
	public static void timSoLonHon() {
		int st1, st2;
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập vào số thứ nhất: ");
		st1 = sc.nextInt();
		System.out.println("Nhập vào số thứ hai: ");
		st2 = sc.nextInt();
		int result = (st1>st2)? st1:st2;
		System.out.println("Số lớn hơn là: "+ result);
	
	}
}
