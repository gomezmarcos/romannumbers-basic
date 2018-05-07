package org.marcos.converter;

import org.marcos.domain.RomanNumber;
import org.marcos.RomanNumberDictionary;

import java.util.concurrent.atomic.AtomicInteger;

public class NotRegularNumberConverter {

    private int getRestaIndex(int i) {
        return i % 2 != 0 ? i - 1 : i - 2;
    }

    private boolean isValidIndex(Integer restaIndex) {
        return restaIndex > -1;
    }

    public String invoke(AtomicInteger numbertoTransform, String romanTransformation, int index, RomanNumber romanNumber) {
        Integer restaIndex = getRestaIndex(index);
        if (isValidIndex(restaIndex)) {
            RomanNumber prev = RomanNumberDictionary.getRomanNumberAtIndex(restaIndex);
            while (numbertoTransform.get() >= romanNumber.getNumber() - prev.getNumber()) {
                romanTransformation += prev.getLetter() + romanNumber.getLetter();
                numbertoTransform.set(numbertoTransform.get() - romanNumber.getNumber() + prev.getNumber());
            }
        }
        return romanTransformation;
    }
}
