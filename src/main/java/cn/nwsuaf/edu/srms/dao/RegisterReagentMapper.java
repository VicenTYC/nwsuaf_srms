package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.RegisterReagent;
import cn.nwsuaf.edu.srms.vo.RegisterVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface RegisterReagentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterReagent record);

    int insertSelective(RegisterReagent record);

    RegisterReagent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterReagent record);

    int updateByPrimaryKey(RegisterReagent record);

    List<Integer> getIds(List<Integer> materialIdList);

    List<RegisterVo> getRegister(List<Integer> idList);
}