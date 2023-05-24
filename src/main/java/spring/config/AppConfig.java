package spring.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.pojo.*;

@Configuration
public class AppConfig {
    @Bean(name = "car")
    public Transport car() {
        return new Car("BMW","X5");
    }

    @Bean(name = "bus")
    public Transport bus() {
        return new Bus("Hyundai", "County");
    }

    @Bean(name = "pickup")
    public Transport pickup() {
        return new Pickup("Haval", "WINGLE7");
    }

    @Bean(name = "carDriver")
    @Qualifier("car")
    public Driver carDriver() {
        return new Driver("Вася" , car());
    }

    @Bean(name = "busDriver")
    @Qualifier("bus")
    public Driver busDriver() {
        return new Driver("Петя" , bus());
    }

    @Bean(name = "pickupDriver")
    @Qualifier("pickup")
    public Driver pickupDriver() {
        return new Driver("Федя" , pickup());
    }
}
