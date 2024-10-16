package com.ntpan.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    // @Test là 1 phần anotation của framework, biến hàm của ta thành hàm main để có thể run
    // hàm bình thường chỉ có thể trong main để chạy
    // @Test biến hàm bất kì thành main()

    //Kỹ thuật DDT(data driven testing: là kỹ thuật tách bộ data kiểm thử ra khỏi các câu lệnh kiểm thử
    // mục đích giúp developer nhìn nhanh đc xem bộ test case coòn thiếu case nào hay ko
    // Kỹ thuật này còn gọi tên khác là tham số hóa bộ data kiểm thử
    //                                                  parameter testing

    //Ta làm riêng 1 hàm, phải là static, để lưu bộ data kiểm thử
    public static Object[][] initTestData(){
        return new Object[][] {
                {0,1},
                {1, 1},
                {2, 2},
                {3,6},
                {4, 24},
                {5, 120},
                {6, 720},
        };
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenRightArgumentsRunsWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }

    public static Integer[] initTestDataForCheckingException(){
        return new Integer[]{-1, -2, -3, -4, -5, -6, -100, 21, 22, 23, 24, 100};
    }

    @ParameterizedTest
    @MethodSource("initTestDataForCheckingException")
    void testFactorialGivenWrongArgumentsThrowsException(int n){
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(n));
    }
    }