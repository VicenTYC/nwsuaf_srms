package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.RegisterReagent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RegisterReagentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterReagent record);

    int insertSelective(RegisterReagent record);

    RegisterReagent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterReagent record);

    int updateByPrimaryKey(RegisterReagent record);
}