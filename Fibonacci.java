import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {
        int a=0,b=1,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of terms");
        int n=sc.nextInt();
        System.out.print(+a+" "+b );
        for(int i=1;i<n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
    
}
