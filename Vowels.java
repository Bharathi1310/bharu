import java.util.Scanner;
public class Vowels {
public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
    System.out.println("enter the string : ");
    String b=in.nextLine();
    StringBuffer s=new StringBuffer(b);
    StringBuffer s1=s.reverse();
    String s2=s1.toString();
    System.out.println(s2);
    String s3="";
     for(int i=0;i<s2.length();i++){
    	  char ch=s2.charAt(i);
   if(!(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')){
    s3+=String.valueOf(ch);
    }
   }System.out.println(s3);
   }}
