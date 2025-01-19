package day4;

public class Motobike {
	public static String hangXe;
	public static String mauXe;
	public static String bienSo;
	
	public static void getinfo()
	{
		System.out.println("Hang xe: "+hangXe +" ,Mau xe: "+ mauXe + ",Bien so xe:"+bienSo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motobike lead = new Motobike();
		lead.hangXe = "Honda";
		lead.mauXe = "Sliver";
		lead.bienSo = "A24-21";
		lead.getinfo();	
	}

}
