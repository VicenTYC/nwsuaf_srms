package cn.nwsuaf.edu.srms.controller;

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
 * Time: 16:49
 */
@RestController
@RequestMapping(value = "manager/register")
@Api(value = "manager/register",description = "负责人进行入库操作")
public class ManagerRegisterController {

    @ApiOperation(value = "保存")
    @PostMapping(value = "save")
    @ResponseBody
    public ResultVO saveRecord() {
        return null;
    }

    @ApiOperation(value = "更新")
    @PostMapping(value = "update")
    @ResponseBody
    public ResultVO updateRecord() {
        return null;
    }

    @ApiOperation(value = "提交")
    @PostMapping(value = "commit")
    @ResponseBody
    public ResultVO commitRecord() {
        return null;
    }

    @ApiOperation(value = "删除")
    @PostMapping(value = "delete")
    @ResponseBody
    public ResultVO deleteRecord() {
        return null;
    }
}
