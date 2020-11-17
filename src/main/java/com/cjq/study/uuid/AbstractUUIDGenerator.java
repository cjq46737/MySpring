/*
 * @projectName myspring
 * @package com.cjq.study.uuid
 * @className com.cjq.study.uuid.AbstractUUIDGenerator
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.study.uuid;

import java.net.InetAddress;

/**
 * AbstractUUIDGenerator
 * @description TODO
 * @author chenjunqi
 * @date 2020年08月26日 9:09 下午
 * @version 3.0.0
 */
public class AbstractUUIDGenerator {

    private static final int IP;

    private static final int JVM = (int) (System.currentTimeMillis() >>> 8);

    private static short counter = (short) 0;

    static {
        int ipadd;
        try {
            ipadd = BytesHelper.toInt(InetAddress.getLocalHost().getAddress());
        } catch (Exception e) {
            ipadd = 0;
        }
        IP = ipadd;
    }

    public AbstractUUIDGenerator() {
    }

    protected static int getJVM() {
        return JVM;
    }

    protected static short getCount() {
        synchronized (AbstractUUIDGenerator.class) {
            if (counter < 0) {
                counter = 0;
            }
            return counter++;
        }
    }

    protected static int getIP() {
        return IP;
    }

    protected static short getHiTime() {
        return (short) (System.currentTimeMillis() >>> 32);
    }

    protected static int getLoTime() {
        return (int) System.currentTimeMillis();
    }

    static class BytesHelper {
        public static int toInt(byte[] bytes) {
            int result = 0;
            for (int i = 0; i < 4; i++) {
                result = (result << 8) - Byte.MIN_VALUE + (int) bytes[i];
            }
            return result;
        }
    }
}
