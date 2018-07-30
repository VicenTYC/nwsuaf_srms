package cn.nwsuaf.edu.srms.controller;

import cn.nwsuaf.edu.srms.common.Const;
import cn.nwsuaf.edu.srms.entity.RegisterMaintain;
import cn.nwsuaf.edu.srms.entity.RegisterMaterial;
import cn.nwsuaf.edu.srms.entity.RegisterParts;
import cn.nwsuaf.edu.srms.entity.RegisterReagent;
import cn.nwsuaf.edu.srms.service.ManagerRegisterService;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.Server;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.java2d.SurfaceDataProxy;

import javax.servlet.http.HttpSession;

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

    @Autowired
    private ManagerRegisterService managerRegisterService;

    @ApiOperation(value = "维修保存")
    @PostMapping(value = "/maintain/save")
    @ResponseBody
    public ResultVo saveMaintainRecord(@RequestBody RegisterMaintain registerMaintain, HttpSession session) {

        System.out.println(ToStringBuilder.reflectionToString(registerMaintain));

        int userId = Integer.parseInt((String)session.getAttribute(Const.CURRENT_USER));

        return managerRegisterService.saveMaintainRecord(registerMaintain,userId);

    }

    @ApiOperation(value = "维修提交")
    @PostMapping(value = "/maintain/commit")
    @ResponseBody
    public ResultVo commitMaintainRecord(@RequestBody RegisterMaintain registerMaintain, HttpSession session) {
        int userId = Integer.parseInt((String)session.getAttribute(Const.CURRENT_USER));

        return managerRegisterService.commitMaintainRecord(registerMaintain,userId);
    }

    @ApiOperation(value = "维修删除")
    @PostMapping(value = "/maintain/delete")
    @ResponseBody
    public ResultVo deleteMaintainRecord(@RequestParam(value = "recordId") String recordId) {
        return managerRegisterService.deleteMaintainRecord(recordId);
    }

    @ApiOperation(value = "维修查找")
    @PostMapping(value = "/maintain/get")
    @ResponseBody
    public ResultVo getMaintainRecord(@RequestParam(value = "platId") String platId,
                                      @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                      @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                      @RequestParam(value = "name",defaultValue = "%") String name,
                                      @RequestParam(value = "year",defaultValue = "%") String year,
                                      @RequestParam(value = "month",defaultValue = "%") String month) {
        return managerRegisterService.getMaintainRecord(platId,pageNum,pageSize,name,year,month);
    }

    @ApiOperation(value = "耗材保存")
    @PostMapping(value = "/material/save")
    @ResponseBody
    public ResultVo saveMaterialRecord(@RequestBody RegisterMaterial registerMaterial, HttpSession session) {
        int userId = Integer.parseInt((String)session.getAttribute(Const.CURRENT_USER));

        return managerRegisterService.saveMaterialRecord(registerMaterial,userId);
    }

    @ApiOperation(value = "耗材提交")
    @PostMapping(value = "/material/commit")
    @ResponseBody
    public ResultVo commitMaterialRecord(@RequestBody RegisterMaterial registerMaterial, HttpSession session) {
        int userId = Integer.parseInt((String)session.getAttribute(Const.CURRENT_USER));

        return managerRegisterService.commitMaterialRecord(registerMaterial,userId);
    }

    @ApiOperation(value = "耗材删除")
    @PostMapping(value = "/material/delete")
    @ResponseBody
    public ResultVo deleteMaterialRecord(@RequestParam(value = "recordId") String recordId) {
        return managerRegisterService.deleteMaterialRecord(recordId);
    }

    @ApiOperation(value = "耗材查找")
    @PostMapping(value = "/material/get")
    @ResponseBody
    public ResultVo getMaterialRecord(@RequestParam(value = "platId") String platId,
                                      @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                      @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                      @RequestParam(value = "name",defaultValue = "%") String name,
                                      @RequestParam(value = "year",defaultValue = "%") String year,
                                      @RequestParam(value = "month",defaultValue = "%") String month) {
        return managerRegisterService.getMaterialRecord(platId,pageNum,pageSize,name,year,month);
    }

    @ApiOperation(value = "试剂保存")
    @PostMapping(value = "/reagent/save")
    @ResponseBody
    public ResultVo saveReagentRecord(@RequestBody RegisterReagent registerReagent, HttpSession session) {
        int userId = Integer.parseInt((String)session.getAttribute(Const.CURRENT_USER));

        return managerRegisterService.saveReagentRecord(registerReagent,userId);
    }

    @ApiOperation(value = "试剂提交")
    @PostMapping(value = "/reagent/commit")
    @ResponseBody
    public ResultVo commitReagentRecord(@RequestBody RegisterReagent registerReagent, HttpSession session) {
        int userId = Integer.parseInt((String)session.getAttribute(Const.CURRENT_USER));

        return managerRegisterService.commitReagentRecord(registerReagent,userId);
    }

    @ApiOperation(value = "试剂删除")
    @PostMapping(value = "/reagent/delete")
    @ResponseBody
    public ResultVo deleteReagentRecord(@RequestParam(value = "recordId") String recordId) {
        return managerRegisterService.deleteReagentRecord(recordId);
    }

    @ApiOperation(value = "试剂查找")
    @PostMapping(value = "/reagent/get")
    @ResponseBody
    public ResultVo getReagentRecord(@RequestParam(value = "platId") String platId,
                                      @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                      @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                     @RequestParam(value = "name",defaultValue = "%") String name,
                                     @RequestParam(value = "year",defaultValue = "%") String year,
                                     @RequestParam(value = "month",defaultValue = "%") String month) {
        return managerRegisterService.getReagentRecord(platId, pageNum, pageSize,name,year,month);
    }

    @ApiOperation(value = "配件保存")
    @PostMapping(value = "/parts/save")
    @ResponseBody
    public ResultVo savePartsRecord(@RequestBody RegisterParts registerParts, HttpSession session) {
        int userId = Integer.parseInt((String)session.getAttribute(Const.CURRENT_USER));

        return managerRegisterService.savePartsRecord(registerParts,userId);
    }

    @ApiOperation(value = "配件提交")
    @PostMapping(value = "/parts/commit")
    @ResponseBody
    public ResultVo commitPartsRecord(@RequestBody RegisterParts registerParts, HttpSession session) {
        int userId = Integer.parseInt((String)session.getAttribute(Const.CURRENT_USER));

        return managerRegisterService.commitPartsRecord(registerParts,userId);
    }

    @ApiOperation(value = "配件删除")
    @PostMapping(value = "/parts/delete")
    @ResponseBody
    public ResultVo deletePartsRecord(@RequestParam(value = "recordId") String recordId) {
        return managerRegisterService.deletePartsRecord(recordId);
    }

    @ApiOperation(value = "配件查找")
    @PostMapping(value = "/parts/get")
    @ResponseBody
    public ResultVo getPartsRecord(@RequestParam(value = "platId") String platId,
                                   @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                   @RequestParam(value = "name",defaultValue = "%") String name,
                                   @RequestParam(value = "year",defaultValue = "%") String year,
                                   @RequestParam(value = "month",defaultValue = "%") String month) {
        return managerRegisterService.getPartsRecord(platId, pageNum, pageSize ,name, year ,month);
    }
}
