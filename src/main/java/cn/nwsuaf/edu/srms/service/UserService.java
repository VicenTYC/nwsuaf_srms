package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.User;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import cn.nwsuaf.edu.srms.vo.UserVo;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/23
 * Time: 17:36
 */
public interface UserService {
    ResultVo<User> login(String username, String password);

    ResultVo<UserVo> getUserInfo(String userId);

    ResultVo<UserVo> updateUserInfo(String userId, UserVo userVo);

    ResultVo<String> updatePassword(String userId, String oldPassword, String newPassword);
}
