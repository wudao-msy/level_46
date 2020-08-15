package basic.test9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:msy
 * Date:2020-08-12 22:14
 * Description:<描述>
 * 问题描述
 * 　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
 * 　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
 * 输入格式
 * 　　输入一行，包含一个正整数n。
 * 输出格式
 * 　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
 * 样例输入
 * 52
 * 样例输出
 * 899998
 * 989989
 * 998899
 * 数据规模和约定
 * 　　1<=n<=54。
 */
public class Test9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferedReader.readLine());
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=9;k++){
                    if(2*(i+j+k)==n){
                        System.out.println(i+""+j+""+k+""+k+""+j+""+i);
                    }
                    else if(2*(i+j)+k==n){
                        System.out.println(i+""+j+""+k+""+j+""+i);
                    }
                }

            }
        }
    }
}
