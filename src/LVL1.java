import java.util.Scanner;
//Решение задач https://code.mu/ru/java/tasker/stager/1/1/
public class LVL1 {
    public static void main(String[] args) {
        //Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.
        //TODO Write you code here
        while (true) {
        System.out.println("Введите число: ");
        int number = new Scanner(System.in).nextInt();
            if (number == 0) {
                System.out.println("Завершение программы!");
                break;
            }
        if (number<0) {
            System.out.println("Вы ввели отрицательное число");
        } else System.out.println("Вы ввели положительное число");

        }
//Дана строка. Выведите в консоль длину этой строки.
        //TODO Write you code here
        while (true) {
            System.out.println("Введите строку: ");
            String string = new Scanner(System.in).nextLine();
            if (string.equalsIgnoreCase("stop")) {
                System.out.println("Программа завершена!");
                break;
            }
            System.out.println("Длина строки - " + string.length() + " символов");
        }
    }
}
