package cn.nwsuaf.edu.srms.temp;

import cn.nwsuaf.edu.srms.temp.ProInstrument;

public interface ProInstrumentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProInstrument record);

    int insertSelective(ProInstrument record);

    ProInstrument selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProInstrument record);

    int updateByPrimaryKey(ProInstrument record);
}