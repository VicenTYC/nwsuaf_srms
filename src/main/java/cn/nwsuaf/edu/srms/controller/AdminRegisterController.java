package cn.nwsuaf.edu.srms.controller;

import cn.nwsuaf.edu.srms.service.AdminRegisterService;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/31
 * Time: 18:55
 */
@RestController
@RequestMapping(value = "admin/register")
@Api(value = "admin/register",description = "负责人进行审核")
public class AdminRegisterController {

    @Autowired
    private AdminRegisterService adminRegisterService;

    @PostMapping(value = "get")
    @ApiOperation(value = "管理员查看所有待审核记录")
    @ResponseBody
    public ResultVo getRegister(@RequestParam(value = "type",defaultValue = "1") Integer type){
        return adminRegisterService.getAdminRegister(type);
    }

    @PostMapping(value = "agree")
    @ApiOperation(value = "管理员同意某一记录")
    @ResponseBody
    public ResultVo agreeRegister(@RequestParam(value = "type",defaultValue = "1") Integer type,
                                  @RequestParam(value = "registerId",defaultValue = "1") String registerId){
        return adminRegisterService.agreeRegister(type,registerId);
    }

    @PostMapping(value = "un_agree")
    @ApiOperation(value = "管理员不同意某一记录")
    @ResponseBody
    public ResultVo unAgreeRegister(@RequestParam(value = "type",defaultValue = "1") Integer type,
                                    @RequestParam(value = "registerId",defaultValue = "1") String registerId){
        return adminRegisterService.unAgreeRegister(type,registerId);
    }

    @PostMapping(value = "agree_all")
    @ApiOperation(value = "管理员同意所有待审核记录")
    @ResponseBody
    public ResultVo agreeAllRegister(@RequestParam(value = "type",defaultValue = "1") Integer type){
        return adminRegisterService.agreeAllRegister(type);
    }
}
