package basic.test16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author:msy
 * Date:2020-08-13 11:12
 * Description:<描述>
 * 问题描述
 * 　　求出区间[a,b]中所有整数的质因数分解。
 * 输入格式
 * 　　输入两个整数a，b。
 * 输出格式
 * 　　每行输出一个数的分解，形如k=a1a2a3…(a1<=a2<=a3…，k也是从小到大的)(具体可看样例)
 * 样例输入
 * 3 10
 * 样例输出
 * 3=3
 * 4=22 5=5 6=23
 * 7=7
 * 8=222
 * 9=33 10=25
 * 提示
 * 　　先筛出所有素数，然后再分解。
 * 数据规模和约定
 * 　　2<=a<=b<=10000
 */
public class Test16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        boolean flag;
        for(int i=2;i<=b;i++){
            flag=false;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                list.add(i);
            }
        }
        int c[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            c[i]=list.get(i);
            System.out.print(c[i]+" ");
        }

        for(int i=a;i<=b;i++){
            flag=false;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                list.add(i);
            }
        }
    }
}
