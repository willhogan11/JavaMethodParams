package gmit;
import java.util.Scanner;
import gmit.Person;

public class methodExamples {
	private static String name;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Person user = new Person();
		try{
			System.out.println("Enter Your Name: "); 
			user.setName(name);
			String name = input.nextLine();
			System.out.println(Hello(name));
		
		}catch(Exception e){
			e.printStackTrace();
		}
	} // End main

	public static String Hello(String name){
		if(name.equals("Will Hogan")){
			return "Welcome Will Hogan";
		}
		else{
			return "You are not a Valid User";
		}
	}// End Hello method
}
