import java.util.Scanner;

public class pora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру на улице:");
        int temperature = sc.nextInt();
        if (temperature > - 5) {
            System.out.println("Тепло");
        }else if (temperature <= - 5 && temperature > - 20) {
            System.out.println("Нормально");
        }else if (temperature <= - 20 ) {
            System.out.println("Холодно");
        }else{
            System.out.println("Не знаю.");
    }
    }
}
