package cn.nwsuaf.edu.srms.controller;

import cn.nwsuaf.edu.srms.annotation.LoginRequired;
import cn.nwsuaf.edu.srms.common.Const;
import cn.nwsuaf.edu.srms.entity.User;
import cn.nwsuaf.edu.srms.service.UserService;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import cn.nwsuaf.edu.srms.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/23
 * Time: 14:40
 */
@Api(value = "login",description = "负责人和管理员登录登出接口")
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "负责人和超级负责人登录")
    @PostMapping(value = "login")
    @ResponseBody
    public ResultVo<String> login(@RequestParam(name = "username")@ApiParam(value = "登录id",required = true) String username,
                                  @RequestParam(name = "password")@ApiParam(value = "登录密码",required = true) String password,
                                  HttpSession session) {

        ResultVo<User> userResultVo = userService.login(username,password);

        System.out.println(ToStringBuilder.reflectionToString(userResultVo));

        if(userResultVo.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER,String.valueOf(userResultVo.getData().getId()));
            return ResultUtil.createBySuccessMessage(Const.LOGIN.SUCCESS);
        }

        return ResultUtil.createByErrorMessage(Const.LOGIN.ERROR);
    }

//    @ApiOperation(value = "负责人登录")
//    @PostMapping(value = "manager_login")
//    @ResponseBody
//    public ResultVo<String> managerLogin(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
//        return null;
//    }
//
//    @ApiOperation(value = "超级负责人登录")
//    @PostMapping(value = "admin_login")
//    @ResponseBody
//    public ResultVo<String> adminLogin(@RequestParam(name = "username") String username, @RequestParam(name = "password") String password) {
//        return null;
//    }

    @ApiOperation(value = "退出登录")
    @PostMapping(value = "logout")
    @ResponseBody
    @LoginRequired
    public ResultVo<String> logout(HttpSession session) {
        session.removeAttribute(Const.CURRENT_USER);
        return ResultUtil.createBySuccessMessage(Const.LOGINOUT.SUCCESS);
    }

    @ApiOperation(value = "获取信息")
    @PostMapping(value = "get_info")
    @ResponseBody
    @LoginRequired
    public ResultVo<UserVo> getInfo(HttpSession session) {

        String userId = (String)session.getAttribute(Const.CURRENT_USER);
        return userService.getUserInfo(userId);

    }

    @ApiOperation(value = "修改信息")
    @PostMapping(value = "update_info")
    @ResponseBody
    @LoginRequired
    public ResultVo<UserVo> updateInfo(@RequestBody UserVo userVo, HttpSession session) {

        String userId = (String)session.getAttribute(Const.CURRENT_USER);
        return userService.updateUserInfo(userId,userVo);
    }

    @ApiOperation(value = "修改密码")
    @PostMapping(value = "update_password")
    @ResponseBody
    @LoginRequired
    public ResultVo<String> updatePassword(@RequestParam(value = "oldPassword") @ApiParam(value = "原先密码") String oldPassword,
                                           @RequestParam(value = "newPassword") @ApiParam(value = "新密码") String newPassword,
                                           HttpSession session) {

        String userId = (String)session.getAttribute(Const.CURRENT_USER);
        return userService.updatePassword(userId,oldPassword,newPassword);
    }

}
