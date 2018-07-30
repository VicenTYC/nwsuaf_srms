package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.ComProducer;

public interface ComProducerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ComProducer record);

    int insertSelective(ComProducer record);

    ComProducer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ComProducer record);

    int updateByPrimaryKey(ComProducer record);
}