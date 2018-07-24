package cn.nwsuaf.edu.srms.service.Impl;

import cn.nwsuaf.edu.srms.dao.ProMaintainMapper;
import cn.nwsuaf.edu.srms.dao.ProMaterialMapper;
import cn.nwsuaf.edu.srms.dao.ProPartsMapper;
import cn.nwsuaf.edu.srms.dao.ProReagentMapper;
import cn.nwsuaf.edu.srms.entity.ProMaintain;
import cn.nwsuaf.edu.srms.entity.ProMaterial;
import cn.nwsuaf.edu.srms.entity.ProParts;
import cn.nwsuaf.edu.srms.entity.ProReagent;
import cn.nwsuaf.edu.srms.service.ManagerGoodsService;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 21:07
 */
@Service
public class ManagerGoodsServiceImpl implements ManagerGoodsService {

    @Autowired
    private ProMaterialMapper proMaterialMapper;
    @Autowired
    private ProReagentMapper proReagentMapper;
    @Autowired
    private ProMaintainMapper proMaintainMapper;
    @Autowired
    private ProPartsMapper proPartsMapper;

    @Override
    public ResultVo<List<ProMaterial>> getMaterialByPlat(String platId) {

        List<ProMaterial> proMaterialList = proMaterialMapper.getByPlat(platId);
        return ResultUtil.createBySuccess(proMaterialList);
    }

    @Override
    public ResultVo addMaterial(ProMaterial proMaterial) {

        int result = proMaterialMapper.insert(proMaterial);
        if(result == 1){
            return ResultUtil.createBySuccessMessage("添加耗材成功");
        }
        return ResultUtil.createBySuccessMessage("添加耗材失败");
    }

    @Override
    public ResultVo<List<ProMaintain>> getMaintainByPlat(String platId) {

        List<ProMaintain> proMaintainList = proMaintainMapper.getByPlat(platId);
        return ResultUtil.createBySuccess(proMaintainList);

    }

    @Override
    public ResultVo addMaintain(ProMaintain proMaintain) {
        int result = proMaintainMapper.insert(proMaintain);
        if(result == 1){
            return ResultUtil.createBySuccessMessage("添加维修成功");
        }
        return ResultUtil.createBySuccessMessage("添加维修失败");
    }

    @Override
    public ResultVo<List<ProParts>> getPartsByPlat(String platId) {
        List<ProParts> proPartsList = proPartsMapper.getByPlat(platId);
        return ResultUtil.createBySuccess(proPartsList);
    }

    @Override
    public ResultVo addParts(ProParts proParts) {
        int result = proPartsMapper.insert(proParts);
        if(result == 1){
            return ResultUtil.createBySuccessMessage("添加配件成功");
        }
        return ResultUtil.createBySuccessMessage("添加配件失败");
    }

    @Override
    public ResultVo<List<ProReagent>> getReagentByPlat(String platId) {
        List<ProReagent> proReagentList = proReagentMapper.getByPlat(platId);
        return ResultUtil.createBySuccess(proReagentList);
    }

    @Override
    public ResultVo addReagent(ProReagent proReagent) {
        int result = proReagentMapper.insert(proReagent);
        if(result == 1){
            return ResultUtil.createBySuccessMessage("添加试剂成功");
        }
        return ResultUtil.createBySuccessMessage("添加试剂失败");
    }
}
