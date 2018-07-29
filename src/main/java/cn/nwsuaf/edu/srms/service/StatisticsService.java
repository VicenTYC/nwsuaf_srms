package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.vo.ResultVo;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/27
 * Time: 21:01
 */
public interface StatisticsService {

    ResultVo getCountsByPlatAndYearAndMonth(String platId, String year, String month);

    ResultVo getGoodsTypeCountByPlatAndTypeAndDate(String platId, Integer type, String year);

    ResultVo getGoodsTypePlatCountByTypeAndDate(String userId, Integer type, String year, String month);
}
