public class PlusPattern{
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(i==5)System.out.print("+");
                else System.out.print(" ");
                if(j==5)System.out.print("+");
                
            }
            System.out.println();
        }
    }
}