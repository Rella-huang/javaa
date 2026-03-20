package prac1;
import java.util.Scanner;
public class prac1{
public static void main(String[] args){
    Scanner scn= new Scanner(System.in);
    int n;
    int num;
    int total=0;
    System.out.printf("輸入一正整數n");
    n=scn.nextInt();

    for(num=0;num<=n;num++){
        
        if(num%3==0||num%5==0){
           
        	if(num%7==0){
                continue;
        	}
        	 total+=num;
        	 System.out.println(num);
        }
        }
    System.out.printf("總和=%d",total);
}
}