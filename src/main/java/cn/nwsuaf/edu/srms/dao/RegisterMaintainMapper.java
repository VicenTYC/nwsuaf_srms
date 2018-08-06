package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.RegisterMaintain;
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
public interface RegisterMaintainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterMaintain record);

    int insertSelective(RegisterMaintain record);

    RegisterMaintain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterMaintain record);

    int updateByPrimaryKey(RegisterMaintain record);

    List<RegisterVo> getRegister(@Param("idList")List<Integer> maintainIdList);

    List<Integer> getIds(@Param("maintainIdList") List<Integer> maintainIdList, @Param("year") String year, @Param("month") String month);

    BigDecimal getCountByPlatAndYearAndMonth(@Param("platId") String platId, @Param("year") String year, @Param("month") String month);

    Map<String,BigDecimal> getCountByPlatAndTypeAndDate(@Param("platId") String platId, @Param("year") String year);

    CountVo getPlatCountByTypeAndDate(@Param("platId") Integer platId, @Param("year") String year, @Param("month") String month);

    List<RegisterVo> getCommitRegister(@Param("commit") Integer commit);

    int updateRegister(@Param("registerId") String registerId, @Param("pass") Integer pass);

    int updateAllRegister(@Param("pass") Integer pass, @Param("commit") Integer commit);

    List<RegisterVo> getViewRegister(@Param("commit") Integer commit);


    List<Integer> getViewIds(@Param("commit") Integer commit);

    List<RegisterVo> getAdminViewRegister(@Param("idList") List<Integer> idList);
}