package basic.test11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:msy
 * Date:2020-08-12 22:45
 * Description:<描述>
 * 问题描述
 * 　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
 * 　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
 * 样例输入
 * FFFF
 * 样例输出
 * 65535
 */
public class Test11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String s=bufferedReader.readLine();
        System.out.println(Long.parseLong(s,16));
    }
}
