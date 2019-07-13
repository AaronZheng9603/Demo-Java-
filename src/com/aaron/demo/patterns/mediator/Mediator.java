package com.aaron.demo.patterns.mediator;

public class Mediator implements IMediator {

    private ColleagueA mColleagueA;
    private ColleagueB mColleagueB;

    public IMediator setColleagueA(ColleagueA colleague) {
        mColleagueA = colleague;
        return this;
    }

    public IMediator setColleagueB(ColleagueB colleague) {
        mColleagueB = colleague;
        return this;
    }

    @Override
    public void react(AbstractColleague colleague) {
        if (colleague instanceof ColleagueA) {
            ColleagueA a = (ColleagueA) colleague;
            a.a();
        } else if (colleague instanceof ColleagueB) {
            ColleagueB b = (ColleagueB) colleague;
            b.b();
        }
    }
}
