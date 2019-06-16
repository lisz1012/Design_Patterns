package com.lisz.visitor.asm;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import static org.objectweb.asm.Opcodes.*;
import java.io.File;
import java.io.FileOutputStream;
import com.lisz.visitor.ClassPrinter;

public class CLassTransformerTest {
	public static void main(String[] args) throws Exception {
		ClassReader cr = new ClassReader(ClassPrinter.class.getClassLoader().getResourceAsStream("com/lisz/visitor/asm/Tank.class"));
		ClassWriter cw = new ClassWriter(0);
		ClassVisitor cv = new ClassVisitor(ASM7, cw) {
			@Override
			public MethodVisitor visitMethod(int access, String name, String descriptor, String signature,
					String[] exceptions) {
				MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
				return new MethodVisitor(ASM7, mv) {
					@Override
					public void visitCode() {
						visitMethodInsn(INVOKESTATIC, "TimeProxy", "before", "()V", false);
						super.visitCode();
					}
				};
			}
		};
		
		cr.accept(cv, 0);
		byte b[] = cw.toByteArray();
		String path = (String)System.getProperties().get("user.dir");
		File file = new File(path + "/com/sun/proxy/");
		file.mkdirs();
		FileOutputStream fos = new FileOutputStream(new File(path + "/com/sun/proxy/Tank_0.class"));
		fos.write(b);
		fos.flush();
		fos.close();
	}

}
