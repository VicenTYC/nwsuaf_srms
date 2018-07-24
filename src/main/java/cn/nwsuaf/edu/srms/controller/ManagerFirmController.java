package cn.nwsuaf.edu.srms.controller;

import cn.nwsuaf.edu.srms.entity.ComMaintainer;
import cn.nwsuaf.edu.srms.entity.ComProducer;
import cn.nwsuaf.edu.srms.entity.ComSupplier;
import cn.nwsuaf.edu.srms.service.ManagerFirmService;
import cn.nwsuaf.edu.srms.service.ManagerPlatService;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/23
 * Time: 15:25
 */

@RestController
@RequestMapping(value = "/firm")
@Api(value = "/firm",description = "负责人对生产、维修、供货商进行查询，超级负责人进行增加")
public class ManagerFirmController {

    @Autowired
    private ManagerFirmService managerFirmService;

    @ApiOperation(value = "查询维修商")
    @PostMapping(value = "maintainer/list")
    @ResponseBody
    public ResultVO<List<ComMaintainer>> getAllMaintainer() {
        return managerFirmService.getAllMaintainer();
    }

    @ApiOperation(value = "添加维修商")
    @PostMapping(value = "maintainer/add")
    @ResponseBody
    public ResultVO<String> addMaintainer(@RequestBody ComMaintainer comMaintain) {
        return managerFirmService.addMaintainer(comMaintain);
    }

    @ApiOperation(value = "查询生产商")
    @PostMapping(value = "producer/list")
    @ResponseBody
    public ResultVO<List<ComProducer>> getAllProducer() {
        return managerFirmService.getAllProducer();
    }

    @ApiOperation(value = "添加生产商")
    @PostMapping(value = "producer/add")
    @ResponseBody
    public ResultVO addProducer(@RequestBody ComProducer comProducer) {
        return managerFirmService.addProducer(comProducer);
    }

    @ApiOperation(value = "查询供应商")
    @PostMapping(value = "supplier/list")
    @ResponseBody
    public ResultVO<List<ComSupplier>> getAllSupplier() {
        return managerFirmService.getAllSupplier();
    }

    @ApiOperation(value = "添加供应商")
    @PostMapping(value = "supplier/add")
    @ResponseBody
    public ResultVO<String> addSupplier(@RequestBody ComSupplier comSupplier) {
        return managerFirmService.addSupplier(comSupplier);
    }

}
