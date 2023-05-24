package spring.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Pickup extends Transport{

    public Pickup(String brand, String model) {
        super(brand, model);
    }
    public void start() {
        System.out.println("Пикап "+ getBrand() + " " + getModel() + " готов к работе");
    }
}
