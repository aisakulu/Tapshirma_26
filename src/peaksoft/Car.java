package peaksoft;

import java.util.Objects;

public class Car {
    private String id;
    private String numberAuto;

    public Car() {

    }

    public Car(String id, String numberAuto) {
        this.id = id;
        this.numberAuto = numberAuto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumberAuto() {
        return numberAuto;
    }

    public void setNumberAuto(String numberAuto) {
        this.numberAuto = numberAuto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(numberAuto, car.numberAuto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numberAuto);
    }

    @Override
    public String toString() {
        return "Car[" +
                "id='" + id + '\'' +
                ", numberAuto='" + numberAuto + '\'' +
                ']';
    }
}
