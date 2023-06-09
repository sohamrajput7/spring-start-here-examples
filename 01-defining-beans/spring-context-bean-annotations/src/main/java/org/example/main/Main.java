package org.example.main;

import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p1 = context.getBean("koko", Parrot.class);
        System.out.println(p1.getName());

        Parrot p2 = context.getBean("miki", Parrot.class);
        System.out.println(p2.getName());

        Parrot p3 = context.getBean("parrot3", Parrot.class);
        System.out.println(p3.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}