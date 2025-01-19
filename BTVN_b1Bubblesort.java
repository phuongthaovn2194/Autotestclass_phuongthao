package day3;

public class BTVN_b1Bubblesort {

	public static void main(String[] args) {
		int []Arr= {2,15,26,22,78,1,46,725,5};
		sapXepTangDan(Arr);
		sapXepGiamDan(Arr);
		inMang(Arr);
	
		}
	
	public static void sapXepTangDan(int[] Arr) {
		int tmp;
		for (int i = 0;i<Arr.length;i++)
			for(int j=0; j<Arr.length-1; j++) {
				if(Arr[j]>Arr[j+1])
				{
					tmp = Arr[j+1];
					Arr[j+1]=Arr[j];
					Arr[j]= tmp;			
				}
			}
	}
	
	public static void inMang(int[] Arr) {
		for(int i=0; i<Arr.length;i++)
			System.out.print(Arr[i] +" ");
		
	}
	
	 public static void sapXepGiamDan(int[] Arr) {
	        int tmp;
	        for (int i = 0; i < Arr.length; i++) {
	            for (int j = 0; j < Arr.length - 1; j++) {
	                if (Arr[j] < Arr[j + 1]) { // Đổi dấu so sánh ">" thành "<"
	                    tmp = Arr[j + 1];
	                    Arr[j + 1] = Arr[j];
	                    Arr[j] = tmp;
	                }
	            }
	        }
	    }

	    public static void inMang(int[] Arr) {
	        for (int i = 0; i < Arr.length; i++) {
	            System.out.print(Arr[i] + " ");
	        }
	    }

}
