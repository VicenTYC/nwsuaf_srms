package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.RegisterMaintain;
import cn.nwsuaf.edu.srms.entity.RegisterMaterial;
import cn.nwsuaf.edu.srms.entity.RegisterParts;
import cn.nwsuaf.edu.srms.entity.RegisterReagent;
import cn.nwsuaf.edu.srms.vo.ResultVo;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 21:40
 */

public interface ManagerRegisterService {
    ResultVo saveMaintainRecord(RegisterMaintain registerMaintain, int userId);

    ResultVo commitMaintainRecord(RegisterMaintain registerMaintain, int userId);

    ResultVo deleteMaintainRecord(String recordId);

    ResultVo getMaintainRecord(String platId, Integer pageNum, Integer pageSize, String name, String year, String month);


    ResultVo saveMaterialRecord(RegisterMaterial registerMaterial, int userId);

    ResultVo commitMaterialRecord(RegisterMaterial registerMaterial, int userId);

    ResultVo deleteMaterialRecord(String recordId);

    ResultVo getMaterialRecord(String platId, Integer pageNum, Integer pageSize, String name, String year, String month);


    ResultVo saveReagentRecord(RegisterReagent registerReagent, int userId);

    ResultVo commitReagentRecord(RegisterReagent registerReagent, int userId);

    ResultVo deleteReagentRecord(String recordId);

    ResultVo getReagentRecord(String platId, Integer pageNum, Integer pageSize, String name, String year, String month);


    ResultVo savePartsRecord(RegisterParts registerParts, int userId);

    ResultVo commitPartsRecord(RegisterParts registerParts, int userId);

    ResultVo deletePartsRecord(String recordId);

    ResultVo getPartsRecord(String platId, Integer pageNum, Integer pageSize, String name, String year, String month);
}
