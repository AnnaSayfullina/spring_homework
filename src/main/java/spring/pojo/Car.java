package spring.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car extends Transport{

    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void start() {
        System.out.println("Автомобиль "+ getBrand() + " " + getModel() + " готов к работе");
    }
}
