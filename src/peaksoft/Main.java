package peaksoft;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        HashMap<Car, CarInfo> hashMap = new HashMap<>();
        hashMap.put(
                new Car("12345", "B1234A"),
                new CarInfo(LocalDate.ofYearDay(2015, 26), "Mercedes", 5625.5, "White")
        );

        Iterator iterator =hashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) iterator.next();
            System.out.println(mapElement.getKey());
            System.out.println(mapElement.getValue());
        }
    }
}
