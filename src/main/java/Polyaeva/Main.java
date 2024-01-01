package Polyaeva;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        Logger logger = Logger.getInstance();
        //...
        Scanner scan = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log(" Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        int n = scan.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int m = scan.nextInt();
        logger.log("Создаём и  список");
        ArrayList<Integer> source = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            source.add(i, random.nextInt(m));
        }
        System.out.println("Вот случайный список:" + source);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int threshold = scan.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(threshold);
        List<Integer> result = filter.filterOut(source);
        logger.log("Прошло фильтр " + result.size() + " элемента из " + n);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу ");
    }
}