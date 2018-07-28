package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.ProMaterial;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ProMaterialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProMaterial record);

    int insertSelective(ProMaterial record);

    ProMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProMaterial record);

    int updateByPrimaryKey(ProMaterial record);

    List<ProMaterial> getByPlat(String platId);

    List<Integer> getIdsByPlat(@Param("platId") String platId, @Param("name") String name);

}