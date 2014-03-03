package net.bluedash.snippets.classloader.demos;

public class ShowClasspath {

    public static void main(String[] args) {
        String strClassPath = System.getProperty("rmi.class.path");
        for (String path : strClassPath.split(":")) {
            System.out.println(path);
        }
    }


}
