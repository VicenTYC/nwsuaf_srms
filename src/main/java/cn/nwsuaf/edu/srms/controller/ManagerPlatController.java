package cn.nwsuaf.edu.srms.controller;

import cn.nwsuaf.edu.srms.annotation.LoginRequired;
import cn.nwsuaf.edu.srms.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/23
 * Time: 15:21
 */
@Api(value = "manager/plat",description = "负责人所负责平台")
@RestController
@RequestMapping(value = "manager/plat")
@LoginRequired
public class ManagerPlatController {

    @ApiOperation(value = "得到负责人所负责的平台")
    @PostMapping("list")
    @ResponseBody
    public ResultVO getPlatByManager() {
        return null;
    }
}
