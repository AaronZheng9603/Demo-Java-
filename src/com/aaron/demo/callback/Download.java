package com.aaron.demo.callback;

public class Download {

    private Callback callback;

    public Download(Callback callback) {
        this.callback = callback;
    }

    public void startDownload() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            callback.onFailure();
            e.printStackTrace();
        }
        callback.onSuccess();
    }
}
