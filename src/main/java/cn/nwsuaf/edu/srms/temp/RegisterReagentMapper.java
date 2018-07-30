package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.RegisterReagent;

public interface RegisterReagentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterReagent record);

    int insertSelective(RegisterReagent record);

    RegisterReagent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterReagent record);

    int updateByPrimaryKey(RegisterReagent record);
}