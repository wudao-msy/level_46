package basic.test5;

import java.util.Scanner;

/**
 * Author:msy
 * Date:2020-08-12 16:40
 * Description:<描述>
 * 给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
 *
 * 输入格式
 * 第一行包含一个整数n。
 *
 * 第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。
 *
 * 第三行包含一个整数a，为待查找的数。
 *
 * 输出格式
 * 如果a在数列中出现了，输出它第一次出现的位置(位置从1开始编号)，否则输出-1。
 * 样例输入
 * 6
 * 1 9 4 8 3 9
 * 9
 * 样例输出
 * 2
 * 数据规模与约定
 * 1 <= n <= 1000。
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            int a[]=new int[n];
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
            int key=sc.nextInt();
            int count=0;
            for(int i=0;i<a.length;i++){
                if(key==a[i]){
                    System.out.println(i+1);
                    count=1;
                    break;
                }
            }
            if(count!=1){
                System.out.println("-1");
            }

        }




    }
}
