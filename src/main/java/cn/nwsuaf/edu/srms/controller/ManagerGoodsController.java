package cn.nwsuaf.edu.srms.controller;

import cn.nwsuaf.edu.srms.annotation.LoginRequired;
import cn.nwsuaf.edu.srms.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation(value = "耗材类商品查询")
    @PostMapping(value = "material/list")
    @ResponseBody
    public ResultVO getMaterial() {
        return null;
    }

    @ApiOperation(value = "耗材类商品添加")
    @PostMapping(value = "material/add")
    @ResponseBody
    public ResultVO addMaterial() {
        return null;
    }

    @ApiOperation(value = "维修类商品查询")
    @PostMapping(value = "maintain/list")
    @ResponseBody
    public ResultVO getMaintain() {
        return null;
    }

    @ApiOperation(value = "维修类商品添加")
    @PostMapping(value = "maintain/add")
    @ResponseBody
    public ResultVO addMaintain() {
        return null;
    }

    @ApiOperation(value = "配件类商品查询")
    @PostMapping(value = "parts/list")
    @ResponseBody
    public ResultVO getParts() {
        return null;
    }

    @ApiOperation(value = "配件类商品添加")
    @PostMapping(value = "parts/add")
    @ResponseBody
    public ResultVO addParts() {
        return null;
    }

    @ApiOperation(value = "试剂类商品查询")
    @PostMapping(value = "reagent/list")
    @ResponseBody
    public ResultVO getReagent() {
        return null;
    }

    @ApiOperation(value = "试剂类商品添加")
    @PostMapping(value = "reagent/add")
    @ResponseBody
    public ResultVO addReagent() {
        return null;
    }


}
