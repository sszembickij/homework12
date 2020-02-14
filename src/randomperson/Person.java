package randomperson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {
    private String surname;
    private String name;
    private int age;
    private int height;
    private int weight;
    private static List<String> names = new ArrayList<>();
    private static List<String> surnames = new ArrayList<>();

    static {
        initList("surnames");
        initList("names");
    }

    Person() {
        Random random = new Random();
        this.name = names.get(random.nextInt(names.size()));
        this.surname = surnames.get(random.nextInt(names.size()));
        this.age = random.nextInt(41) + 20;
        int percScatterHeigt = 10;
        this.height = random.nextInt(180 * 2 * percScatterHeigt / 100) + 180 - 180 * percScatterHeigt / 100;
        int temp = this.height - 100 + (this.age - 20) / 4;
        int percScatterWeigt = 15;
        this.weight = random.nextInt(temp * 2 * percScatterWeigt / 100) + temp - temp * percScatterWeigt / 100;
    }

    private static void initList(String listName) {
        try (BufferedReader br = new BufferedReader(new FileReader(listName))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                switch (listName) {
                    case "names":
                        names.add(currentLine);
                        break;
                    case "surnames":
                        surnames.add(currentLine);
                        break;
                    default:
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return surname + ' ' + name + ", " +
                age + " г., " + height + " см, " + weight + " кг.";
    }
}
