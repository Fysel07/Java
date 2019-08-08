import java.util.Scanner;
class PrintAstrich{
public static void main(String[] fdf){
Scanner scan=new Scanner (System.in);
int N=scan.nextInt();
for(int a=1;a<=N;a++){
for(int b=1;b<=a;b++){
System.out.print('*');
}
for(int c=a+1;c<=N;c++){
System.out.print(" ");
}
System.out.print("\n");
}
}}

