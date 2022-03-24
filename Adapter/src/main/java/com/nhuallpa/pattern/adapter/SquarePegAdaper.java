package com.nhuallpa.pattern.adapter;

public class SquarePegAdaper extends RoundPeg {

    private final SquarePeg squarePeg;

    public SquarePegAdaper(SquarePeg smallSquarePeg) {
        super(smallSquarePeg.getWidth());
        this.squarePeg = smallSquarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }
}
