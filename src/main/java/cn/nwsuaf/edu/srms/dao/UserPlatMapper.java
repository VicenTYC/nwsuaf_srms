package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.UserPlat;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserPlatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPlat record);

    int insertSelective(UserPlat record);

    UserPlat selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPlat record);

    int updateByPrimaryKey(UserPlat record);

    List<Integer> selectIdsByManager(String userId);
}