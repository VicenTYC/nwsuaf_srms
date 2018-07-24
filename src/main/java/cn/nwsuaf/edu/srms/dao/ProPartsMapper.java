package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.ProParts;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ProPartsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProParts record);

    int insertSelective(ProParts record);

    ProParts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProParts record);

    int updateByPrimaryKey(ProParts record);

    List<ProParts> getByPlat(String platId);
}