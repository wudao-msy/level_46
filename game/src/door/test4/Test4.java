package door.test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:msy
 * Date:2020-08-12 13:24
 * Description:<描述>
 *     Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 *
 * 当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 *
 * 输入格式
 * 输入包含一个整数n。
 * 输出格式
 * 输出一行，包含一个整数，表示Fn除以10007的余数。
 * 说明：在本题中，答案是要求Fn除以10007的余数，因此我们只要能算出这个余数即可，而不需要先计算出Fn的准确值，再将计算的结果除以10007取余数，直接计算余数往往比先算出原数再取余简单。
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        int n=Integer.valueOf(s);
        int f1=1,f2=1,f3=0;
        if(n<3){
            System.out.print("1");
            return;}
        for(int i=3;i<=n;i++)
        {
            if(f1>10007)f1=f1%10007;
            if(f2>10007)f2=f2%10007;
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        System.out.print(f3%10007);


    }
}
