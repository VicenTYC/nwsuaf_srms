package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.ProParts;

public interface ProPartsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProParts record);

    int insertSelective(ProParts record);

    ProParts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProParts record);

    int updateByPrimaryKey(ProParts record);
}