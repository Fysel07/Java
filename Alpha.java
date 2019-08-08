import java.util.Scanner;
class CheckAlpha{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
char ch=scan.next().charAt(0);
if(ch>64&&ch<91)
System.out.println("Alpha");
else
System.out.println("no");
}
}  
