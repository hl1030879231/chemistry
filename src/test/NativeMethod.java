package test;

public class NativeMethod {//ʶ����д����ʽ����
	static 
	{ 
//		System.loadLibrary("handWritingRecog");
		//release
		System.load("E:\\java_workspace\\project\\project\\lib\\handWritingRecog.dll"); 
//		System.load("E:\\Java\\eclipseee\\webspace\\project\\build\\classes\\handWritingRecog\\x64\\Release\\handWritingRecog.dll"); 
	} 
	public static native String handwritingRecog();
	public static native void clear();
	public static native void push(int []x,int []y);
	public static native void pop();
}
