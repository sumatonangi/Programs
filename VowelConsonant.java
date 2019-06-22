import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			System.out.println("Vowel");
		else if(c=='b'||c=='c'||c=='d'||c=='e'||c=='f'||c=='g'||c=='g'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z')
			System.out.println("Consonant");
		else 
			System.out.println("invalid");

	}

}
