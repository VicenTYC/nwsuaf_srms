package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.ProReagent;

public interface ProReagentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProReagent record);

    int insertSelective(ProReagent record);

    ProReagent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProReagent record);

    int updateByPrimaryKey(ProReagent record);
}