package cn.nwsuaf.edu.srms.service.Impl;

import cn.nwsuaf.edu.srms.common.Const;
import cn.nwsuaf.edu.srms.dao.UserMapper;
import cn.nwsuaf.edu.srms.entity.User;
import cn.nwsuaf.edu.srms.service.UserService;
import cn.nwsuaf.edu.srms.util.MD5Util;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.util.UserVoUtil;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import cn.nwsuaf.edu.srms.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/23
 * Time: 17:37
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultVo<User> login(String username, String password) {

        String md5Password = MD5Util.MD5EncodeUtf8(username,password);
        User user = userMapper.selectByPassword(username,md5Password);

        if(user == null){
            return ResultUtil.createByError();
        } else {
            return ResultUtil.createBySuccess(user);
        }
    }

    @Override
    public ResultVo<UserVo> getUserInfo(String userId) {

        User user = userMapper.selectByPrimaryKey(Integer.parseInt(userId));
        UserVo userVo = UserVoUtil.UserToUserVo(user);
        return ResultUtil.createBySuccess(userVo);
    }

    @Override
    public ResultVo<UserVo> updateUserInfo(String userId, UserVo userVo) {

        User user = userMapper.selectByPrimaryKey(Integer.valueOf(userId));
        UserVoUtil.UserVoToUser(user,userVo);

        int result = userMapper.updateByPrimaryKey(user);

        if(result == 1) {
            UserVo newUserVo = UserVoUtil.UserToUserVo(user);
            return ResultUtil.createBySuccess(newUserVo);
        } else {
            return ResultUtil.createByError();
        }

    }

    @Override
    public ResultVo<String> updatePassword(String userId, String oldPassword, String newPassword) {

        User user = userMapper.selectByPrimaryKey(Integer.parseInt(userId));
        String md5oldPassword = MD5Util.MD5EncodeUtf8(user.getUsername(),oldPassword);

        if(md5oldPassword.equals(user.getPassword())) {
            user.setPassword(MD5Util.MD5EncodeUtf8(user.getUsername(),newPassword));
            userMapper.updateByPrimaryKey(user);
            return ResultUtil.createBySuccessMessage(Const.UPDATEPASSWORD.SUCCESS);
        } else {
            return ResultUtil.createByErrorMessage(Const.UPDATEPASSWORD.ERROR);
        }
    }
}
