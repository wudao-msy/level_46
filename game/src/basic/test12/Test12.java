package basic.test12;

import java.util.Scanner;

/**
 * Author:msy
 * Date:2020-08-12 22:51
 * Description:<描述>
 * 问题描述
 * 　　给定n个十六进制正整数，输出它们对应的八进制数。
 * 输入格式
 * 　　输入的第一行为一个正整数n （1<=n<=10）。
 * 　　接下来n行，每行一个由0~{9}、大写字母{A}~F组成的字符串，表示要转换的十六进制正整数，每个十六进制数长度不超过100000。
 * 输出格式
 * 　　输出n行，每行为输入对应的八进制正整数。
 * 注意
 * 　　输入的十六进制数不会有前导0，比如012A。
 * 　　输出的八进制数也不能有前导0。
 * 样例输入
 * 2
 * 39
 * 123ABC
 * 样例输出
 * 71
 * 4435274
 * 提示
 * 　　先将十六进制数转换成某进制数，再由某进制数转换成八进制。
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        Long x[]=new Long[n];
        String z[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
            x[i]=Long.parseLong(s[i],16);
            z[i]=Long.toOctalString(x[i]);
        }

        for(int i=0;i<n;i++){

            System.out.println(z[i]);
        }






    }
}
