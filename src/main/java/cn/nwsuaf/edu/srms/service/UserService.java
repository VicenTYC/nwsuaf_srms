package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.User;
import cn.nwsuaf.edu.srms.vo.ResultVO;
import cn.nwsuaf.edu.srms.vo.UserVo;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/23
 * Time: 17:36
 */
public interface UserService {
    ResultVO<User> login(String username, String password);

    ResultVO<UserVo> getUserInfo(String userId);

    ResultVO<UserVo> updateUserInfo(String userId, UserVo userVo);

    ResultVO<String> updatePassword(String userId, String oldPassword, String newPassword);
}
