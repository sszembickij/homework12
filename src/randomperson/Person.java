package randomperson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {
    Random random = new Random();
    String surname;
    String name;
    int age;
    int height;
    int weight;
    int percScatterHeigt = 10;
    int percScatterWeigt = 15;
    int temp;
    private static List<String> names = new ArrayList<>();
    private static List<String> surnames = new ArrayList<>();

    static {
        initList("surnames");
        initList("names");
    }

    public Person() {
        this.name = names.get(random.nextInt(names.size()));
        this.surname = surnames.get(random.nextInt(names.size()));
        this.age = random.nextInt(41) + 20;
        this.height = random.nextInt(180 * 2 * percScatterHeigt / 100) + 180 - 180 * percScatterHeigt / 100;
        temp = this.height - 100 + (this.age - 20) / 4;
        this.weight = random.nextInt(temp * 2 * percScatterWeigt / 100) + temp - temp * percScatterWeigt / 100;
    }

    private static void initList(String listName) {
        String fileName = listName;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                switch (listName) {
                    case "names":
                        names.add(currentLine);
                        break;
                    case "surnames":
                        surnames.add(currentLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ", " +
                age + " годиков, " + height + " см, " + weight + " кг.";
    }
}
