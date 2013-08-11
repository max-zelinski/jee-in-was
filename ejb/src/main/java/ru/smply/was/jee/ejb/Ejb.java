package ru.smply.was.jee.ejb;

import javax.ejb.Stateless;

@Stateless
public class Ejb implements EjbLocal {
    public void hello() {
        System.out.println("hello");
    }
}
