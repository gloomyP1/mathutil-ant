/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gloomyp.mathutil.main;

import com.gloomyp.mathutil.core.MathUtility;

/**
 *
 * @author HoangPhuc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenWrongArgumentThrowsException();
        
        // TODO code application logic here
    }
    //thiết kế hàm getF() là:chỉ tính n! từ 0...20 
    //Nếu đưa n<0 hoặc n>20 thì hàm sẽ không tính,chửi = cách ném ra ngoại lệ
    //Thực tế hàm getF() khi chạy có làm được như thiết kế hay k
    //phải test thử,chạy thử mới biết được
    public static void testFactorialGivenWrongArgumentThrowsException(){
        //Test case #4:Test getF() with n=-5,wrong argument
        //Expected value:an exception is thrown
        //               IllegalArgumentException
        System.out.println("Test -5!: expected = Illegal Argument Exception is Thrown!");
        MathUtility.getFactorial(-5);
        
    }
    //dân dev phải có trách nhiệm test code của mình chạy đúng hay sai
    //trước khi lắp ráp nó với các class khác để tạo nên các chức năng
    //có nhiều quy tắc đặt tên hàm cho việc kiểm thử hàm
    //thường tên hàm sẽ bao hàm ý nghĩ của việc kiểm thử
    //ví dụ hàm dưới này sẽ dùng để test cái hàm tính giai thừa
    //trong tình huống-case đưa n đúng chuẩn,thì ta hy vọng -expected
    //hàm chạy ngon như thiết kế,ví dụ n=5 thì hàm phải trả vê 120
    //tức là 5! hy vọng hàm tính ra 120
    public static void testFactorialGivenRightArgumentRunsWell(){
        
        //Test Case #1: Test getFactorial with n=0
        //Expected value: 1 hy vọng đưa n=0 thì hàm trả về 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = (long) MathUtility.getFactorial(n);
        
        System.out.println("Test" + n + "!: expected ="+ expectedValue +" | actual: " + actualValue);
        
        //Test case #2:Test getFactorial with n=1
        //Expected value:hy vong 1! app tra ve 1
        n=1;
        expectedValue=1;
        System.out.println("Test" + n + "!: expected ="+ expectedValue +" | actual: " + actualValue);
        
        //Test case #3:test getFactorial with n=3
        //Expected value:hy vong 3! app tra ve 6
        
        n=3;
        expectedValue=6;
        System.out.println("Test" + n + "!: expected ="+ expectedValue +" | actual: " + MathUtility.getFactorial(3));
        
    }
}
