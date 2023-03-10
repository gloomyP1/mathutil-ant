/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gloomyp.mathutili.core.test;

import com.gloomyp.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author HoangPhuc
 */
@RunWith(value = Parameterized.class)
//báo với JUnit rằng code trong class này tao sẽ tách data và
//hàm so sánh riêng biệt nhau-DATA DRIVEN TESTING
//tách thì phải có kĩ thuật nhồi/fill data trở lại lệnh so sánh
//fill trở lại thông qua biến -biến chứa value đc thay đổi
//DDT có anh em nương tựa với parameterized-tham số hóa data
public class MathUtilityAdvancedTest {
    
    //chuẩn bị mạng 2 chiều để chứa data trong các test case
    //sẽ dùng
    //quy ước mảng phải là static public
    @Parameterized.Parameters
    public static Object[][] initData(){
       
        return new Object[][] {
                                 {0, 1},
                                 {1, 1},
                                 {2, 2},
                                 {3, 6},
                                 {4, 24},
                                 {5, 120},
                                 {6, 720}
                                 
        };
    }
    
    //map từng cặp data ở trên vào 2 biến,đẩy  biến này vào
    //hàm assertEquals() đã quên
    @Parameterized.Parameter(value = 0) //lấy cột 0 của mảng gán vào
    public int n;
    @Parameterized.Parameter(value = 1) //lấy cột 0 của mảng gán vào
    public long expected;
    
    //test th
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
    
}
