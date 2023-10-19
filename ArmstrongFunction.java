import java.util.Scanner;

public class ArmstrongFunction {
    static int count(int num) {
        int c = 0;
        int temp = num;  
        while (temp != 0) {
            temp /= 10;
            c++;
        }
        return c;
    }

    static int pow(int x, int y) {
        int s = 1;
        for (int i = 1; i <= y; i++) {
            s *= x; 
        }
        return s;
    }

    static int isArmstrong(int num) {
        int dupli = num;
        int len = count(dupli);
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += pow(rem, len);
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int result = isArmstrong(num);  
        System.out.println("Count: " + count(num));
        System.out.println("Result: " + result);
        if (result == num) {  
            System.out.println("It's Armstrong");
        } else {
            System.out.println("It's not Armstrong");
        }
        sc.close();
    }
}
