import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Satır Sayısını Giriniz");
        n = input.nextInt();
        for (int i=n; i >= 1; i--){
            for (int space = 0;space < (n-i); space++){
                System.out.print(" ");
            }for ( int star = (2*i-1);star > 0;star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}