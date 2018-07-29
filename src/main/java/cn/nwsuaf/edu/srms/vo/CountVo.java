package cn.nwsuaf.edu.srms.vo;

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
    private BigDecimal totalPrice;

    public CountVo(String name, BigDecimal total_price) {
        this.name = name;

        if(total_price == null)
            this.totalPrice = new BigDecimal("0");
        else
            this.totalPrice = total_price;
    }

    public void add(CountVo countVo){
        this.name = countVo.name;
        this.totalPrice  = this.totalPrice.add(countVo.totalPrice);
    }

    public CountVo check(){
        if(totalPrice == null)
            this.totalPrice = new BigDecimal("0");
        return this;
    }

}
