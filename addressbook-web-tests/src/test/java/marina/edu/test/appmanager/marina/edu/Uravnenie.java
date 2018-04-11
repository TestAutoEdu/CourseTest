package marina.edu.test.appmanager.marina.edu;

import java.util.Scanner;

public class Uravnenie {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        int a = in.nextInt();
        System.out.print("Введите значение b: ");
        int b = in.nextInt();
        System.out.print("Введите значение c: ");
        int c = in.nextInt();
        int d = b * b - 4 * a * c;
        if (d <= 0) {
            if (d == 0) {
                System.out.println("Уравнение имеет одно решение!");
            }
            ;
            if (d < 0) {
                System.out.println("Уравнение не имеет решений!");
            } else if (d > 0) {
                System.out.println("Уравнение имеет два решения!");
            }


        }
    }
}
