package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.RegisterParts;
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
public interface RegisterPartsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterParts record);

    int insertSelective(RegisterParts record);

    RegisterParts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterParts record);

    int updateByPrimaryKey(RegisterParts record);

    List<Integer> getIds(@Param("materialIdList") List<Integer> materialIdList, @Param("year") String year, @Param("month") String month);

    List<RegisterVo> getRegister(@Param("idList") List<Integer> idList);

    BigDecimal getCountByPlatAndYearAndMonth(@Param("platId") String platId, @Param("year") String year, @Param("month") String month);

    Map<String,BigDecimal> getCountByPlatAndTypeAndDate(@Param("platId") String platId, @Param("year") String year);

    CountVo getPlatCountByTypeAndDate(@Param("platId") Integer platId, @Param("year") String year, @Param("month") String month);

    List<RegisterVo> getAdminRegister(@Param("commit") Integer commit);

    int updateRegister(@Param("registerId") String registerId, @Param("pass") Integer pass);

    int updateAllRegister(@Param("pass") Integer pass, @Param("commit") Integer commit);

    List<Integer> getViewIds(@Param("commit") Integer commit);

    List<RegisterVo> getAdminViewRegister(@Param("idList") List<Integer> idList);
}