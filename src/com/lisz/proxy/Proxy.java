package com.lisz.proxy;

import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

//出现找不到类错误的时候刷新整个项目文件夹
public class Proxy {
	public static Object newProxyInstance(Class infce, InvocationHandler handler) throws Exception {
		String src = 
				"package com.lisz.proxy;\n\n" + 
				"import java.lang.reflect.Method;\n" +
				"\n" + 
				"public class Proxy_1 implements " + infce.getName() + " {\n" + 
				"	private " + InvocationHandler.class.getName() + " handler;\n" +
				"	\n" + 
				"	public Proxy_1(" + InvocationHandler.class.getName() + " handler) {\n" + 
				"		super();\n" + 
				"		this.handler = handler;\n" + 
				"	}\n" + 
				"\n";
				
		Method methods[] = infce.getMethods();
		for (Method method : methods) {
			String methodName = method.getName();
			src += "	@Override\n" + 
					"	public void " + methodName + "() {\n" + 
					"		Method method = null;\n" + 
					"		try {\n" + 
					"			method = " + infce.getName() + ".class.getMethod(\"" + methodName + "\");\n" + 
					"			handler.invoke(this, method);\n" + 
					"		} catch (NoSuchMethodException e) {\n" + 
					"			e.printStackTrace();\n" + 
					"		} catch (SecurityException e) {\n" +
					"			e.printStackTrace();\n" +
					"		}\n" +
					"	}\n";
		}
		src +=  "\n}";
		
		System.out.println(System.getProperty("user.dir"));
		String filename = System.getProperty("user.dir") + "/src/com/lisz/proxy/Proxy_1.java";
		FileWriter fw = new FileWriter(filename);
		fw.write(src);
		fw.flush();
		fw.close();
		
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(filename);
		CompilationTask task = compiler.getTask(null, fileMgr, null, null, null, units);
		task.call();
		fileMgr.close();
		
		URL urls[] = new URL[]{new URL("file:/" + System.getProperty("user.dir") + "/src")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.lisz.proxy.Proxy_1");
		System.out.println(c);
		Constructor constructor = c.getConstructor(InvocationHandler.class);
		Object obj = constructor.newInstance(handler);

		return obj;
	}
}
