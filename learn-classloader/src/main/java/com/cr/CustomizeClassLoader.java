    package com.cr;

    import java.net.URL;
    import java.net.URLClassLoader;

    public class CustomizeClassLoader extends URLClassLoader {

        public CustomizeClassLoader(URL[] urls) {
            super(urls);
        }

        public static void main(String[] args) throws ClassNotFoundException {
            URL[] urls = {CustomizeClassLoader.class.getResource("/")};
            CustomizeClassLoader cl1 = new CustomizeClassLoader(urls);
            CustomizeClassLoader cl2 = new CustomizeClassLoader(urls);

            Class<?> class1 = cl1.findClass("com.cr.Initialize");
            Class<?> class2 = cl2.findClass("com.cr.Initialize");
            System.out.println(class1.hashCode());
            System.out.println(class2.hashCode());
        }

    }
