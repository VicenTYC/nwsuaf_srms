package cn.nwsuaf.edu.srms.vo;

import cn.nwsuaf.edu.srms.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/23
 * Time: 21:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {
    private String username;

    private String name;

    private String sex;

    private String phone;

    private String telephone;

    private String email;

    private String role;

    public UserVo(User user) {
        this.username = user.getUsername();
        this.name = user.getName();
        this.sex = user.getSex()==0 ? "女": "男";
        this.phone = user.getPhone();
        this.telephone = user.getTelephone();
        this.email = user.getEmail();
    }
}
