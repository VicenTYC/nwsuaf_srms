package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.ProMaintain;
import cn.nwsuaf.edu.srms.entity.ProMaterial;
import cn.nwsuaf.edu.srms.entity.ProParts;
import cn.nwsuaf.edu.srms.entity.ProReagent;
import cn.nwsuaf.edu.srms.vo.ResultVo;

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

    ResultVo<List<ProMaintain>> getMaintainByPlat(String platId);

    ResultVo addMaintain(ProMaintain proMaintain);

    ResultVo<List<ProParts>> getPartsByPlat(String platId);

    ResultVo addParts(ProParts proParts);

    ResultVo<List<ProReagent>> getReagentByPlat(String platId);

    ResultVo addReagent(ProReagent proReagent);
}
