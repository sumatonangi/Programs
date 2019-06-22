import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int s=0;
		for(int j=0;j<k;j++)
			s=s+a[j];
		System.out.println(s);
	}

}
