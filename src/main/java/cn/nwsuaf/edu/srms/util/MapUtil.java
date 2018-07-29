package cn.nwsuaf.edu.srms.util;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/29
 * Time: 17:28
 */
public class MapUtil {

    public static void merge(Map<String,BigDecimal> a,Map<String,BigDecimal> b) {
        for (Map.Entry<String,BigDecimal> entry: a.entrySet()) {
            if(!entry.getKey().equals("年份")) {
                entry.setValue(entry.getValue().add(b.get(entry.getKey())));
            }
        }
    }

}
