import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Запрашиваем у пользователя ввод числа N (где 9<N<100)
        int userNumber = userInput.userInputValidation();

        // Создаем и заполняем одномерный массив длиной N случайными числами из диапазона [10..99] и выводим в консоль
        int[] array = createArray.createArrayAndFill(userNumber);

        // Выводит в консоль все элементы массива, встречающиеся в нем только один раз и количество таких элементов
        checkIFNumberRepeat.arrayToSet(array);


    }
}