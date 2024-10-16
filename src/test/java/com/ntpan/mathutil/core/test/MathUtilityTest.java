package com.ntpan.mathutil.core.test;

import static com.ntpan.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //test case #3: check getFactorial() with n = -5...to see the Exception
    //toi muon thay co ngoai le xuat hien trong tinh huong n am or n > 20
    //ngoai le co xh nhu du kien hay ko..neu co thi phai la mau xanh
    //NGHE KI: co ngoai le, nhung la mau xanh, vi ngoai le xh nhu du kien
    @Test
    void testFactorialGivenWrongArgumentThrowsException() {
        //getFactorial(-5);
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(-5);});
        assertThrows(IllegalArgumentException.class, () -> {getFactorial(22);});
    }

    //Test case #2: Check getFacrorial with n = 5 to see result of 120
    @Test
    void testFactorialGivenRightArgument5RunsWell(){
        assertEquals(1,getFactorial(1));
        assertEquals(2,getFactorial(2));
        assertEquals(6,getFactorial(3));
        assertEquals(24,getFactorial(4));
        assertEquals(120, getFactorial(5));
        assertEquals(720, getFactorial(6));
    }

    //quy tac xanh do cua unit test tool/ framework
    //neu tat ca cac test case passed(expected == actual) => mau xanh
    //chi can 1 trong nhung test case failed(expected != actual) => mau do
    //ly do: ham da dung thi phai dung het voi cac test case da dua ra
    //mat chi nhin 2 tin hieu - xanh, do theo style gop cac ket qua
    //xanh: dung het, do: 1 thang nao chet -> bo ham, fix lai...

    //ky thuat viet code chinh ( ham trong api, core..)
    //ma di kem code test ham luon, dung 2 trng thai xanh do, cu lien tuc code xong chay
    //xanh do, xanh do lien tuc trong qua trinh viet code dc goi la TDD
    //test driven developemment - viet code song hanh cung code test

    //cau truc test case: Id, Decs, Steps/Procedurs, Expected value, Actual value,
    // Status: Passed, Failed
    //Test date, bug #(bug id) Bugzilla(Bug DB), jira

    //Test case #1: Check getFacrorial with n = 0 to see result of 1
    @Test
    void testFactorialGivenRightArgument0RunsWell() {
        long expectedValue = 1;//hy vong 0! tra ve 1
        long actualValue = getFactorial(0);
        //so sanh
        //truyen thong: ta sout in ket qua va nhin = mat de doan dung sai
        //hien dai: xai them tool, thu vien, unit teting framework JUnit
        //giup doi mat ta nhin ket qua dung sai qua 2 mau xanh va do
        //nao va mat ko can nhin, doan va ket luan nhu truyen thong
        //ma nay thay do => tach, xanh => on
        assertEquals(expectedValue, actualValue);
        //giong nhau mau xanh, lech nhau mau do ham chay ko ra kq nhu mong doi
    }
}