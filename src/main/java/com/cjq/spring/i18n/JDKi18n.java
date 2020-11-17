/*
 * @projectName myspring
 * @package com.cjq.spring.i18n
 * @className com.cjq.spring.i18n.JDKi18n
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.i18n;

import org.junit.Test;

import java.text.MessageFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * JDKi18n
 * @description TODO
 * @author chenjunqi
 * @date 2020年06月21日 10:22 上午
 * @version 3.0.0
 */
public class JDKi18n {

    public static void main(String[] args) {
        // 带有语言和国家地区的本地化对象
        Locale l1 = new Locale("zh", "ZN");

        // 只有语言参数的本地化对象
        Locale l2 = new Locale("zh");

        // 等同于l1
        Locale l3 = Locale.CHINA;

        // 等同于来l2
        Locale l4 = Locale.CHINESE;
    }

    @Test
    public void testMessageFormat() {
        // 信息格式化模板
        String pattern1 = "{0}，你好！你于{1}在工商银行存入{2}元";
        String pattern2 = "At {1,time,short} On {1,date,long}{0} paid {2,number,currency}";

        // 参数
        Object[] params = { "cjq", new GregorianCalendar().getTime(), 1.0E3 };

        // 默认本地化对象格式化信息
        String msg1 = MessageFormat.format(pattern1, params);
        System.out.println(msg1);

        // 使用US本地化对象格式化信息
        MessageFormat mf = new MessageFormat(pattern2, Locale.US);
        System.out.println(mf.format(params));
    }
}
