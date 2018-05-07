package org.marcos.domain;

public class RomanNumber {
    private String letter;
    private Integer number;

    public RomanNumber(String letter, Integer number) {
        this.letter = letter;
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof RomanNumber))
            return false;

        RomanNumber romanNumber = (RomanNumber) obj;

        if (this.letter.equals(romanNumber.getLetter()) && this.number.equals(romanNumber.getNumber()))
            return true;
        return false;
    }

    public Integer getNumber() {
        return this.number;
    }

    public String getLetter() {
        return this.letter;
    }
}
