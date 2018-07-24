package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.ProInstrument;
import cn.nwsuaf.edu.srms.vo.InstrumentVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ProInstrumentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProInstrument record);

    int insertSelective(ProInstrument record);

    ProInstrument selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProInstrument record);

    int updateByPrimaryKey(ProInstrument record);

    List<InstrumentVo> getInstrumentByPlat(Integer platId);
}