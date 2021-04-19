package ListsWork;

import java.util.*;

public class MainApp
{
    public static final int NUMBER_ARRAYS_ELEMENTS = 150;
    public static int counter1;
    public static long curTime;
    static Random random = new Random();

    public static void main(String[] args)
    {
        System.out.println("\nДомашнее задание №3 студента университета GeekBrains Хахалина Андрея Владимировича");

        //region Решение задания 3.1
        /*
        Задание 3.1
        На основе массива из домашнего задания 2.1 реализуйте простой список и коллекцию.
        Оцените время выполнения преобразования.
        */
        System.out.println("РЕШЕНИЕ ЗАДАНИЯ 3.1\n");
        List<Integer> arrList1 = new ArrayList<>();
        ArrayList<String> arrList_String = new ArrayList<>();
        ArrayList<Object_int> arrList_Object_int = new ArrayList<>();

        curTime = System.nanoTime();
        for (counter1 = 0; counter1 < NUMBER_ARRAYS_ELEMENTS; counter1++)
        {
            arrList1.add(random.nextInt(NUMBER_ARRAYS_ELEMENTS));
        }
        System.out.println("Сформирован список из " + NUMBER_ARRAYS_ELEMENTS + " элементов типа Integer за " + (System.nanoTime() - curTime) + " нс:\n" + arrList1);

        curTime = System.nanoTime();
        for (counter1 = 0; counter1 < NUMBER_ARRAYS_ELEMENTS; counter1++)
        {
            arrList_String.add(String.valueOf(random.nextInt(NUMBER_ARRAYS_ELEMENTS)));
        }
        System.out.println("Сформирован список из " + NUMBER_ARRAYS_ELEMENTS + " элементов типа String за " + (System.nanoTime() - curTime) + " нс:\n" + arrList_String);

        for (counter1 = 0; counter1 < NUMBER_ARRAYS_ELEMENTS; counter1++)
        {
            arrList_Object_int.add(new Object_int(random.nextInt(NUMBER_ARRAYS_ELEMENTS)));
        }
        System.out.print("Сформирован список из " + NUMBER_ARRAYS_ELEMENTS + " элементов типа Object_int за " + (System.nanoTime() - curTime) + " нс:\n" + "[");
        counter1 = 0;
        for (Object_int curObj_int : arrList_Object_int)
        {
            System.out.print(curObj_int.getNumber_int() + (++counter1 < NUMBER_ARRAYS_ELEMENTS ? ", " : ""));
        }
        System.out.println("]\n\n");
        //endregion
        //----------------------------------------------------------------------------------------------------


        //region Решение задания 3.2
        /*Задание 3.2
        На основе списка из задания 3.1 реализуйте основные методы добавления, удаления и получения объекта или элемента из списка.
        Оценить выполненные методы с помощью базового класса System.nanoTime().
        */
        System.out.println("РЕШЕНИЕ ЗАДАНИЯ 3.2\n");
        // Добавление
        curTime = System.nanoTime();
        arrList1.add(-100);
        arrList1.add(-200);
        System.out.println("Добавление двух элементов в список типа Integer заняло " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        arrList_String.add(String.valueOf(-100));
        arrList_String.add(String.valueOf(-200));
        System.out.println("Добавление двух элементов в список типа String заняло " + (System.nanoTime() - curTime) + " нс.");
        arrList_Object_int.add(new Object_int(-100));
        arrList_Object_int.add(new Object_int(-200));
        System.out.println("Добавление двух элементов в список типа Object_int заняло " + (System.nanoTime() - curTime) + " нс.\n");

        // Удаление
        Integer delElement = -100;
        curTime = System.nanoTime();
        arrList1.remove(delElement);
        System.out.println("Удаление одного элемента в списке типа Integer заняло " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        arrList_String.remove(String.valueOf(-200));
        System.out.println("Удаление одного элемента в списке типа String заняло " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        arrList_Object_int.remove(150);
        System.out.println("Удаление одного элемента в списке типа Object_int заняло " + (System.nanoTime() - curTime) + " нс.\n");

        // Получение объекта или элемента из списка
        curTime = System.nanoTime();
        System.out.println("Элемент с индексом 150 в списке типа Integer = " + arrList1.get(150) + " получен за " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        System.out.println("Элемент с индексом 150 в списке типа String = " + arrList_String.get(150) + " получен за " + (System.nanoTime() - curTime) + " нс.");
        curTime = System.nanoTime();
        System.out.println("Элемент с индексом 150 в списке типа Object_int = " + arrList_Object_int.get(150).getNumber_int() + " получен за " + (System.nanoTime() - curTime) + " нс.\n");
        //endregion
        //----------------------------------------------------------------------------------------------------

        //region Решение задания 3.3
        /*
        Задание 3.3
        Реализуйте простой односвязный список и его базовые методы.
        */
        System.out.println("РЕШЕНИЕ ЗАДАНИЯ 3.3\n");
        // Создание односвязного списка типа String
        OneLinkedList<String> newOneList = new OneLinkedList<>();
        // Заполнение односвязного списка
        newOneList.add("1");
        newOneList.add("2");
        newOneList.add("3");
        newOneList.add("4");
        newOneList.add("5");
        newOneList.add("6");
        newOneList.add("7");
        newOneList.add("8");
        newOneList.add("9");
        newOneList.add("10");
        System.out.println("Вид заданного односвязного списка:");
        newOneList.showElements(); // Вывод элементов односвязного списка
        System.out.println();

        // Удаление первого элемента из односвязного списка
        newOneList.deleteFirst();
        System.out.println("Вид односвязаного списка после удаления первого элемента:");
        newOneList.showElements();
        System.out.println();

        // Удаление элемента с индексом 2 из односвязного списка
        newOneList.deleteOnIndex(2);
        System.out.println("Вид односвязаного списка после удаления элемента с индексом 2:");
        newOneList.showElements();
        System.out.println();

        // Удаление элемента "3" из односвязного списка
        newOneList.deleteOnValue("3");
        System.out.println("Вид односвязаного списка после удаления элемента \"3\":");
        newOneList.showElements();
        System.out.println();

        // Определение пустой или односвязных список
        if (newOneList.isEmpty() == true)
        {
            System.out.println("Односвязный список не пустой.");
        }
        else
        {
            System.out.println("Односвязный список пустой.");
        }

        // Определение индекса элемента "4" в односвязном списке
        System.out.println("Элемент \"4\" в односвязном списке имеет индекс " + newOneList.searchIndexElement("4") + ".");

        // Определение есть ли элемент "4" в односвязном списке
        if (newOneList.searchElement("4") == true)
        {
            System.out.println("Элемент \"4\" ЕСТЬ в односвязном списке.");
        }
        else
        {
            System.out.println("Элемента \"4\" НЕТ в односвязном списке.");
        }
        System.out.println();
        //endregion

        //region Решение задания 3.4
        /*
        Задание 3.4
        На основе списка из задания 3.1 реализуйте простой двусторонний список и его базовые методы.
        Реализуйте список заполненный объектами из вашего класса из задания 1.3
        */
        System.out.println("РЕШЕНИЕ ЗАДАНИЯ 3.4\n");
        // Создание двустороннего списка типа String
        LinkedList<String> newTwoList = new LinkedList<>();
        // Заполнение двустороннего списка
        newTwoList.add("1");
        newTwoList.add("2");
        newTwoList.add("3");
        newTwoList.add("4");
        newTwoList.add("5");
        newTwoList.add("6");
        newTwoList.add("7");
        newTwoList.add("8");
        newTwoList.add("9");
        newTwoList.add("10");
        System.out.println("Вид заданного двустороннего списка:");
        System.out.println(newTwoList); // Вывод элементов двустороннего списка
        System.out.println();

        // Установка нового элемента с индексом 2
        newTwoList.set(2, "New element");
        System.out.println("Вид двустороннего списка после установки нового элемента с индексом 2:");
        System.out.println(newTwoList);
        System.out.println();

        // Удаление элемента с индексом 2
        newTwoList.remove(2);
        System.out.println("Вид двустороннего списка после удаления элемента с индексом 2:");
        System.out.println(newTwoList);
        System.out.println();

        // Удаление элемента "9"
        newTwoList.remove("9");
        System.out.println("Вид двустороннего списка после удаления элемента \"9\":");
        System.out.println(newTwoList);
        System.out.println();

        // Добавление первого элемента "First element" в двусторонний массив
        newTwoList.addFirst("First element");
        System.out.println("Вид двустороннего списка после добавления первого элемента \"First element\":");
        System.out.println(newTwoList);
        System.out.println();

        // Добавление последнего элемента "Last element" в двусторонний массив
        newTwoList.addLast("Last element");
        System.out.println("Вид двустороннего списка после добавления первого элемента \"Last element\":");
        System.out.println(newTwoList);
        System.out.println();

        // Поиск элемента "7" в двустороннем массиве
        newTwoList.removeFirst();
        newTwoList.removeLast();
        if (newTwoList.contains("7") == true)
        {
            System.out.println("В двустороннем списке присутствует элемент \"7\".");
        }
        else
        {
            System.out.println("В двустороннем списке НЕ присутствует элемент \"7\".");
        }
        System.out.println(newTwoList);
        System.out.println();

        // Создание двустороннего массива с объектом Object_int
        LinkedList<Object_int> objectTwoLinkedList = new LinkedList<>();

        // Заполнение двустороннего массива объектами Object_int
        objectTwoLinkedList.add(new Object_int(1));
        objectTwoLinkedList.add(new Object_int(2));
        objectTwoLinkedList.add(new Object_int(3));
        objectTwoLinkedList.add(new Object_int(4));
        objectTwoLinkedList.add(new Object_int(5));
        objectTwoLinkedList.add(new Object_int(6));
        objectTwoLinkedList.add(new Object_int(7));
        objectTwoLinkedList.add(new Object_int(8));
        objectTwoLinkedList.add(new Object_int(9));
        objectTwoLinkedList.add(new Object_int(10));
        System.out.println("Вид заданного списка типа Object_int:");
        System.out.print("[");
        counter1 = 0;
        for (Object_int curObject : objectTwoLinkedList)
        {
            System.out.print(curObject.getNumber_int() + (counter1 < objectTwoLinkedList.lastIndexOf(objectTwoLinkedList.getLast()) ? ", " : ""));
            counter1++;
        }
        System.out.println("]\n\n");


        //endregion
        //----------------------------------------------------------------------------------------------------

        //region Решение задания 3.5
        /*
        Задание 3.5
        Реализуйте итератор на основе связанных списков из задания 3.4 и выполните базовые операции итератора.
        Оцените время выполнения операций с помощью базового метода System.nanoTime()
         */
        System.out.println("РЕШЕНИЕ ЗАДАНИЯ 3.5\n");

        // Задание итераторов для списка типа String
        Iterator<String> iterString = newTwoList.iterator();
        ListIterator<String> iterString_2 = newTwoList.listIterator();

        System.out.println("Элементы списка типа String:");
        System.out.println("Пример работы итератора типа Iterator:");
        while (iterString.hasNext() == true)
        {
            System.out.println("    " + iterString.next());
        }
        System.out.println("Пример работы итератора типа ListIterator:");
        while (iterString_2.hasNext() == true)
        {
            System.out.println("    " + iterString_2.next());
        }
        while (iterString_2.hasPrevious() == true)
        {
            System.out.println("    " + iterString_2.previous());
        }

        // Задание итератора для списка типа Object_int
        Iterator<Object_int> iterObject_int = objectTwoLinkedList.iterator();
        ListIterator<Object_int> iterObject_int_2 = objectTwoLinkedList.listIterator();
        System.out.println("Элементы списка типа Object_int:");
        System.out.println("Пример работы итератора типа Iterator:");
        while (iterObject_int.hasNext() == true)
        {
            System.out.println("    " + iterObject_int.next().getNumber_int());
        }
        System.out.println("Пример работы итератора типа ListIterator:");
        while (iterObject_int_2.hasNext() == true)
        {
            System.out.println("    " + iterObject_int_2.next().getNumber_int());
        }
        while (iterObject_int_2.hasPrevious() == true)
        {
            System.out.println("    " + iterObject_int_2.previous().getNumber_int());
        }
        //endregion
        //----------------------------------------------------------------------------------------------------
    }
}
