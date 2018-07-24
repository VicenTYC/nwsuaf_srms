package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.ProReagent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ProReagentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProReagent record);

    int insertSelective(ProReagent record);

    ProReagent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProReagent record);

    int updateByPrimaryKey(ProReagent record);
}