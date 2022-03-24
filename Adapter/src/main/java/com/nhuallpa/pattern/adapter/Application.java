package com.nhuallpa.pattern.adapter;

public class Application {

    public static void main(String[] args) {

        var hole = new RoundHole(5);
        var rpeg = new RoundPeg(5);

        hole.fits(rpeg);

        var smallSquarePeg = new SquarePeg(5);
        var largeSquarePeg = new SquarePeg(10);
        // hole.fits(squarePeg); It does not compile

        var smallSquarePegAdapter = new SquarePegAdaper(smallSquarePeg);
        var largeSquarePegAdapter = new SquarePegAdaper(largeSquarePeg);

        hole.fits(smallSquarePegAdapter); // true
        hole.fits(largeSquarePegAdapter); // false

    }
}
