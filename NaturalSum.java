import java.util.Scanner;

public class NaturalSum {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int s=0;
		for(int i=1;i<=N;i++)
			s=s+i;
		System.out.println(s);
			
	}

}
