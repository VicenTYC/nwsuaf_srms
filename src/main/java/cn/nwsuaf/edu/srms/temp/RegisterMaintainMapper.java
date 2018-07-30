package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.RegisterMaintain;

public interface RegisterMaintainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterMaintain record);

    int insertSelective(RegisterMaintain record);

    RegisterMaintain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterMaintain record);

    int updateByPrimaryKey(RegisterMaintain record);
}