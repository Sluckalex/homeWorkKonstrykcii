import java.util.Scanner;

public class raduga {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число от 1 до 7:");
            int color = sc.nextInt();
            if (color == 1) {
                System.out.println("Красный");
            }else if (color == 2) {
                System.out.println("Белый");
            }else if (color == 3) {
                System.out.println("Синий");
            }else if (color == 4) {
                System.out.println("Зеленый");
            }else if (color == 5) {
                System.out.println("Желтый");
            }else if (color == 6) {
                System.out.println("Коричневый");
            }else{
                System.out.println("Введи число от 1 до 7");
            }
        }
    }
