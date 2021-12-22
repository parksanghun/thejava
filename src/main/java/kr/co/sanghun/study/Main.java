package kr.co.sanghun.study;

public class Main {

    static String name;

    static {
        name = "sanghun";
    }

    public static void main(String[] args) {
	// write your code here
        ClassLoader classLoader = Main.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
