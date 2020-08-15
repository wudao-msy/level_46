package door.test3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * Author:msy
 * Date:2020-08-12 13:16
 * Description:<描述>
 *     给定圆的半径r，求圆的面积。
 *     输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        BigDecimal bigDecimal=new BigDecimal(reader.readLine());
        BigDecimal s = bigDecimal.multiply(bigDecimal.multiply(new BigDecimal(Math.PI))).setScale(7,BigDecimal.ROUND_HALF_UP);

        System.out.println(s);
    }
}
