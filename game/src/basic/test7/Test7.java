package basic.test7;

/**
 * Author:msy
 * Date:2020-08-12 19:19
 * Description:<描述>
 * 问题描述
 * 　　153是一个非常特殊的数，它等于它的每位数字的立方和，即153=111+555+333。编程求所有满足这种条件的三位十进制数。
 * 输出格式
 * 　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
 */
public class Test7 {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
           int bai=i/100;
           int shi=(i%100)/10;
           int ge=(i%100)%10;
           if(bai*bai*bai+shi*shi*shi+ge*ge*ge==i){
               System.out.println(i);
           }
        }
    }
}
