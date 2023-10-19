import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("a="+num1+"b="+num2);
        num2=num1+num2;
        num1=num1-num2;
        num2=num1-num2;
        System.out.println("a="+num1+"b="+num2);
        sc.close();

    }
}
