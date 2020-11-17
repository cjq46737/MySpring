/*
 * @projectName myspring
 * @package com.cjq.spring.propertyeditorregister.register
 * @className com.cjq.spring.propertyeditorregister.register.DatePropertyEditorRegistor
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.propertyeditorregister.register;

import com.cjq.spring.propertyeditorregister.support.DatePropertySupport;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import java.util.Date;

/**
 * DatePropertyEditorRegistor
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月09日 9:26 下午
 * @version 3.0.0
 */
public class DatePropertyEditorRegistar implements PropertyEditorRegistrar {

    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        registry.registerCustomEditor(Date.class, new DatePropertySupport());

    }
}
