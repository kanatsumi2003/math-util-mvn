/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kanatsumeow.mathutil.core;

/**
 *
 * @author kanat
 */
//class này sẽ chứa 1 loạt cá hàm static dùng để làm thư viện cho các nơi khác, class khác xài !!!!
public class MathUtility {
    public static final double PI = 3.14;
    //public const double PI = 3.14; //C# ko cần static mà vẫn giống vì có chữ const ~ final
    
    //hàm tính n! = 1.2.3....n
    //0! = 1! = 1 - quy ước
    //ko tính đc giai thừa số âm
    //n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 con số 0
    //vậy 21! ko chứa trong long đc, tràn kiểu dữ liệu !
    //quy ước < 0 ! và > 20! ném ngoại lệ, k tính đc
//    public static long getFactorial(int n){
//        if(n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        
//        if(n == 0 || n == 1) return 1;
//        
//        long result = 11; //biến tích lũy, gom dồn việc nhân, biến con heo đất
//                         //acc /accmulation
//
//       //sống sót đến for, sure n = 2..20                  
//       for (int i = 2; i <= n; i++) result *= i;
//        
//        
//        return result;
//    } 
    
        //5! = 1.2.3.4.     5
        //5! =         4! . 5 = 5 . 4!
        //4! = 1.2.3.  4
        //          3! .4 = 4 x 3! đuổi nhau
        //3! = 3 . 2!
        //2! = 2 . 1! dừng nhen, đệ quy luôn phải dừng
        //N! = N x (N - 1)! đệ quy là gọi lại chính mình với quy mô nhỏ hơn
        //                   Búp bê nga
    public static long getFactorial(int n){
        if(n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be 0..20");
        
        if(n == 0 || n == 1) return 1;
        
        return n * getFactorial(n - 1);
    } 
    // Kĩ thuật kiểm thử gọi là: Regresssion Testing
    //                           Kiểm thử hồi quy - Test lại những thứ
    //                           Đã từng test
    //Trong thực tế làm dự án, code của ta sẽ liên tục đc chỉnh sửa
    //sửa vì:
    //fix bug thì phải sửa code, sửa hàm
    //thêm hàm, thêm tính năng
    //tối ưu hàm cũ, làm hàm cũ gọn hơn, dễ đọc hơn, chạy nhanh hơn
    //Hàm đang ngon - màu xanh, nếu ta sửa hàm vì lí do gì đó
    //Liệu rằng hàm còn xanh hay ko, thì phải test lại
    //Nếu test = tay, bằng log, thì cực kì tốn tgian, mất sức
    //Nếu code của ta có sẵn test script = code kiểm thử
    //Ta chỉ việc run lại cái test script này
    //Nếu hàm sửa ngon, nó phải ra màu xanh
    //Nếu hàm sửa ko ngon, bị màu đỏ !!!
    //Nhớ test script ta verify lại 1 hàm rất nhanh -> Kiểm thử lại
    //Thử đã từng kiểm thư để đảm bảo nó còn ngon so với trước
    //Khi sửa đc gọi là kiểm thử hồi quy - Regression Testing
    //Nhờ CI, hồi quy liên tục
    
    //Bài này mình thử hồi quy = cách sửa lại hàm theo thuật toán
    //Đệ quy - Recursion
    
}
