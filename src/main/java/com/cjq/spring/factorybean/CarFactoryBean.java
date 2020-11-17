/*
 * @projectName myspring
 * @package com.cjq.spring.factorybean
 * @className com.cjq.spring.factorybean.CarFactoryBean
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.factorybean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;

/**
 * CarFactoryBean
 * @description TODO
 * @author chenjunqi
 * @date 2020年05月03日 7:15 下午
 * @version 3.0.0
 */
@Getter
@Setter
public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    public Car getObject() throws Exception {
        String[] infos = carInfo.split(",");
        Car car = new Car();
        car.setBrand(infos[0]);
        car.setMaxspeed(Integer.parseInt(infos[1]));
        car.setPrice(Double.parseDouble(infos[2]));
        return car;
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
