package HW_3;

import com.sun.javafx.runtime.async.AbstractRemoteResource;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random random = new Random();
// Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    /*public static void main(String[] args) {
        game();
    }

    static void game() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Это игра Угадайте число");
        int x = 10; // до какого числа угадать.
        int count = 0;
        int maxCount = 3; // количество попыток
        int number = (int) (Math.random() * x);
        while (true) {
            System.out.println("Угадайте число от 0 до " + x);
            int answer = sc.nextInt();
            if (answer == number) {
                System.out.println("Вы угадали!");
                break;
            } else if (answer < number) {
                System.out.println("Вы ввели число меньше загаданного");
                count++;
            } else if (answer > number) {
                System.out.println("Вы ввели число больше загаданного");
                count++;
            }
            if (count == maxCount) {
                System.out.println("Вы проиграли, попытки закончились");
                break;
            }
        }
        System.out.println("Хочешь сыграть еще?\n" + " ДА \"1\" " + " НЕТ \"0\"");
        if (sc.nextInt() == 1) {
            game();
        }
        sc.close();
    }*/
// * Создать массив из слов
//String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
//При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
// Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//apple – загаданное
//apricot - ответ игрока
//ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//Для сравнения двух слов посимвольно можно пользоваться:
//String str = "apple";
//char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//Играем до тех пор, пока игрок не отгадает слово.
//Используем только маленькие буквы.

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                    "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                    "pear", "pepper", "pineapple", "pumpkin", "potato"};
            int indWord = random.nextInt(words.length - 1);
            String word = words[indWord];
            int lenWord = word.length();
            System.out.println("Игра- отгадай слово");
           // System.out.println(word);
            Scanner scanner = new Scanner(System.in); // вызываем сканнер
            do {
                System.out.println("Для выхода нажми Enter\nВведи свой ответ:"); // спрашиваем ответ у игрока
                String answer = scanner.nextLine();
                if (answer.equals("")) {
                    break; // если отправит пустое сообщение, то игра закончится
                } else if (word.equals(answer)) {
                    System.out.println("Воу, слово угадано!\nПоздравляю!!!");
                    break;
                }
                char[] charsAnswer = answer.toCharArray(); // делаем подсказку если не угадал
                for (int i = 0; i < lenWord; i++) {
                    if (i >= charsAnswer.length) break;
                    if (word.charAt(i) != charsAnswer[i]) charsAnswer[i] = '#';
                }
                StringBuilder comment = new StringBuilder(String.valueOf(charsAnswer));
                for (int i = comment.length(); i < 15; i++) comment.append("#");
                System.out.println(comment);
            }
            while (true);
        }
    }


