package com.ntpan.mathutil.core;
//ta tạo bộ thư viện cung cấp các hàm tiện ích liên quan toán học
// vì là đồ tiện ích dùng chung, tool cho nhiều noi sử dụng -> hàm static
public class MathUtility {
    //hàm tính n! = 1, 2, 3 .. n
    //ko có giai thừa số âm
    //0! = 1! = 1
    //20! vừa đủ kiểu long, 18 con số 0
    //bài này ko chơi voi 21! trờ len
    public static long getFactorial(int n) {
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid number. n must be between 0 to 20");

        if(n == 0 || n == 1)
            return 1;//0! la 1

        //song sot den cho nay, n = 2 3 4 ...
        //vong for nhân dồn - nguyen li con heo dat
        long result = 1;//tich ban dau la 1
        for (int i = 2; i <= n; i++)
            result *= i;

        return  result;
    }
}
