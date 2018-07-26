package cn.nwsuaf.edu.srms.dao;

import cn.nwsuaf.edu.srms.entity.RegisterMaterial;
import cn.nwsuaf.edu.srms.vo.RegisterVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface RegisterMaterialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegisterMaterial record);

    int insertSelective(RegisterMaterial record);

    RegisterMaterial selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegisterMaterial record);

    int updateByPrimaryKey(RegisterMaterial record);

    List<Integer> getIds(List<Integer> maintainIdList);

    List<RegisterVo> getRegister(List<Integer> idList);
}