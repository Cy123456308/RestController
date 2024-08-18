package io.daocloud.prometheustestdemo.domain;

public class Greet {
    private final String str;

    public Greet(String msg) {
        this.str = msg;
    }

    public String getMsg() {
        return str;
    }
}
