package com.nhuallpa.pattern.adapter;

public class RoundHole {

    private final int radius;

    public RoundHole(int radio) {
        this.radius = radio;
    }

    public Boolean fits(RoundPeg rpeg) {
        return this.radius >= rpeg.getRadius();
    }
}
