
public class Square {

	public static void main(String[] args) {
	 int a[]={1,2,3,4};
	 int b;
	 int c;
	 int e=0;
	 int f=0;
	 for(int i=0;i<4;i=i+2){

	b=(int)Math.pow(a[i],3);
     e+=b;
	}System.out.println(e);	 

     for(int i=a.length-1;i>0;i=i-2){
    	c=(int)Math.pow(a[i],2);
    	f+=c;
  
     }
     System.out.println(f);
}}
