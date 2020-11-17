/*
 * @projectName myspring
 * @package com.cjq.spring.conversion
 * @className com.cjq.spring.conversion.String2DateConverter
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.conversion;

import lombok.SneakyThrows;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * String2DateConverter
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月21日 5:45 下午
 * @version 3.0.0
 */
public class String2DateConverter implements Converter<String, Date> {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        DefaultConversionService defaultConversionService = new DefaultConversionService();
        defaultConversionService.addConverter(new String2DateConverter());
        Date date = defaultConversionService.convert("2020-6-21", Date.class);
        System.out.println(date);
    }

    @SneakyThrows
    @Override
    public Date convert(String source) {
        return sdf.parse(source);
    }
}
