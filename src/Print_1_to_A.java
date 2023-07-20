import java.util.Scanner;

public class Print_1_to_A {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Ath value !!");

        int A=scanner.nextInt();
        print(1,A);
    }

    private static void print(int i, int A) {
        if(i>A){
            return;
        }
        System.out.print(i+" ");
        print(i+1,A);
        if(i==A){
            System.out.println("");
        }
    }
}