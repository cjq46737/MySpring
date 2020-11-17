/*
 * @projectName myspring
 * @package com.cjq.spring.proxy.profiler
 * @className com.cjq.spring.proxy.profiler.PerfMonAgent
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.proxy.profiler;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;

/**
 * PerfMonAgent
 * @description TODO
 * @author chenjunqi
 * @date 2020年07月26日 2:41 下午
 * @version 3.0.0
 */
public class PerfMonAgent {

    static private Instrumentation inst = null;

    public static void premain(String agentArgs, Instrumentation _inst) {
        System.out.println("PreMonAgent is called........");

        inst = _inst;
        ClassFileTransformer trans = new PerfMonxFormer();
        System.out.println("Adding a PerfMonxFormer instance to the JVM......");
        inst.addTransformer(trans);
    }
}
