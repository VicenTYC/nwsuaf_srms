package cn.nwsuaf.edu.srms.controller;

import cn.nwsuaf.edu.srms.entity.ProMaintain;
import cn.nwsuaf.edu.srms.entity.ProMaterial;
import cn.nwsuaf.edu.srms.entity.ProParts;
import cn.nwsuaf.edu.srms.entity.ProReagent;
import cn.nwsuaf.edu.srms.service.ManagerGoodsService;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/22
 * Time: 16:55
 */
@Api(value = "/manager/goods",description = "进行对仪器、耗材、维修、配件四个表的数据查询和添加")
@RestController
@RequestMapping("/manager/goods")
public class ManagerGoodsController {

    @Autowired
    private ManagerGoodsService managerGoodsService;

    @ApiOperation(value = "耗材类商品查询")
    @PostMapping(value = "material/list")
    @ResponseBody
    public ResultVo<List<ProMaterial>> getMaterial(@RequestParam(value = "platId") String platId) {
        return managerGoodsService.getMaterialByPlat(platId);
    }

    @ApiOperation(value = "耗材类商品添加")
    @PostMapping(value = "material/add")
    @ResponseBody
    public ResultVo addMaterial(@RequestBody ProMaterial proMaterial) {
        return managerGoodsService.addMaterial(proMaterial);
    }

    @ApiOperation(value = "维修类商品查询")
    @PostMapping(value = "maintain/list")
    @ResponseBody
    public ResultVo getMaintain(@RequestParam(value = "platId") String platId) {
        return managerGoodsService.getMaintainByPlat(platId);
    }

    @ApiOperation(value = "维修类商品添加")
    @PostMapping(value = "maintain/add")
    @ResponseBody
    public ResultVo addMaintain(@RequestBody ProMaintain proMaintain) {
        return managerGoodsService.addMaintain(proMaintain);
    }

    @ApiOperation(value = "配件类商品查询")
    @PostMapping(value = "parts/list")
    @ResponseBody
    public ResultVo getParts(@RequestParam(value = "platId") String platId) {
        return managerGoodsService.getPartsByPlat(platId);
    }

    @ApiOperation(value = "配件类商品添加")
    @PostMapping(value = "parts/add")
    @ResponseBody
    public ResultVo addParts(@RequestBody ProParts proParts) {
        return managerGoodsService.addParts(proParts);
    }

    @ApiOperation(value = "试剂类商品查询")
    @PostMapping(value = "reagent/list")
    @ResponseBody
    public ResultVo getReagent(@RequestParam(value = "platId") String platId) {
        return managerGoodsService.getReagentByPlat(platId);
    }

    @ApiOperation(value = "试剂类商品添加")
    @PostMapping(value = "reagent/add")
    @ResponseBody
    public ResultVo addReagent(@RequestBody ProReagent proReagent) {
        return managerGoodsService.addReagent(proReagent);
    }


}
