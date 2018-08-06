package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.Platform;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PlatformMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Platform record);

    int insertSelective(Platform record);

    Platform selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Platform record);

    int updateByPrimaryKey(Platform record);

    List<Platform> selectByManager(@Param("userId") String userId);

    List<Platform> getAll();

    List<Integer> getAllIds();
}