package cn.nwsuaf.edu.srms.controller;

import cn.nwsuaf.edu.srms.annotation.LoginRequired;
import cn.nwsuaf.edu.srms.entity.ComMaintainer;
import cn.nwsuaf.edu.srms.entity.ComProducer;
import cn.nwsuaf.edu.srms.entity.ComSupplier;
import cn.nwsuaf.edu.srms.service.ManagerFirmService;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
@RequestMapping(value = "firm")
@Api(value = "/firm",description = "负责人对生产、维修、供货商进行查询，超级负责人进行增加")
public class ManagerFirmController {

    @Autowired
    private ManagerFirmService managerFirmService;


    @ApiOperation(value = "分页查询维修商")
    @PostMapping(value = "maintainer/list")
    @ResponseBody
    @LoginRequired
    public ResultVo<PageInfo<ComMaintainer>> getPageMaintainer(@RequestParam(value = "name",defaultValue = "%") String name,
                                                               @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                                               @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize) {
        return managerFirmService.getPageMaintainer(pageNum,pageSize,name);
    }

    @ApiOperation(value = "添加、修改维修商")
    @PostMapping(value = "maintainer/add")
    @ResponseBody
    @LoginRequired
    public ResultVo<String> addMaintainer(@RequestBody ComMaintainer comMaintain) {
        return managerFirmService.addMaintainer(comMaintain);
    }

    @ApiOperation(value = "删除维修商")
    @PostMapping(value = "maintainer/delete")
    @ResponseBody
    @LoginRequired
    public ResultVo<String> deleteMaintainer(@RequestParam(value = "id") String id) {
        return managerFirmService.deleteMaintainer(id);
    }

    @ApiOperation(value = "分页查询生产商")
    @PostMapping(value = "producer/list")
    @ResponseBody
    @LoginRequired
    public ResultVo<PageInfo<ComProducer>> getPageProducer(@RequestParam(value = "name",defaultValue = "%") String name,
                                                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize) {
        return managerFirmService.getPageProducer(pageNum,pageSize,name);
    }

    @ApiOperation(value = "添加、修改生产商")
    @PostMapping(value = "producer/add")
    @ResponseBody
    @LoginRequired
    public ResultVo addProducer(@RequestBody ComProducer comProducer) {
        return managerFirmService.addProducer(comProducer);
    }

    @ApiOperation(value = "删除生产商")
    @PostMapping(value = "producer/delete")
    @ResponseBody
    @LoginRequired
    public ResultVo<String> deleteProducer(@RequestParam(value = "id") String id) {
        return managerFirmService.deleteProducer(id);
    }

    @ApiOperation(value = "分页查询供应商")
    @PostMapping(value = "supplier/list")
    @ResponseBody
    @LoginRequired
    public ResultVo<PageInfo<ComSupplier>> getPageSupplier(@RequestParam(value = "name",defaultValue = "%") String name,
                                                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                                           @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize) {
        return managerFirmService.getPageSupplier(pageNum,pageSize,name);
    }

    @ApiOperation(value = "添加、修改供应商")
    @PostMapping(value = "supplier/add")
    @ResponseBody
    @LoginRequired
    public ResultVo<String> addSupplier(@RequestBody ComSupplier comSupplier) {
        return managerFirmService.addSupplier(comSupplier);
    }

    @ApiOperation(value = "删除供应商")
    @PostMapping(value = "supplier/delete")
    @ResponseBody
    @LoginRequired
    public ResultVo<String> deleteSupplier(@RequestParam(value = "id") String id) {
        return managerFirmService.deleteSupplier(id);
    }

}
