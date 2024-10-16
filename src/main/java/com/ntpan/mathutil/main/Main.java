package com.ntpan.mathutil.main;

import static com.ntpan.mathutil.core.MathUtility.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenWrongArgumentMinus5ThrowException();
    }

    //test case#4
    //Description: test factorial with invalid numer argument, e.g.n = -5
    //step:
    //  call getFactorial(-5)
    //expected result:
    //  an exception is thrown - kif vong 1 ngoai le xh
    //dien giai them: ham cua ta thiet ke rang neu dua n am -> ham se chui
    //vay neu ta test n am, ta se nhan ve chui -> ham ta chay dung nhu thiet ke
    //thay ngoai le mung roi nuoc mat
    static void testFactorialGivenWrongArgumentMinus5ThrowException(){
        getFactorial(-5);
    }

    //về lí thuyết ta phải test với data n = 2, 3,...20
    //test case #3:tự viết nốt
    static void testFactorialGivenRightArgument5RunsWell(){
        System.out.println("5! expected = 120 \nactual = " + getFactorial(5));
    }

    //test case #2:
    //Description:  Check getFactorial method with valid argument(n = 1)
    //Steps/Procedures(cách test, cac buoc veryfy hàm, chức năng
    // Call function/method with n = 1 getFactorial(1)
    //Expected result(hy vọng gọi 1! giá trị trả về là mấy
    //to have 1 as the result of 1!
    //Status(passed, failed-bug): mình phải run hàm và nhìn giá trị trả về mới biết hàm chạy đúng hay sai
    //  PASSED!!!!!!!!
    //Chạy test case/ chạy các bước ở trn để xác định hàm đúng sai
    //-> gọi là test run
    static void testFactorialGivenRightArgument1RunsWell(){
        int n = 1;//data đưa vào
        long expectedResult = 1; //hy vọng 1! = 1
        long actualResult = getFactorial(n);//named-argument
        //so sánh bằng mắt để luận kết quả đúng sai
        System.out.println("1! expected " + expectedResult + "\nactual : " + actualResult);
    }

    //Cac test case de o day, lat hoi run trong main
    static void testFactorialGivenRightArgument0RunsWell(){
        //test case 1:
        //Description:  Check getFactorial function with valid argument(n = 0)
        //Steps:
        // Call function/method with n = 0 getFactorial(0)
        //Expected result:
        //  get 1 as the result of 0!
        //Actual result/Status(passed, failed) (waiting for test run)
        //

        //TEST RUN: run cai test case
        long expectedResult = 1;
        long actualResult = getFactorial(0);//named-argument
        System.out.println("expected value: " + expectedResult + " | actual value: " + actualResult);
    }
}