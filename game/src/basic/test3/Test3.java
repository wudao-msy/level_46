package basic.test3;

import java.util.Scanner;

/**
 * Author:msy
 * Date:2020-08-12 14:05
 * Description:<描述>
 * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
 *
 * ABCDEFG
 *
 * BABCDEF
 *
 * CBABCDE
 *
 * DCBABCD
 *
 * EDCBABC
 *
 * 这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
 *
 * 输入格式
 * 输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
 * 输出格式
 * 输出n行，每个m个字符，为你的图形。
 * 样例输入
 * 5 7
 * 样例输出
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * 数据规模与约定
 * 1 <= n, m <= 26。
 */
public class Test3 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    String  num[][]=new String[n][m];


    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("*****");

        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
