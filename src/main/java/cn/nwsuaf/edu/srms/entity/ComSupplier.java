package cn.nwsuaf.edu.srms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComSupplier {
    private Integer id;

    private String name;

    private String phone;

    private String address;

}