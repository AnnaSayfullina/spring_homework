package spring.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bus extends Transport{

    public Bus(String brand, String model) {
        super(brand, model);
    }
    public void start() {
        System.out.println("Автобус "+ getBrand() + " " + getModel() + " готов к работе");
    }
}

