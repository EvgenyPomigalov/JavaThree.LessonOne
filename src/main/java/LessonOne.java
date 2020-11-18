import java.util.ArrayList;
import java.util.Arrays;

public class LessonOne {
    public static void main(String[] args) {
        //Задание 1
        String[] strArr = {"one", "two", "three"};
        System.out.println("Исходный массив: " + Arrays.toString(strArr));
        changePlace(strArr, 0, 2);
        System.out.println("Конечный массив: " + Arrays.toString(strArr));
        //Задание 2
        System.out.println(arrayToArrayList(strArr).getClass().getName());
        System.out.println(arrayToArrayList(strArr));
        //Задание 3
        Orange orange1 = new Orange(); //создаем апельсин
        Apple apple1 = new Apple();    //создаем яблоко
        Box box1 = new Box();          //создаем яблоко
        box1.addFruit(orange1, 3); //Добавляем в коробку 3 апельсина
        box1.addFruit(apple1, 3);   //Добавляем в коробку 3 яблока
        box1.addFruit(orange1, 3);
        Box box2 = new Box();
        box2.addFruit(apple1, 3);
        box2.addFruit(orange1, 3);
        box2.addFruit(apple1, 6);
        //Выводим вес коробок
        System.out.println(box1.getWeigth());
        System.out.println(box2.getWeigth());
        //Сравниваем коробки
        System.out.println(box1.compareWeigth(box2));
        Box box3 = new Box();
        box3.addFruit(apple1, 3);
        box3.addFruit(orange1, 3);
        box3.addFruit(apple1, 6);
        //Пересыпаем
        box2.toOther(box3);
        System.out.println(box3.getWeigth());
        System.out.println(box2.getWeigth());
        box2.addFruit(orange1, 3);
        System.out.println(box2.getWeigth());
    }
    private static void changePlace(Object arr[], int firstPosition, int secondPosition) {
        try {
            Object tempObj = arr[firstPosition];
            arr[firstPosition] = arr[secondPosition];
            arr[secondPosition] = tempObj;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
    private static <Type> ArrayList <Type> arrayToArrayList(Type[] arr){
       return new ArrayList<Type>(Arrays.asList(arr));
    }

}
