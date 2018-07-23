package cn.nwsuaf.edu.srms.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterParts {
    private Integer id;

    private Integer partsId;

    private Integer producerId;

    private Integer supplierId;

    private BigDecimal price;

    private Integer count;

    private BigDecimal totalPrice;

    private String remark;

    private Integer userId;

    private Date createTime;

    private Integer status;

}