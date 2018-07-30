package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.ComSupplier;

public interface ComSupplierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ComSupplier record);

    int insertSelective(ComSupplier record);

    ComSupplier selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ComSupplier record);

    int updateByPrimaryKey(ComSupplier record);
}