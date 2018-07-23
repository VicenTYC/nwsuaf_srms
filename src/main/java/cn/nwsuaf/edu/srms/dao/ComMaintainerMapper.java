package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.ComMaintainer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ComMaintainerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ComMaintainer record);

    int insertSelective(ComMaintainer record);

    ComMaintainer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ComMaintainer record);

    int updateByPrimaryKey(ComMaintainer record);
}