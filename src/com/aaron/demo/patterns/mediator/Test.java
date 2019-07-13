package com.aaron.demo.patterns.mediator;

public class Test {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        ColleagueA a = new ColleagueA(mediator);
        ColleagueB b = new ColleagueB(mediator);
        mediator.setColleagueA(a);
        mediator.setColleagueB(b);
        mediator.react(a);
        mediator.react(b);
    }
}
