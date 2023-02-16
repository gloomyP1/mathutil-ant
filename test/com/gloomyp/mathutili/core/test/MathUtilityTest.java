/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gloomyp.mathutili.core.test;




import com.gloomyp.mathutil.core.MathUtility;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class MathUtilityTest {
    
    //Kiểm thử ngoại lệ thì sao
    //tức là hàm getF() đc thiết kế nếu rằng đưa n cà chớn
    //thì hàm phai ném ra ngoại lệ!!
    //tức là getF(-5) thì Expected== ngoại lệ Illegal argument excpetion
    //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    @Test(expected = Exception.class)
    public void testFactorialGIvenWrongArgumentThrowsException(){
       //Test case #5:getF() with a wrong arg: n = -5
       //Expected result:An exception is thrown:Illegal Argument Exception
        MathUtility.getFactorial(-5);
        //Nếu chỉ gõ lệnh trên thì BỊ MÀU ĐỎ
        //DO LỆNH NÀY GÂY RA EXCEPTION,VÀ EXCEPTION LÀ
        //MÀU ĐỎ
        //NHƯNG HÀM NÀY MÌNH KÌ VỌNG RA EXCEPTION,NẾU CÓ EXP
        //THÌ HÀM ĐÚNG NHƯ THIẾT KẾ,ĐÚNG THIẾT KẾ THÌ PHẢI XANH
        //LỖI CỦA TA LÀ KO ĐỎ,KO SO SÁNH,O CHƯA NHẬN
        //DIỆN LÀ ĐẪ CÓ NGOẠI LỆ RỒI!!!
        //TA CẦN THÊM 1 LỆNH:ĐÃ CÓ NGOẠI LỆ CHƯA??
        //CÓ RỒI ->XANH
        //CHƯA -> ĐỎ
        //JUnit 4 hok dùng hàm assert() để đo ngoại lệ
        //JUnit 5 dùng hàm assert() để đo ngoại lệ
    }
    
    
    
    @Test
    //trong ham nay se chua cac test case de test getF voi n hop le trong khoang 0-20
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case #1 test getF() with n = 0
        //Exoected result = 1; // hi vong 0! = 1
        int n=0;
        long expectedValue = 1;//hy vong 0!=1
        long actualValue = (long) MathUtility.getFactorial(0);//thuc te getF() trả về mấy
        
       Assert.assertEquals(expectedValue,actualValue);
       
       //Test case#2:test getF() with n=5;
       //expected result=120;//Hy vọng 5!=120 xem máy có tính như vậy k
       Assert.assertEquals(120,MathUtility.getFactorial(5));
       
       //Test case #4:test getF() with n = 6;expected=720
       Assert.assertEquals(720,MathUtility.getFactorial(6));
       
       
    }
   
    
}