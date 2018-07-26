package cn.nwsuaf.edu.srms.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/26
 * Time: 16:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterVo {

    private Integer id;

    private Integer goodsId;
    private String goodsName;
    private Integer maintainerId;
    private String maintainerName;
    private Integer supplierId;
    private String supplierName;
    private Integer producerId;
    private String producerName;

    private BigDecimal price;
    private Integer count;
    private BigDecimal totalPrice;
    private String remark;

    private Integer userId;
    private String userName;

    private Date createTime;
    private Integer status;
}
