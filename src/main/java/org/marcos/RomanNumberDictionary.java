package org.marcos;

import org.marcos.domain.RomanNumber;

import java.util.ArrayList;
import java.util.List;

public class RomanNumberDictionary {
    private static List<RomanNumber> romanValues = new ArrayList<>();
    static {
        romanValues.add(new RomanNumber("I", 1));
        romanValues.add(new RomanNumber("V", 5));
        romanValues.add(new RomanNumber("X", 10));
        romanValues.add(new RomanNumber("L", 50));
        romanValues.add(new RomanNumber("C", 100));
        romanValues.add(new RomanNumber("D", 500));
        romanValues.add(new RomanNumber("M", 1000));
    }

    public static Integer size(){
        return romanValues.size();
    }

    public static RomanNumber getRomanNumberAtIndex(Integer index) {
        return romanValues.get(index);
    }
}
