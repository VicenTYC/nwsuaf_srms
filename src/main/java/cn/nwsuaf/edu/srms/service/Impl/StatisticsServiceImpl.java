package cn.nwsuaf.edu.srms.service.Impl;

import cn.nwsuaf.edu.srms.common.Const;
import cn.nwsuaf.edu.srms.dao.*;
import cn.nwsuaf.edu.srms.service.StatisticsService;
import cn.nwsuaf.edu.srms.util.MapUtil;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.CountVo;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import org.apache.commons.lang3.builder.ToStringBuilder;
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
    private UserPlatMapper userPlatMapper;
    @Autowired
    private RegisterMaterialMapper registerMaterialMapper;
    @Autowired
    private RegisterMaintainMapper registerMaintainMapper;
    @Autowired
    private RegisterReagentMapper registerReagentMapper;
    @Autowired
    private RegisterPartsMapper registerPartsMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired PlatformMapper platformMapper;

    @Override
    public ResultVo getCountsByPlatAndYearAndMonth(String platId,String year,String month) {

        if(platId.equals("0"))
            platId = "%";
        if(year.equals("%"))
            year = null;
        if(month.equals("%"))
            month = null;

        System.out.println(platId);

        List<CountVo> countVoList = new ArrayList<>();
        countVoList.add(
                new CountVo(Const.TYPE.MATERIAL, registerMaterialMapper.getCountByPlatAndYearAndMonth(platId,year,month))
        );
        countVoList.add(
                new CountVo(Const.TYPE.PARTS, registerPartsMapper.getCountByPlatAndYearAndMonth(platId,year,month))
        );
        countVoList.add(
                new CountVo(Const.TYPE.REAGENT, registerReagentMapper.getCountByPlatAndYearAndMonth(platId,year,month))
        );
        countVoList.add(
                new CountVo(Const.TYPE.MAINTAIN, registerMaintainMapper.getCountByPlatAndYearAndMonth(platId,year,month))
        );

        return ResultUtil.createBySuccess(countVoList);
    }

    @Override
    public ResultVo getGoodsTypeCountByPlatAndTypeAndDate(String platId, Integer type, String year) {

        if(platId.equals("0"))
            platId = "%";
        if("%".equals(year))
            year = null;

        Map<String,BigDecimal> map = MapUtil.init();
        switch (type) {
            case 1:
                MapUtil.merge(map,registerMaterialMapper.getCountByPlatAndTypeAndDate(platId,year));
                break;
            case 2:
                MapUtil.merge(map,registerPartsMapper.getCountByPlatAndTypeAndDate(platId,year));
                break;
            case 3:
                MapUtil.merge(map,registerReagentMapper.getCountByPlatAndTypeAndDate(platId,year));
                break;
            case 4:
                MapUtil.merge(map,registerMaintainMapper.getCountByPlatAndTypeAndDate(platId,year));
                break;
            case 0:
                {
                    MapUtil.merge(map,registerMaterialMapper.getCountByPlatAndTypeAndDate(platId,year));
                    MapUtil.merge(map,registerPartsMapper.getCountByPlatAndTypeAndDate(platId,year));
                    MapUtil.merge(map,registerReagentMapper.getCountByPlatAndTypeAndDate(platId,year));
                    MapUtil.merge(map,registerMaintainMapper.getCountByPlatAndTypeAndDate(platId,year));
                }
                break;
        }
        return ResultUtil.createBySuccess(map);
    }

    @Override
    public ResultVo getGoodsTypePlatCountByTypeAndDate(String userId, Integer type, String year, String month) {

        if("%".equals(year))
            year = null;
        if("%".equals(month))
            month = null;

        List<Integer> platIdsList = null;
        if(userMapper.selectByPrimaryKey(Integer.valueOf(userId)).getType() == 0)
            platIdsList = userPlatMapper.selectIdsByManager(userId);
        else
            platIdsList = platformMapper.getAllIds();
        List<CountVo> countVoList = new ArrayList<>();

        for(Integer platId: platIdsList) {

            CountVo countVo = null;
            switch (type) {
                case 1:
                    countVo = registerMaterialMapper.getPlatCountByTypeAndDate(platId, year,month).check();
                    break;
                case 2:
                    countVo = registerPartsMapper.getPlatCountByTypeAndDate(platId, year,month).check();
                    break;
                case 3:
                    countVo = registerReagentMapper.getPlatCountByTypeAndDate(platId, year,month).check();
                    break;
                case 4:
                    countVo = registerMaintainMapper.getPlatCountByTypeAndDate(platId, year,month).check();
                    break;
                case 0:
                {
                    countVo = new CountVo("",BigDecimal.ZERO);
                    countVo.add(registerMaterialMapper.getPlatCountByTypeAndDate(platId, year,month).check());
                    countVo.add(registerPartsMapper.getPlatCountByTypeAndDate(platId, year,month).check());
                    countVo.add(registerReagentMapper.getPlatCountByTypeAndDate(platId, year,month).check());
                    countVo.add(registerMaintainMapper.getPlatCountByTypeAndDate(platId, year,month).check());
                    break;
                }
            }
            countVoList.add(countVo);
        }

        return ResultUtil.createBySuccess(countVoList);
    }


}
