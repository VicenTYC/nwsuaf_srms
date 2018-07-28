package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.ProMaintain;
import cn.nwsuaf.edu.srms.entity.ProMaterial;
import cn.nwsuaf.edu.srms.entity.ProParts;
import cn.nwsuaf.edu.srms.entity.ProReagent;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 21:06
 */
public interface ManagerGoodsService {

    ResultVo<List<ProMaterial>> getMaterialByPlat(String platId);

    ResultVo addMaterial(ProMaterial proMaterial);

    ResultVo<PageInfo<ProMaterial>> getMaterialPageByPlat(String platId, Integer pageNum, Integer pageSize);

    ResultVo<List<ProMaintain>> getMaintainByPlat(String platId);

    ResultVo addMaintain(ProMaintain proMaintain);

    ResultVo getMaintainPageByPlat(String platId, Integer pageNum, Integer pageSize);

    ResultVo<List<ProParts>> getPartsByPlat(String platId);

    ResultVo getPartsPageByPlat(String platId, Integer pageNum, Integer pageSize);

    ResultVo addParts(ProParts proParts);

    ResultVo<List<ProReagent>> getReagentByPlat(String platId);

    ResultVo getReagentPageByPlat(String platId, Integer pageNum, Integer pageSize);

    ResultVo addReagent(ProReagent proReagent);



}
