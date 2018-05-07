package org.marcos.converter;

import org.marcos.domain.RomanNumber;

import java.util.concurrent.atomic.AtomicInteger;

public class RegularNumberConverter {
    private String convertWhenRegular(AtomicInteger numbertoTransform, String romanTransformation, RomanNumber romanNumber) {
        while (numbertoTransform.get() >= romanNumber.getNumber()) {
            romanTransformation += romanNumber.getLetter();
            numbertoTransform.set(numbertoTransform.get() - romanNumber.getNumber());
        }
        return romanTransformation;
    }

    public String invoke(AtomicInteger numbertoTransform, String romanTransformation, RomanNumber romanNumber) {
        return convertWhenRegular(numbertoTransform, romanTransformation, romanNumber);
    }
}
