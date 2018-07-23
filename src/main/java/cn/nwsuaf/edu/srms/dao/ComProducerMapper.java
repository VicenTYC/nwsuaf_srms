package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.ComProducer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface ComProducerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ComProducer record);

    int insertSelective(ComProducer record);

    ComProducer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ComProducer record);

    int updateByPrimaryKey(ComProducer record);
}