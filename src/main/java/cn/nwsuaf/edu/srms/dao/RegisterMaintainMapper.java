package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.RegisterMaintain;
import cn.nwsuaf.edu.srms.vo.RegisterVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

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

    List<Integer> getIds(@Param("maintainIdList") List<Integer> maintainIdList);
}