import java.util.Scanner;
public class guviAnagrams {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the string");
	String input1=in.nextLine();
	String input2=in.nextLine();
int flag=0;
	for(int i=0;i<input1.length();i++){
	if(input1.length()==input2.length()){
	if(input1.charAt(i)==input2.charAt(i)){
				flag=1;
			//System.out.println("anagrams");
			}
		
		}
	}if(flag==1){
		System.out.println("anagrams");
	}else
	{
		System.out.println("not anagrams");
	}
	
	}

}
