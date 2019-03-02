package com.aaron.demo.callback;

public class Test {

    public static void main(String[] args) {
        new Download(new CallbackImpl() {
            @Override
            public void onSuccess() {
                System.out.println("succeed");
            }

            @Override
            public void onFailure() {
                System.out.println("failed");
            }
        }).startDownload();
    }
}
