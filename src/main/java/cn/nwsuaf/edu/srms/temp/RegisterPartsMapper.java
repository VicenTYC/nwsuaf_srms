package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.RegisterParts;

public interface RegisterPartsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterParts record);

    int insertSelective(RegisterParts record);

    RegisterParts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterParts record);

    int updateByPrimaryKey(RegisterParts record);
}