package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.RegisterReagent;
import cn.nwsuaf.edu.srms.vo.CountVo;
import cn.nwsuaf.edu.srms.vo.RegisterVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface RegisterReagentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterReagent record);

    int insertSelective(RegisterReagent record);

    RegisterReagent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterReagent record);

    int updateByPrimaryKey(RegisterReagent record);

    List<Integer> getIds(@Param("materialIdList") List<Integer> materialIdList, @Param("year") String year, @Param("month") String month);

    List<RegisterVo> getRegister(@Param("idList") List<Integer> idList);

    BigDecimal getCountByPlatAndYearAndMonth(@Param("platId") String platId, @Param("year") String year, @Param("month") String month);

    Map<String,BigDecimal> getCountByPlatAndTypeAndDate(@Param("platId") String platId, @Param("year") String year);

    CountVo getPlatCountByTypeAndDate(@Param("platId") Integer platId, @Param("year") String year, @Param("month") String month);
}