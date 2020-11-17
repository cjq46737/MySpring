/*
 * @projectName myspring
 * @package com.cjq.spring.factorybean
 * @className com.cjq.spring.factorybean.Car
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.factorybean;

import lombok.Data;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Car
 * @description TODO
 * @author chenjunqi
 * @date 2020年05月03日 7:09 下午
 * @version 3.0.0
 */
@Data
public class Car {

    private int maxspeed;

    private String brand;

    private double price;

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("CarFactoryBean.xml");
        Car car = (Car) ac.getBean("car");
        System.out.println(car);

        CarFactoryBean carFactoryBean = (CarFactoryBean) ac.getBean("&car");
        System.out.println(carFactoryBean);
    }
}
