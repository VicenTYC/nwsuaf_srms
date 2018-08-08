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
import cn.nwsuaf.edu.srms.util.StringUtil;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public ResultVo<PageInfo<ProMaterial>> getMaterialPageByPlat(String platId, String name, Integer pageNum, Integer pageSize) {

        name = StringUtil.isLike(name);

        PageHelper.startPage(pageNum,pageSize);
        List<ProMaterial> proMaterialList = proMaterialMapper.getByPlat(platId,name);
        PageInfo<ProMaterial> pageInfo = new PageInfo<>(proMaterialList);

        return ResultUtil.createBySuccess(pageInfo);
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
    public ResultVo getMaintainPageByPlat(String platId, String name, Integer pageNum, Integer pageSize) {

        name = StringUtil.isLike(name);

        PageHelper.startPage(pageNum,pageSize);
        List<ProMaintain> proMaintainList = proMaintainMapper.getByPlat(platId,name);
        PageInfo<ProMaintain> pageInfo = new PageInfo<>(proMaintainList);

        return ResultUtil.createBySuccess(pageInfo);
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
    public ResultVo getPartsPageByPlat(String platId, String name, Integer pageNum, Integer pageSize) {
        name = StringUtil.isLike(name);

        PageHelper.startPage(pageNum,pageSize);
        List<ProParts> proPartsList = proPartsMapper.getByPlat(platId,name);
        PageInfo<ProParts> pageInfo = new PageInfo<>(proPartsList);

        return ResultUtil.createBySuccess(pageInfo);

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
    public ResultVo getReagentPageByPlat(String platId, String name, Integer pageNum, Integer pageSize) {
        name = StringUtil.isLike(name);

        PageHelper.startPage(pageNum,pageSize);
        List<ProReagent> proReagentList = proReagentMapper.getByPlat(platId,name);
        PageInfo<ProReagent> pageInfo = new PageInfo<>(proReagentList);
        return ResultUtil.createBySuccess(pageInfo);

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
