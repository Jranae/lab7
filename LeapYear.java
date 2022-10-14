import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		//if year is divisible by 4 AND not divisible by 100
		//OR if year us divisible by 400
		//then it is a leap year
		if ((year%4==0 && year%100 != 0) || year%400==0)
		{
			System.out.println("it's a leap year");
		}
		else 
		{
			System.out.println("It's not a leap year");
		}
		
	}

}
