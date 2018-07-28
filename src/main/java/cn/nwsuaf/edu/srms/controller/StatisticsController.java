package cn.nwsuaf.edu.srms.controller;

import cn.nwsuaf.edu.srms.common.Const;
import cn.nwsuaf.edu.srms.service.ManagerRegisterService;
import cn.nwsuaf.edu.srms.service.StatisticsService;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/27
 * Time: 20:42
 */
@RestController
@RequestMapping("statistics")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;
    @Autowired
    private ManagerRegisterService managerRegisterService;

    @ApiOperation(value = "根据平台和时间得到 配件、时间、耗材、维修 四类在具体时间内的花费,饼状图+表格")
    @PostMapping("get_count_year_month")
    @ResponseBody
    public ResultVo getGoodsTypeCountByPlatAndYearAndMonth(@RequestParam(value = "platId") String platId,
                                                           @RequestParam(value = "year",defaultValue = "%") String year,
                                                           @RequestParam(value = "month",defaultValue = "%") String month){

        return statisticsService.getCountsByPlatAndYearAndMonth(platId,year,month);
    }

    @ApiOperation(value = "根据平台和时间得到 配件、时间、耗材、维修 四类在具体时间内的花费,饼状图+表格")
    @PostMapping("get_year_month")
    @ResponseBody
    public ResultVo getGoodsByPlatAndYearAndMonth(@RequestParam(value = "platId") String platId,
                                                  @RequestParam(value = "type") String type,
                                                  @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                                                  @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                                  @RequestParam(value = "year",defaultValue = "%") String year,
                                                  @RequestParam(value = "month",defaultValue = "%") String month){

        switch (type) {
            case Const.TYPE.MAINTAIN:
                return managerRegisterService.getMaintainRecord(platId, pageNum, pageSize, null, year, month);
            case Const.TYPE.MATERIAL:
                return managerRegisterService.getMaterialRecord(platId, pageNum, pageSize, null, year, month);
            case Const.TYPE.PARTS:
                return managerRegisterService.getPartsRecord(platId, pageNum, pageSize, null, year, month);
            case Const.TYPE.REAGENT:
                return managerRegisterService.getReagentRecord(platId, pageNum, pageSize, null, year, month);
            default:
                return ResultUtil.createByErrorMessage("无记录");
        }
    }

    @ApiOperation(value = "根据平台和时间得到 具体分类的分类 时间-花费柱状图+表格")
    @PostMapping("get_count_type_year")
    @ResponseBody
    public ResultVo getGoodsTypeCountByPlatAndTypeAndDate(@RequestParam(value = "platId") String platId,
                                                          @RequestParam(value = "type") Integer type,
                                                          @RequestParam(value = "year") String year){
        return statisticsService.getGoodsTypeCountByPlatAndTypeAndDate(platId,type,year);
    }

    @ApiOperation(value = "根据时间和类型得到 每个实验室 具体分类的花费，饼状图+表格")
    @PostMapping("get_count_lab_type_year")
    @ResponseBody
    public ResultVo getGoodsTypePlatCountByTypeAndDate(Integer type, String year, String month){
        return null;
    }

}
