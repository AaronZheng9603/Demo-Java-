package com.aaron.demo.patterns.mediator;

public abstract class AbstractColleague {

    private IMediator mMediator;

    public AbstractColleague(IMediator mediator) {
        mMediator = mediator;
    }

    public IMediator getMediator() {
        return mMediator;
    }
}
