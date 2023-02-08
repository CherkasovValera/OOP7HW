package org.example.model;

public class ConsoleDecor implements Decorable{
    @Override
    public void SeeDecor(String operation) {
        System.out.println(operation);
    }
}
