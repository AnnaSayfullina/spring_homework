package spring.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
@Getter
@Setter

public abstract class Transport {
    private String brand;
    private String model;

    public Transport(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public abstract void start();

    @Override
    public String toString(){
        return "Марка "+ brand + ", модель " + model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model);
    }
}
