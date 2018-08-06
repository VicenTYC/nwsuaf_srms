package cn.nwsuaf.edu.srms.util;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/29
 * Time: 17:28
 */
public class MapUtil {

    public static Map<String,BigDecimal> init(){
        Map<String,BigDecimal> map = new HashMap<>();
        map.put("一月份",BigDecimal.ZERO);
        map.put("二月份",BigDecimal.ZERO);
        map.put("三月份",BigDecimal.ZERO);
        map.put("四月份",BigDecimal.ZERO);
        map.put("五月份",BigDecimal.ZERO);
        map.put("六月份",BigDecimal.ZERO);
        map.put("七月份",BigDecimal.ZERO);
        map.put("八月份",BigDecimal.ZERO);
        map.put("九月份",BigDecimal.ZERO);
        map.put("十月份",BigDecimal.ZERO);
        map.put("十一月份",BigDecimal.ZERO);
        map.put("十二月份",BigDecimal.ZERO);

        return map;
    }

    public static void merge(Map<String,BigDecimal> a,Map<String,BigDecimal> b) {

        if(b == null)
            return;

        for (Map.Entry<String,BigDecimal> entry: a.entrySet()) {
            if(!entry.getKey().equals("年份")) {
                entry.setValue(entry.getValue().add(b.get(entry.getKey())));
            }
        }
    }

}
