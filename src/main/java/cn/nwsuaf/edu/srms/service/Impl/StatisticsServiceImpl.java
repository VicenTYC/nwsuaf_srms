package cn.nwsuaf.edu.srms.service.Impl;

import cn.nwsuaf.edu.srms.common.Const;
import cn.nwsuaf.edu.srms.dao.RegisterMaintainMapper;
import cn.nwsuaf.edu.srms.dao.RegisterMaterialMapper;
import cn.nwsuaf.edu.srms.dao.RegisterPartsMapper;
import cn.nwsuaf.edu.srms.dao.RegisterReagentMapper;
import cn.nwsuaf.edu.srms.service.StatisticsService;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.CountVo;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/27
 * Time: 21:01
 */
@Service
public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    private RegisterMaterialMapper registerMaterialMapper;
    @Autowired
    private RegisterMaintainMapper registerMaintainMapper;
    @Autowired
    private RegisterReagentMapper registerReagentMapper;
    @Autowired
    private RegisterPartsMapper registerPartsMapper;

    @Override
    public ResultVo getCountsByPlatAndYearAndMonth(String platId, String year, String month) {

        if(year.equals("%"))
            year = null;
        if(month.equals("%"))
            month = null;

        List<CountVo> countVoList = new ArrayList<>();
        countVoList.add(
                new CountVo(Const.TYPE.MAINTAIN,registerMaintainMapper.getCountByPlatAndYearAndMonth(platId,year,month))
        );
        countVoList.add(
                new CountVo(Const.TYPE.MATERIAL,registerMaterialMapper.getCountByPlatAndYearAndMonth(platId,year,month))
        );
        countVoList.add(
                new CountVo(Const.TYPE.PARTS,registerPartsMapper.getCountByPlatAndYearAndMonth(platId,year,month))
        );
        countVoList.add(
                new CountVo(Const.TYPE.REAGENT,registerReagentMapper.getCountByPlatAndYearAndMonth(platId,year,month))
        );

        return ResultUtil.createBySuccess(countVoList);
    }

    @Override
    public ResultVo getGoodsTypeCountByPlatAndTypeAndDate(String platId, Integer type, String year) {

        if("%".equals(year))
            year = null;

        Map<String,BigDecimal> map = new HashMap<>();
        switch (type) {
            case 1:
                 map = registerMaterialMapper.getCountByPlatAndTypeAndDate(platId,year);
                break;
            case 2:
                map = registerPartsMapper.getCountByPlatAndTypeAndDate(platId,year);
                break;
            case 3:
                map = registerReagentMapper.getCountByPlatAndTypeAndDate(platId,year);
                break;
            case 4:
                map = registerMaintainMapper.getCountByPlatAndTypeAndDate(platId,year);
                break;
            case 0:

                break;
        }

        return ResultUtil.createBySuccess(map);
    }

    @Override
    public ResultVo getByPlatAndYearAndMonth(String platId, String year, String month, Integer pageNum, Integer pageSize) {
        return null;
    }

}
