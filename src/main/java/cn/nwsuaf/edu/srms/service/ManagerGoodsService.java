package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.ProMaintain;
import cn.nwsuaf.edu.srms.entity.ProMaterial;
import cn.nwsuaf.edu.srms.entity.ProParts;
import cn.nwsuaf.edu.srms.entity.ProReagent;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import com.github.pagehelper.PageInfo;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 21:06
 */
public interface ManagerGoodsService {

    ResultVo<PageInfo<ProMaterial>> getMaterialPageByPlat(String platId, String name, Integer pageNum, Integer pageSize);

    ResultVo addMaterial(ProMaterial proMaterial);


    ResultVo getMaintainPageByPlat(String platId, String name, Integer pageNum, Integer pageSize);

    ResultVo addMaintain(ProMaintain proMaintain);


    ResultVo getPartsPageByPlat(String platId, String name, Integer pageNum, Integer pageSize);

    ResultVo addParts(ProParts proParts);


    ResultVo getReagentPageByPlat(String platId, String name, Integer pageNum, Integer pageSize);

    ResultVo addReagent(ProReagent proReagent);



}
