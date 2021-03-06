package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.ProReagent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ProReagentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProReagent record);

    int insertSelective(ProReagent record);

    ProReagent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProReagent record);

    int updateByPrimaryKey(ProReagent record);

    List<ProReagent> getByPlat(@Param("platId") String platId, @Param("name") String name);

    List<Integer> getIdsByPlat(@Param("platId") String platId, @Param("name") String name);
}