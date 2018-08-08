package cn.nwsuaf.edu.srms.util;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/8/8
 * Time: 21:49
 */
public class StringUtil {
    public static String isLike(String str){
        if(!str.equals("%")) {
            str = "%"+str+"%";
        }
        return str;
    }
}
