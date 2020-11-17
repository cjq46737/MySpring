/*
 * @projectName myspring
 * @package com.cjq.study.uuid
 * @className com.cjq.study.uuid.SequentialUuidHexGenerator
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.study.uuid;

/**
 * SequentialUuidHexGenerator
 * @description TODO
 * @author chenjunqi
 * @date 2020年08月26日 9:10 下午
 * @version 3.0.0
 */
public class SequentialUuidHexGenerator extends AbstractUUIDGenerator {

    private static final String sep = "-";

    public static String generate() {
        return format(getJVM()) + sep + format(getHiTime()) + sep + format(getLoTime()) + sep + format(getIP()) + sep + format(getCount());
    }

    protected static String format(int intValue) {
        String formatted = Integer.toHexString(intValue);
        StringBuilder buf = new StringBuilder("00000000");
        buf.replace(8 - formatted.length(), 8, formatted);
        return buf.toString();
    }

    protected static String format(short shortValue) {
        String formatted = Integer.toHexString(shortValue);
        StringBuilder buf = new StringBuilder("0000");
        buf.replace(4 - formatted.length(), 4, formatted);
        return buf.toString();
    }

    public static void main(String[] args) {
        System.out.println(SequentialUuidHexGenerator.generate());
    }
}
