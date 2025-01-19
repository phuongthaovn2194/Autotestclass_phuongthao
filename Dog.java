package day4;

public class Dog {
	public static String name;
	public static String age;
	public static String breed;
	public static String color;
	
	public static void getInfo()
	{
		System.out.println("name: "+ name+" ,breed:"+breed+" ,age:"+age+" ,color:"+color);
	}
	public static void main(String [] args){
		Dog beggie = new Dog();
		beggie.name = "cay";
		beggie.breed = "beggie";
		beggie.age = "1";
		beggie.color = "Brown";
		beggie.getInfo();
		
	}

}
