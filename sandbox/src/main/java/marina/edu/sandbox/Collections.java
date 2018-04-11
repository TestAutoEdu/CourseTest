package marina.edu.sandbox;

import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        // String[] langs = new String[4];//Квадратные скобки указывают на то, что это массив. Число 4 в скобках определяет размер массива.
        String[] langs = {"Java", "C#", "Python", "PHP"};
        /** langs[0] = "Java";//Нумерация элементов массива начинается с 0, строка выше заменяет эти строки
         langs[1] = "C#";
         langs[2] = "Python";
         langs[3] = "PHP"; **/

        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP"); //инициализация списка


        /** for (int i = 0; i < langs.length; i++) { //langs.length - получаем длину массива (количество элементов)
         System.out.println("Я хочу выучить " + langs[i]); **/
        for (String l : languages) { //Переменная l последовательно указывает на все элементы коллекции, эти 2 строки заменяют цикл выше
         System.out.println("Я хочу выучить " + l);

        /**for (int i = 0; i < languages.size(); i++) {
            System.out.println("Я хочу выучить " + languages.get(i)); **/
        }
    }
}
