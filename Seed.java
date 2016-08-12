import java.util.Scanner;
public class Seed {
public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the integer");
		int n=in.nextInt();
		int mod;
		int mul=1;
		int temp=n;
		while(n!=0){
			mod=n%10;
			mul=mul*temp*mod;
			 //System.out.println(mul);
			n=n/10;
			temp=1;
		}
       System.out.println(mul);
	}

}
