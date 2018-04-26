package iks.pttrns.composite;

import java.io.Serializable;

public class Goose implements Serializable {

    private static final long serialVersionUID = -4438555932668281787L;

    private Boolean boo;
    private boolean bo;

    public void honk() {
        System.out.println("i'm goose");
    }

    public Boolean getBoo() {
        return boo;
    }

    public boolean isBo() {
        return bo;
    }
    public boolean isBoo() {
        return Boolean.TRUE.equals(boo);
    }
}
