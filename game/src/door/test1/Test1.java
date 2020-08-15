package door.test1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Author:msy
 * Date:2020-08-12 13:03
 * Description:<描述>
 *     输入A、B，输出A+B。
 *     -10000 <= A, B <= 10000。
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        System.out.println(a+b);

    }


}
