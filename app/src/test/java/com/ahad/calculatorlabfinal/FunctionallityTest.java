package com.ahad.calculatorlabfinal;

import org.junit.Test;
import static org.junit.Assert.*;

public class FunctionallityTest {
    MainActivity mainActivity = new MainActivity();
    @Test
    public void decimalTest(){
        assertEquals(20.3432,mainActivity.FourDecimalPrecision(20.34323424),0);
    }
}
