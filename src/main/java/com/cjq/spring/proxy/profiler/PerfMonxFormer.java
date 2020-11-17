/*
 * @projectName myspring
 * @package com.cjq.spring.proxy.profiler
 * @className com.cjq.spring.proxy.profiler.PerfMonxFormer
 * @copyright Copyright 2020 Thuisoft, Inc. All rights reserved.
 */
package com.cjq.spring.proxy.profiler;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtBehavior;
import javassist.CtClass;

import java.io.ByteArrayInputStream;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * PerfMonxFormer
 * @description TODO
 * @author chenjunqi
 * @date 2020年07月26日 2:12 下午
 * @version 3.0.0
 */
public class PerfMonxFormer implements ClassFileTransformer {
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
            byte[] classfileBuffer) throws IllegalClassFormatException {
        System.out.println("Transfoming class" + className);

        byte[] transfomed = null;
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = null;
        try {
            ctClass = pool.makeClass(new ByteArrayInputStream(classfileBuffer));
            if (!ctClass.isInterface()) {
                CtBehavior[] methods = ctClass.getDeclaredBehaviors();
                for (CtBehavior method : methods) {
                    if (!method.isEmpty()) {
                        doMethod(method);
                    }
                }
                transfomed = ctClass.toBytecode();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ctClass != null) {
                ctClass.detach();
            }
        }
        return transfomed;
    }

    private void doMethod(CtBehavior method) throws CannotCompileException {
        method.insertBefore("long start = System.nanoTime();");
        method.insertAfter("System.out.println(\"leave " + method.getName() + "and time: \"+ (System.nanoTime() - start));");
    }
}
