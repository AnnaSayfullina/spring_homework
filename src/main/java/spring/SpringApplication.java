package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.config.AppConfig;
import spring.pojo.*;

public class SpringApplication {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Transport car = context.getBean("car", Car.class);
        car.start();

        Transport bus = context.getBean("bus", Bus.class);
        bus.start();

        Transport pickup = context.getBean("pickup", Pickup.class);
        pickup.start();

        Driver driverCar = context.getBean("carDriver", Driver.class);
        driverCar.startTheTransport();

        Driver driverBus = context.getBean("busDriver", Driver.class);
        driverBus.startTheTransport();

        Driver driverPickup = context.getBean("pickupDriver", Driver.class);
        driverPickup.startTheTransport();
    }
}
