package day2;//package name

public class Person {// class name is Person
// Attribute
	private static String name;
	private static String email;
	private static String phoneNumber; 
	static int tuoi;
	
	//Re-format code: Ctrl + shift F || cmd + shift + F
	public static void main(String[] args) {
		// In thông tin của 1 người
		name = "Auto Class thang 12";
		email = "autoClassT12@gmail.com";
		phoneNumber = "+84908909901";
		tuoi = 20; 
		System.out.println(name + " ," + email + " ," + phoneNumber + ", " + tuoi);
	    kiemTraSoChanLe(12344543);
	    inRaSoLonHon(1, -412.5);
	    inRaSoLonHon(1.5,-12543.5);
	    tinhToan(123.56,100,2);
	    
	}

	 public static void kiemTraSoChanLe(int x)// x is parameter
	 {
		 if (x % 2 == 0)
			 System.out.println("So Chan");
		 else
			 System.out.println("So Le");
	 }
	 
	 public static void inRaSoLonHon(int number1, float number2)// number1, number2 is parameter
	 {
		 if (number1>number2)
			 System.out.println("So lon hon la:"+ number1);
		 else
			 System.out.println("So lon hon la:"+ number2);
	 }
	 
	 public static void inRaSoLonHon(double number1, double number2)// number1, number2 is parameter
	 {
		 if (number1< number2)
			 System.out.println("So lon hon la:"+ number1);
		 else
			 System.out.println("So lon hon la:"+ number2); 
	 }
	 
	 public static void tinhToan(double st1, double st2, double st3)
	 {
		 double ketQua = (st1*st2/st3);
		 System.out.println("Ket qua la:"+ ketQua);
		 
		 
	 }
}
