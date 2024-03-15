public class Main {

    public static void main(String[] args) {
        GBLinkedList<Integer> myList = new GBLinkedList<>();
        System.out.println("Список пуст? " + myList.isEmpty());
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.display();  // 1 2 3 4
        System.out.println("Размер списка: " + myList.size());  // 4
        System.out.println("Есть число 3? " + myList.contains(3));  // true
        System.out.println("Есть число 5? " + myList.contains(5));  // false
        myList.remove(2); // Убирает число 2 из списка
        myList.display();  // 1 3 4
    }

}
