package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.RegisterMaintain;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RegisterMaintainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterMaintain record);

    int insertSelective(RegisterMaintain record);

    RegisterMaintain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterMaintain record);

    int updateByPrimaryKey(RegisterMaintain record);
}