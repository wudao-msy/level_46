package basic.test2;

/**
 * Author:msy
 * Date:2020-08-12 13:34
 * Description:<描述>
 * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
 *
 * 00000
 *
 * 00001
 *
 * 00010
 *
 * 00011
 *
 * 00100
 *
 * 请按从小到大的顺序输出这32种01串。
 *
 * 输入格式
 * 本试题没有输入。
 * 输出格式
 * 输出32行，按从小到大的顺序每行一个长度为5的01串。
 * 样例输出
 * 00000
 * 00001
 * 00010
 * 00011
 */
public class Test2 {
    public static void main(String[] args) {
        for(int i=0;i<=1;i++){
            for(int j=0;j<=1;j++){
                for(int k=0;k<=1;k++){
                    for(int m=0;m<=1;m++){
                        for(int n=0;n<=1;n++){
                            System.out.println(i+" "+j+" "+k+" "+m+" "+n);
                        }
                    }
                }
            }
        }
    }
}
