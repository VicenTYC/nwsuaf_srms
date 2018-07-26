package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.RegisterParts;
import cn.nwsuaf.edu.srms.vo.RegisterVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface RegisterPartsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterParts record);

    int insertSelective(RegisterParts record);

    RegisterParts selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterParts record);

    int updateByPrimaryKey(RegisterParts record);

    List<Integer> getIds(List<Integer> materialIdList);

    List<RegisterVo> getRegister(List<Integer> idList);
}