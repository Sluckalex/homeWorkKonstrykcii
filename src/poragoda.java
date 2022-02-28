import java.util.Scanner;

public class poragoda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца:");
        int month = sc.nextInt();

        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Зима");
        }
        else if (month == 3 || month == 4 || month == 5 ){
            System.out.println("Весна!");
        }
        else if (month == 6 || month == 7 || month == 8 || month == 9){
            System.out.println("Лето");
        }
        else if (month == 10 || month == 11 ){
            System.out.println("Осень");
        }
        else {
            System.out.println("Непонятно");
        }
}
}
