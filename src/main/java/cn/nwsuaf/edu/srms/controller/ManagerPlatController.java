package cn.nwsuaf.edu.srms.controller;

import cn.nwsuaf.edu.srms.annotation.LoginRequired;
import cn.nwsuaf.edu.srms.common.Const;
import cn.nwsuaf.edu.srms.entity.Platform;
import cn.nwsuaf.edu.srms.service.ManagerPlatService;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/23
 * Time: 15:21
 */
@Api(value = "manager/plat",description = "负责人所负责平台")
@RestController
@RequestMapping(value = "manager/plat")
public class ManagerPlatController {

    @Autowired
    private ManagerPlatService managerPlatService;

    @ApiOperation(value = "得到负责人所负责的平台")
    @PostMapping("list")
    @ResponseBody
    @LoginRequired
    public ResultVo<List<Platform>> getPlatByManager(HttpSession session) {

        String userId = (String) session.getAttribute(Const.CURRENT_USER);

        return managerPlatService.getPlatByManager(userId);
    }
}
