package cn.nwsuaf.edu.srms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;

    private String username;

    private String password;

    private String name;

    private Integer sex;

    private String phone;

    private String telephone;

    private String email;

    private Integer type;

}