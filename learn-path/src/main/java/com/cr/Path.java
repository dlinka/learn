package com.cr;

public class Path {

    public static void main(String[] args) {
        //file:/Users/dlinka/IdeaProjects/learn-path/target/classes/com/cr/
        System.out.println(Path.class.getResource(""));
        //file:/Users/dlinka/IdeaProjects/learn-path/target/classes/
        System.out.println(Path.class.getResource("/"));

        Path path = new Path();
        //file:/Users/dlinka/IdeaProjects/learn-path/target/classes/
        System.out.println(path.getClass().getClassLoader().getResource(""));
        //null
        System.out.println(path.getClass().getClassLoader().getResource("/"));
    }

}
