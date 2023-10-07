/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vng.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author TinDinh
 */
public class MathUtilityTest {
    
    // cấu trúc testcase: ID | Desc | Steps/Procedures | Expected Result | Status
    // Testcase #1 - Verify getFactorial (with n = 0)
    // Steps:
    //          1. Given n = 0
    //          2. Call/ invoke getFactorial (n = 0)
    // Expected Result:
    //          the method must return 1 as the result of 0!
    // Status: PASSED | FAILED đoán xem, chờ code xong, chạy mới biết được
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    //Testcase #2:
     @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
     @Test
    public void verifyFactorialGivenRightArgument2ReturnsOk(){
        assertEquals(120, MathUtility.getFactorial(5));
    }
   
}
