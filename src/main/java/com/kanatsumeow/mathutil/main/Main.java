/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.kanatsumeow.mathutil.main;

import com.kanatsumeow.mathutil.core.MathUtility;


public class Main {

    public static void main(String[] args) {
        int n = 0; //given n = 0, ý là muốn tính 0!
        long expected = 1; //ý muốn là hàm n! = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n); //ý nói rằng hàm chạy ra mấy, invoke, call
        
        //so sánh giữa expected vs actual
        System.out.println(n + "! => expected: " + expected + 
                                " | actual = " + actual);
        
        //Test case #2 - N = 1 -> xem chi tiết mô tả ở dưới
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! => expected: " + expected + 
                                " | actual = " + actual);
        
        
        //Test case #3 - N = 5 -> xem chi tiết mô tả ở dưới
        System.out.println("5! => expected: 120" +
                                " | actual = " + MathUtility.getFactorial(5));

    }
    
}
//Test case #2: Verify getFactorial(with n = 1)
//Steps/Procedures: 
//          1. Given n = 1
//          2. Call/invoke getFactorial(n = 1);

//Expected result:
//              the method must return 1 in case of 1!
//Status: Passed | Failed



//Test case #3: Verify getFactorial(with n = 5)
//Steps/Procedures:
//          1. Given n = 5
//          2. Call/invoke getFactorial(n = 5);

//Expected result:
//              the method must reutrn 120 in case of 5!
//Status: Passed | Failed




//Mình là dev, mình phải test code của mình ngon trước đã
//Muốn test code (dev) hay test app (QC/TESTER) thì cần phải chuẩn bị
//Test case - tình huống kiểm thử, trường hợp kiểm thử - cách ta
//            Kiểm thử trong 1 ngữ cảnh nào đó - bàn về bộ data
//1 test case có cấu trức như sau:
//ID | Description | Steps/Procedures | Expeced Result | Status (Passed/Failed)

//Dev em muốn kiểm thử coi hàm chính em viết getFactorial() đúng hay sai
//thì em phải thiết kế các test case

//Test case #1: Verify getFactorial(with n = 0)
//Steps/Procedures:                     [các bước run app để test]
//          1. Given n = 0
//          2. Execute/Call/Invoke function getFactorial(0)

//Expected Result: the function must return 1 (standing for 0! = 1)
//Status: Passed, or Failed, ai biết, chờ run app/hàm cái đã !!!

//Run hàm, run app, đưa test data vào, đc gọi là test run

