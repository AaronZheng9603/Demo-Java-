package com.aaron.demo.patterns.mediator;

public class ColleagueA extends AbstractColleague {

    public ColleagueA(IMediator mediator) {
        super(mediator);
    }

    public void a() {
        System.out.println("a");
    }
}
