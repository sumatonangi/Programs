import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%4==0)
			if(a%400==0 || a%100!=0)
				System.out.println("yes");
			
		else
			System.out.println("no");
	}

}
