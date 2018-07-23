package cn.nwsuaf.edu.srms.controller;

import cn.nwsuaf.edu.srms.annotation.LoginRequired;
import cn.nwsuaf.edu.srms.entity.ProInstrument;
import cn.nwsuaf.edu.srms.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/23
 * Time: 15:01
 */

@RestController
@RequestMapping("/manager/instrument")
@Api(value = "/manager/instrument",description = "负责人对仪器的操作")
public class ManagerInstrumentController {

    @ApiOperation(value = "获取平台仪器")
    @PostMapping(value = "list")
    @ResponseBody
    public ResultVO getAllInstrument(@RequestParam(name = "platId") @ApiParam(value = "选择的平台id") Integer platId,
                                     @RequestParam(name = "pageSize",defaultValue = "10")@ApiParam(value = "分页每页的数量") Integer pageSize,
                                     @RequestParam(name = "pageNum", defaultValue = "1")@ApiParam(value = "分页当前页数") Integer pageNum) {
        return null;
    }

    @ApiOperation(value = "添加仪器")
    @GetMapping(value = "add")
    @ResponseBody
    @LoginRequired
    public ResultVO addInstrument(@RequestBody(required = false)@ApiParam(value = "添加的仪器详细信息") ProInstrument proInstrument) {
        return null;
    }

}
