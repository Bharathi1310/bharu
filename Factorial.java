# bharu
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter the integer :");
int num=in.nextInt();
int fact =1;
if(num==0){
fact=fact+1;
System.out.println(fact);
 }
else
{for(int i=1;i<=num;i++){
fact=fact*i;
			  
} System.out.println("the factorial is : "+fact);
}
}

}
