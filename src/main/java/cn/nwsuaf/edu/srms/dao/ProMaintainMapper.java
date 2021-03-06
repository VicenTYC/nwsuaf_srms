package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.ProMaintain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ProMaintainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProMaintain record);

    int insertSelective(ProMaintain record);

    ProMaintain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProMaintain record);

    int updateByPrimaryKey(ProMaintain record);

    List<ProMaintain> getByPlat(@Param("platId") String platId, @Param("name") String name);

    List<Integer> getIdsByPlat(@Param("platId") String platId, @Param("name") String name);
}