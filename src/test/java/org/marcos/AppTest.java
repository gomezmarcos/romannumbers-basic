package org.marcos;

import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;

public class AppTest {
    RomanNumberConverter romanNumberConverter = new RomanNumberConverter();

    @Test
    public void A() {
        assertEquals("I", romanNumberConverter.convertFromInteger(new AtomicInteger(1)));
        assertEquals("III", romanNumberConverter.convertFromInteger(new AtomicInteger(3)));
    }

    @Test
    public void D() {
        assertEquals("IV", romanNumberConverter.convertFromInteger(new AtomicInteger(4)));
        assertEquals("VIII", romanNumberConverter.convertFromInteger(new AtomicInteger(8)));
    }
    @Test
    public void I() {
        assertEquals("IX", romanNumberConverter.convertFromInteger(new AtomicInteger(9)));
        assertEquals("XIII", romanNumberConverter.convertFromInteger(new AtomicInteger(13)));
    }
    @Test
    public void K() {
        assertEquals("XIV", romanNumberConverter.convertFromInteger(new AtomicInteger(14)));
        assertEquals("XVIII", romanNumberConverter.convertFromInteger(new AtomicInteger(18)));
    }
    @Test
    public void M() {
        assertEquals("XIX", romanNumberConverter.convertFromInteger(new AtomicInteger(19)));
        assertEquals("XXXIX", romanNumberConverter.convertFromInteger(new AtomicInteger(39)));
    }
    @Test
    public void P() {
        assertEquals("XL", romanNumberConverter.convertFromInteger(new AtomicInteger(40)));
        assertEquals("LXXXIX", romanNumberConverter.convertFromInteger(new AtomicInteger(89)));
    }
    @Test
    public void R() {
        assertEquals("XC", romanNumberConverter.convertFromInteger(new AtomicInteger(90)));
        assertEquals("CCCXCIX", romanNumberConverter.convertFromInteger(new AtomicInteger(399)));
    }
    @Test
    public void T() {
        assertEquals("CD", romanNumberConverter.convertFromInteger(new AtomicInteger(400)));
        assertEquals("CDXCIX", romanNumberConverter.convertFromInteger(new AtomicInteger(499)));
    }
    @Test
    public void U() {
        assertEquals("D", romanNumberConverter.convertFromInteger(new AtomicInteger(500)));
        assertEquals("DCCCXCIX", romanNumberConverter.convertFromInteger(new AtomicInteger(899)));
    }
    @Test
    public void V() {
        assertEquals("CM", romanNumberConverter.convertFromInteger(new AtomicInteger(900)));
        assertEquals("CMXCIX", romanNumberConverter.convertFromInteger(new AtomicInteger(999)));
   }
    @Test
    public void W() {
        assertEquals("M", romanNumberConverter.convertFromInteger(new AtomicInteger(1000)));
    }
}
