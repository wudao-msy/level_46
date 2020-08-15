package door.test2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Author:msy
 * Date:2020-08-12 13:07
 * Description:
 * 求1+2+3+...+n的值。
 * 1 <= n <= 1,000,000,000。
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        long n=Integer.valueOf(s);
        long sum=n*(n+1)/2;
        System.out.println(sum);
    }
}
