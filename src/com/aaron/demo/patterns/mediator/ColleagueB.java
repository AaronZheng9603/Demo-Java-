package com.aaron.demo.patterns.mediator;

public class ColleagueB extends AbstractColleague {

    public ColleagueB(IMediator mediator) {
        super(mediator);
    }

    public void b() {
        System.out.println("b");
    }
}
