package basic.test14;

import java.util.Scanner;

/**
 * Author:msy
 * Date:2020-08-13 10:49
 * Description:<描述>
 * 给定一个以秒为单位的时间t，要求用“::”的格式来表示这个时间。表示时间，表示分钟，而表示秒，它们都是整数且没有前导的“0”。例如，若t=0，则应输出是“0:0:0”；若t=3661，则输出“1:1:1”。
 * 输入格式
 * 　　输入只有一行，是一个整数t（0<=t<=86399）。 输出格式 　　输出只有一行，是以“::”的格式所表示的时间，不包括引号。
 * 样例输入
 * 0
 * 样例输出
 * 0:0:0
 * 样例输入
 * 5436
 * 样例输出
 * 1:30:36
 */
public class Test14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int hour,minute,second;
        if(t>=0&&t<=86399){
            if(t==0){
                hour=minute=second=0;
            }else{
                 hour=t/3600;
                 minute=t%3600/60;
                 second=t%3600%60;
            }

            System.out.println(hour+":"+minute+":"+second);
        }

    }
}
