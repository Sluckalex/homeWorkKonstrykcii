import java.util.Scanner;

public class chetnoechislo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int chislo = sc.nextInt();
        if ( chislo % 2 == 0)
            System.out.println("Число четное !");
        else
        System.out.println("Число не четное !");
        }
    }


