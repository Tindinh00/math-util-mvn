/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vng.mathutil.core;

/**
 *
 * @author TinDinh
 */

// Đây là bộ thư viện chứa các hàm dùng trong toán học 
// tính toán, clone giống class Math bên JDK
// khi gọi là thư viện dùng chung mà không cần nhớ nhung gì
// sau khi xử lý -> thư viện chứa đồ STATIC
public class MathUtility {
    public static final double PI = 3.1415;
    
    //hàm tính n! = 1.2.3.4.5...n
    //n<0 n > 20 không tính do 21! tràn kiểu long
    // ko tính giai thừa âm!!!
    //0! = 1! = 1
    public static long getFactorial(int n){
        long result =1;
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if(n == 0 || n ==1)
            return 1;
        
        for (int i = 2; i <= n; i++) 
            result *= i;
        
        return result;
        
    }
}
