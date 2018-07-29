package cn.nwsuaf.edu.srms.controller;

import cn.nwsuaf.edu.srms.annotation.LoginRequired;
import cn.nwsuaf.edu.srms.common.Const;
import cn.nwsuaf.edu.srms.entity.ProInstrument;
import cn.nwsuaf.edu.srms.service.ManagerInstrumentService;
import cn.nwsuaf.edu.srms.vo.InstrumentVo;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/23
 * Time: 15:01
 */

@RestController
@RequestMapping("manager/instrument")
@Api(value = "/manager/instrument",description = "负责人对仪器的操作")
public class ManagerInstrumentController {

    @Autowired
    private ManagerInstrumentService managerInstrumentService;

    @ApiOperation(value = "获取平台仪器")
    @PostMapping(value = "list")
    @ResponseBody
    @LoginRequired
    public ResultVo<List<InstrumentVo>> getAllInstrument(@RequestParam(name = "platId") @ApiParam(value = "选择的平台id") Integer platId) {

        return managerInstrumentService.getInstrumentByPlat(platId);
    }

    @ApiOperation(value = "分页获取平台仪器")
    @PostMapping(value = "list_page")
    @ResponseBody
    @LoginRequired
    public ResultVo<PageInfo<InstrumentVo>> getPageInstrument(@RequestParam(name = "platId") @ApiParam(value = "选择的平台id") Integer platId,
                                                              @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                                              @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize) {

        return managerInstrumentService.getPageInstrumentByPlat(platId,pageNum,pageSize);
    }

    @ApiOperation(value = "添加仪器")
    @PostMapping(value = "add")
    @ResponseBody
    @LoginRequired
    public ResultVo<String> addInstrument(@RequestBody @ApiParam(value = "添加的仪器详细信息") ProInstrument proInstrument, HttpSession session) {

        Integer userId = (Integer) session.getAttribute(Const.CURRENT_USER);

        return managerInstrumentService.addInstrument(proInstrument,userId);
    }

}
