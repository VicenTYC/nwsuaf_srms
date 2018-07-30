package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.ProMaterial;

public interface ProMaterialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProMaterial record);

    int insertSelective(ProMaterial record);

    ProMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProMaterial record);

    int updateByPrimaryKey(ProMaterial record);
}