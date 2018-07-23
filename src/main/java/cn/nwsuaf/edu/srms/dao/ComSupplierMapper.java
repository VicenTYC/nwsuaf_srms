package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.ComSupplier;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ComSupplierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ComSupplier record);

    int insertSelective(ComSupplier record);

    ComSupplier selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ComSupplier record);

    int updateByPrimaryKey(ComSupplier record);
}