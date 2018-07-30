package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.RegisterMaterial;

public interface RegisterMaterialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterMaterial record);

    int insertSelective(RegisterMaterial record);

    RegisterMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterMaterial record);

    int updateByPrimaryKey(RegisterMaterial record);
}