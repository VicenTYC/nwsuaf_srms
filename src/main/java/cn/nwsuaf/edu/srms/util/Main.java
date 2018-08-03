package cn.nwsuaf.edu.srms.util;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/2
 * Time: 0:16
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer data = scanner.nextInt();

        BigInteger temp = new BigInteger(String.valueOf(data));
        BigInteger now = BigInteger.ZERO;
        BigInteger result = BigInteger.ZERO;

        for(int i = 1 ;i< 50 ;i++ ){
            now = now.multiply(BigInteger.TEN).add(BigInteger.ONE);
            if(now.mod(temp).equals(result)){
                System.out.println(now.divide(temp)+" "+i);
                break;
            }
        }

    }
}
