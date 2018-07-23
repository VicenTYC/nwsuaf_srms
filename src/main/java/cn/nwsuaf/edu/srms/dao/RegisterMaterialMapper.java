package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.RegisterMaterial;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RegisterMaterialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterMaterial record);

    int insertSelective(RegisterMaterial record);

    RegisterMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterMaterial record);

    int updateByPrimaryKey(RegisterMaterial record);
}