package cn.nwsuaf.edu.srms.util;

import cn.nwsuaf.edu.srms.entity.User;
import cn.nwsuaf.edu.srms.vo.UserVo;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/23
 * Time: 21:13
 */
public class UserVoUtil {

    public static UserVo UserToUserVo(User user){
        UserVo userVo = new UserVo();

        userVo.setUsername(user.getUsername());
        userVo.setName(user.getName());
        userVo.setSex(user.getSex()==0 ? "女": "男");
        userVo.setPhone(user.getPhone());
        userVo.setTelephone(user.getTelephone());
        userVo.setEmail(user.getEmail());

        return userVo;
    }


    public static void UserVoToUser(User user,UserVo userVo){

        user.setUsername(userVo.getUsername());
        user.setName(userVo.getName());
        user.setSex(userVo.getSex().equals("女")? 0:1);
        user.setPhone(userVo.getPhone());
        user.setTelephone(userVo.getTelephone());
        user.setEmail(userVo.getEmail());
    }
}
