package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.ProMaintain;

public interface ProMaintainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProMaintain record);

    int insertSelective(ProMaintain record);

    ProMaintain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProMaintain record);

    int updateByPrimaryKey(ProMaintain record);
}