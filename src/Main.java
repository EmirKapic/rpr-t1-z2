import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.print("Unesite n: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Brojevi koji su djeljivi sumom cifara su: ");
        for (int i = 1; i < n; ++i){ //ovdje mozda <= n?
            if (i % sumaCifara(i) == 0){
                System.out.println(i);
            }
        }
    }
    static int sumaCifara(int n){
        int suma = 0;
        while (n != 0){
            suma += n % 10;
            n /= 10;
        }
        return suma;
    }
}