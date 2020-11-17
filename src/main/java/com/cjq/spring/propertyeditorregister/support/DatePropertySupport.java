/*
 * @projectName myspring
 * @package com.cjq.spring.propertyeditorregister.support
 * @className com.cjq.spring.propertyeditorregister.support.DatePropertySupport
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.propertyeditorregister.support;

import lombok.Setter;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * DatePropertySupport
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月09日 6:25 下午
 * @version 3.0.0
 */
@Setter
public class DatePropertySupport extends PropertyEditorSupport {

    private String dateFormate;

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.setValue(sdf.parse(text));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
