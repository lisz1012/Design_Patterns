package com.lisz.visitor;

import org.objectweb.asm.ClassWriter;
import static org.objectweb.asm.Opcodes.*;


public class ClassWriterTest {

	public static void main(String[] args) {
		ClassWriter cw = new ClassWriter(0);
		cw.visit(V1_5, ACC_PUBLIC + ACC_STATIC + ACC_FINAL, "pkg/Comparable", null, "java/lang/Object", null);
		cw.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL, "LESS", "I", null, -1);
		cw.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL, "EQUAL", "I", null, 0);
		cw.visitField(ACC_PUBLIC + ACC_STATIC + ACC_FINAL, "GREATER", "I", null, 1);
		cw.visitMethod(ACC_PUBLIC + ACC_ABSTRACT, "compareTo", "(Ljava/lang/Object;)I", null, null);
		cw.visitEnd();
		byte b[] = cw.toByteArray();
		MyClassLoader myClassLoader = new MyClassLoader();
		Class c = myClassLoader.defineClass("pkg.Comparable", b);
		System.out.println(c.getMethods()[0].getName());
		// print： compareTo
	}

}
