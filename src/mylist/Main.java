/*1) Реализовать методы add(int value), get, set, toString
2*) Реализовать остальные методы из примера выше и сделать
сортировку вставками для MyList*/

package mylist;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(3);
        myList.add(7);
        myList.add(0);

        System.out.println("myList.toString()");
        System.out.println(myList.toString());

        System.out.println("myList.get(2)");
        System.out.println(myList.get(2));

        myList.set(1, 9);
        System.out.println("myList.set(1, 9)");
        System.out.println(myList.toString());

        myList.add(1, 5);
        System.out.println("myList.add(1, 5)");
        System.out.println(myList.toString());

        myList.remove(3);
        System.out.println("myList.remove(3)");
        System.out.println(myList.toString());

        myList.removeByValue(8);
        System.out.println("myList.removeByValue(8)");
        System.out.println(myList.toString());

        myList.removeByValue(9);
        System.out.println("myList.removeByValue(9)");
        System.out.println(myList.toString());

        myList.sortInsert();
        System.out.println("myList.sortInsert()");
        System.out.println(myList.toString());
    }
}
