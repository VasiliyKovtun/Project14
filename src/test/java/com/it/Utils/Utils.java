package com.it.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Utils {
    static public class Data {
        static public String getRandomName() {
            ArrayList<String> name = new ArrayList<>(Arrays.asList("Аделина", "Аза", "Азиза", "Аида", "Аксинья", "Алевтина",
                    "Беатриса", "Белла", "Береслава", "Берта", "Биргит", "Богдана", "Божена", "Борислава", "Бронислава"));
            return name.get(new Random().nextInt(name.size()));
        }

        static public String getRandomLastName() {
            ArrayList<String> lastName = new ArrayList<>(Arrays.asList("Смирнов", "Иванов", "Кузнецов", "Соколов",
                    "Попов", "Лебедев", "Козлов", "Новиков", "Морозов", "Петров", "Волков"));
            return lastName.get(new Random().nextInt(lastName.size()));

                    }

        static public String getRandomEmail() {
            return getRandomString(18) + "@gmail.com";
        }
        static public String getRandomString(int count){
           return new Random().ints('a', 'z')
                    .limit(count)
                    .mapToObj(s->""+(char)s)
                    .collect(Collectors.joining());
        }
    }
}
