package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.UserPlat;

public interface UserPlatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPlat record);

    int insertSelective(UserPlat record);

    UserPlat selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPlat record);

    int updateByPrimaryKey(UserPlat record);
}