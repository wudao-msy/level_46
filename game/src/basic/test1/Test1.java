package basic.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:msy
 * Date:2020-08-12 13:27
 * Description:<描述>
 * 给定一个年份，判断这一年是不是闰年。
 *
 * 当以下情况之一满足时，这一年是闰年：
 *
 * 1. 年份是4的倍数而不是100的倍数；
 *
 * 2. 年份是400的倍数。
 *
 * 其他的年份都不是闰年。
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int year=Integer.parseInt(bufferedReader.readLine());

        if(year%4==0&&year%100!=0){
            System.out.println("闰年");
        }

        else if(year%400==0){
            System.out.println("闰年");
        }

        else{
            System.out.println("不是闰年");
        }
        System.out.println("124");
    }
}
