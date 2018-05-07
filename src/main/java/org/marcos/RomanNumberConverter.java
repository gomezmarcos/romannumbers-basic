package org.marcos;

import org.marcos.converter.NotRegularNumberConverter;
import org.marcos.converter.RegularNumberConverter;
import org.marcos.domain.RomanNumber;

import java.util.concurrent.atomic.AtomicInteger;

public class RomanNumberConverter {

    private RegularNumberConverter regularNumberConverter = new RegularNumberConverter();
    private NotRegularNumberConverter notRegularNumberConverter = new NotRegularNumberConverter();

    public String convertFromInteger(AtomicInteger numbertoTransform) {
        String romanTransformation = "";
        for (int index = RomanNumberDictionary.size()-1; index >= 0; index--)
            romanTransformation = convertNumberToRoman(numbertoTransform, romanTransformation, index);
        return romanTransformation;
    }

    private String convertNumberToRoman(AtomicInteger numbertoTransform, String romanTransformation, int index) {
        RomanNumber romanNumber = RomanNumberDictionary.getRomanNumberAtIndex(index);
        romanTransformation = regularNumberConverter.invoke(numbertoTransform, romanTransformation, romanNumber);
        romanTransformation = notRegularNumberConverter.invoke(numbertoTransform, romanTransformation, index, romanNumber);
        return romanTransformation;
    }


}
