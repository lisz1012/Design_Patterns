package com.lisz.visitor;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;

import static org.objectweb.asm.Opcodes.ASM4;

import org.objectweb.asm.ClassReader;

public class ClassPrinter extends ClassVisitor {

	public ClassPrinter() {
		super(ASM4);
	}

	@Override
	public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
		System.out.println(name + " extends " + superName + "{");
	}
	
	@Override
	public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
		System.out.println("    " + name);
		return null;
	}
	
	@Override
	public MethodVisitor visitMethod(int access, String name, String descriptor, String signature,
			String[] exceptions) {
		System.out.println("    " + name + "();");
		return null;
	}
	
	@Override
	public void visitEnd() {
		System.out.println("}");
	}
	
	public static void main(String[] args) throws Exception {
		ClassPrinter cp = new ClassPrinter();
		ClassReader cr = new ClassReader("java.lang.Runnable");
		cr.accept(cp, 0);
		/*
		   java/lang/Runnable extends java/lang/Object{
    	       run();
		   }
		 */
	}
}
