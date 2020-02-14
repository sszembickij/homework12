/*3. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
Создать list из 100 обьектов типа Person заполненных случайными данными
(Например создать массив на несколько имен и выбирать из него случайным образом).
3.1*. Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
не было человека весом 3 кг и ростом 180 итд.*/

package randomperson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Person());
            System.out.println(list.get(i).toString());
        }
    }
}