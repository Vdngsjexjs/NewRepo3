package TestingCasesforLoginClass;

import Classestobetested.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    Calculator calculateProduct;
    @Test
    void testCase1() //when both numbers are +ve
    {
        calculateProduct=new Calculator();
        int result=calculateProduct.product(2,2);
        assertEquals(4,result);
    }
    @Test
    void testCase2() //when one number is 0
    {
        calculateProduct=new Calculator();
        int result=calculateProduct.product(5,0);
        assertEquals(0,result);
    }
    @Test
    void testCase3() //when one number is -ve
    {
        calculateProduct=new Calculator();
        int result=calculateProduct.product(-6,7);
        assertEquals(-42,result);
    }
    @Test
    void testCase4() //wwhen both numbers are -ve
    {
        calculateProduct=new Calculator();
        int result=calculateProduct.product(-6,-8);
        assertEquals(48,result);
    }
    @Test
    void testCase5()  //when both numbers are 0
    {
        calculateProduct=new Calculator();
        int result=calculateProduct.product(0,0);
        assertEquals(0,result);
    }

}