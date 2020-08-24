package basic.test22;

import java.util.Scanner;

/**
 * Author:msy
 * Date:2020-08-22 22:05
 * Description:<描述>
 *     问题描述
 * 　　FJ在沙盘上写了这样一些字符串：
 * 　　A1 = “A”
 * 　　A2 = “ABA”
 * 　　A3 = “ABACABA”
 * 　　A4 = “ABACABADABACABA”
 * 　　… …
 * 　　你能找出其中的规律并写所有的数列AN吗？
 * 输入格式
 * 　　仅有一个数：N ≤ 26。
 * 输出格式
 * 　　请输出相应的字符串AN，以一个换行符结束。输出中不得含有多余的空格或换行、
 *
 * 回车符。
 * 样例输入
 * 3
 * 样例输出
 * ABACABA
 */
public class Test22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String [10000];
        a[0]="A";
        for(int i=1;i<26;i++){
            a[i]=a[i-1]+(char)Integer.parseInt(String.valueOf(65+i))+a[i-1];
        }
        System.out.println(a[n-1]);
    }
}
