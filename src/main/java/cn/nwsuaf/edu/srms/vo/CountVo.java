package cn.nwsuaf.edu.srms.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/27
 * Time: 21:10
 */
@Data
@NoArgsConstructor
public class CountVo {

    private String name;
    private BigDecimal total_price;

    public CountVo(String name, BigDecimal total_price) {
        this.name = name;

        if(total_price == null)
            this.total_price = new BigDecimal("0");
        else
            this.total_price = total_price;
    }
}
