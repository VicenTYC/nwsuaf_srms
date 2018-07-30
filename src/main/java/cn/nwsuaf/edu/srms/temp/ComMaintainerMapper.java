package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.ComMaintainer;

public interface ComMaintainerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ComMaintainer record);

    int insertSelective(ComMaintainer record);

    ComMaintainer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ComMaintainer record);

    int updateByPrimaryKey(ComMaintainer record);
}