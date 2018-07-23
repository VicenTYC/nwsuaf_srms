package cn.nwsuaf.edu.srms.entity;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterMaintain {
    private Integer id;

    private Integer maintainId;

    private Integer maintainerId;

    private Integer supplierId;

    private BigDecimal price;

    private Integer count;

    private BigDecimal totalPrice;

    private String remark;

    private Integer userId;

    private Date createTime;

    private Integer status;

}