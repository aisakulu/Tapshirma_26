package peaksoft;

import java.time.LocalDate;
import java.util.Objects;

public class CarInfo {

    private LocalDate yearOfIssue;
    private String model;
    private double price;
    private String color;

    public CarInfo() {
    }

    public CarInfo(LocalDate yearOfIssue, String model, double price, String color) {
        this.yearOfIssue = yearOfIssue;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarInfo carInfo = (CarInfo) o;
        return Double.compare(carInfo.price, price) == 0 && Objects.equals(yearOfIssue, carInfo.yearOfIssue) && Objects.equals(model, carInfo.model) && Objects.equals(color, carInfo.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfIssue, model, price, color);
    }

    @Override
    public String toString() {
        return "CarInfo[" +
                "yearOfIssue=" + yearOfIssue +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ']';
    }
}
