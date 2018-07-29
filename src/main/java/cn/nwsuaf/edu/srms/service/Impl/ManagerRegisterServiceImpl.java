package cn.nwsuaf.edu.srms.service.Impl;

import cn.nwsuaf.edu.srms.common.Const;
import cn.nwsuaf.edu.srms.dao.*;
import cn.nwsuaf.edu.srms.entity.*;
import cn.nwsuaf.edu.srms.service.ManagerRegisterService;
import cn.nwsuaf.edu.srms.util.RegisterVoUtil;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.RegisterVo;
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
 * Time: 21:40
 */
@Service
public class ManagerRegisterServiceImpl implements ManagerRegisterService {

    @Autowired
    private ProMaintainMapper proMaintainMapper;
    @Autowired
    private RegisterMaintainMapper registerMaintainMapper;

    @Autowired
    private ProMaterialMapper proMaterialMapper;
    @Autowired
    private RegisterMaterialMapper registerMaterialMapper;

    @Autowired
    private ProReagentMapper proReagentMapper;
    @Autowired
    private RegisterReagentMapper registerReagentMapper;

    @Autowired
    private ProPartsMapper proPartsMapper;
    @Autowired
    private RegisterPartsMapper registerPartsMapper;

    @Override
    public ResultVo saveMaintainRecord(RegisterMaintain registerMaintain, int userId) {

        registerMaintain.setUserId(userId);
        registerMaintain.setStatus(Const.REGTSTER.SAVE);

        if(registerMaintain.getId() == null) {
            registerMaintainMapper.insert(registerMaintain);
        } else {
            registerMaintainMapper.updateByPrimaryKey(registerMaintain);
        }

        return ResultUtil.createBySuccessMessage(Const.CURD.SAVESUCCESS);

    }

    @Override
    public ResultVo commitMaintainRecord(RegisterMaintain registerMaintain, int userId) {

        registerMaintain.setUserId(userId);
        registerMaintain.setStatus(Const.REGTSTER.COMMIT);

        if(registerMaintain.getId() == null)
            registerMaintainMapper.insert(registerMaintain);
        else
            registerMaintainMapper.updateByPrimaryKey(registerMaintain);

        return ResultUtil.createBySuccessMessage(Const.CURD.COMMITSUCCESS);
    }

    @Override
    public ResultVo deleteMaintainRecord(String recordId) {
         registerMaintainMapper.deleteByPrimaryKey(Integer.valueOf(recordId));
         return ResultUtil.createBySuccessMessage(Const.CURD.DELETESUCCESS);
    }

    @Override
    public ResultVo getMaintainRecord(String platId, Integer pageNum, Integer pageSize, String name, String year, String month) {

        if(name!=null && name.equals("%"))
            name = null;
        if(year.equals("%"))
            year = null;
        if(month.equals("%"))
            month = null;

        List<Integer> maintainIdList = proMaintainMapper.getIdsByPlat(platId,name);

        if(maintainIdList.size() != 0 ){
            PageHelper.startPage(pageNum,pageSize);
            List<Integer> idList = registerMaintainMapper.getIds(maintainIdList,year,month);

            if(idList.size() != 0) {
                List<RegisterVo> registerVoList = registerMaintainMapper.getRegister(idList);
                RegisterVoUtil.setString(registerVoList);

                PageInfo pageInfo = new PageInfo(idList);
                pageInfo.setList(registerVoList);
                return ResultUtil.createBySuccess("查询成功",pageInfo);
            }
        }
        return ResultUtil.createByErrorMessage("无登记记录");

    }

    @Override
    public ResultVo saveMaterialRecord(RegisterMaterial registerMaterial, int userId) {
        registerMaterial.setUserId(userId);
        registerMaterial.setStatus(Const.REGTSTER.SAVE);

        if(registerMaterial.getId() == null)
            registerMaterialMapper.insert(registerMaterial);
        else
            registerMaterialMapper.updateByPrimaryKey(registerMaterial);

        return ResultUtil.createBySuccessMessage(Const.CURD.SAVESUCCESS);
    }

    @Override
    public ResultVo commitMaterialRecord(RegisterMaterial registerMaterial, int userId) {
        registerMaterial.setUserId(userId);
        registerMaterial.setStatus(Const.REGTSTER.COMMIT);

        if(registerMaterial.getId() == null)
            registerMaterialMapper.insert(registerMaterial);
        else
            registerMaterialMapper.updateByPrimaryKey(registerMaterial);

        return ResultUtil.createBySuccessMessage(Const.CURD.COMMITSUCCESS);
    }

    @Override
    public ResultVo deleteMaterialRecord(String recordId) {
        registerMaterialMapper.deleteByPrimaryKey(Integer.valueOf(recordId));
        return ResultUtil.createBySuccessMessage(Const.CURD.DELETESUCCESS);
    }

    @Override
    public ResultVo getMaterialRecord(String platId, Integer pageNum, Integer pageSize, String name, String year, String month) {

        if(name!=null && name.equals("%"))
            name = null;
        if(year.equals("%"))
            year = null;
        if(month.equals("%"))
            month = null;

        List<Integer> materialIdList = proMaterialMapper.getIdsByPlat(platId,name);

        if(materialIdList.size() != 0) {
            PageHelper.startPage(pageNum,pageSize);
            List<Integer> idList = registerMaterialMapper.getIds(materialIdList,year,month);

            if(idList.size() != 0) {
                List<RegisterVo> registerVoList;
                registerVoList = registerMaterialMapper.getRegister(idList);
                RegisterVoUtil.setString(registerVoList);

                PageInfo pageInfo = new PageInfo(idList);
                pageInfo.setList(registerVoList);
                return ResultUtil.createBySuccess(Const.CURD.GETSUCCESS,pageInfo);
            }
        }
        return ResultUtil.createByErrorMessage("无登记记录");
    }

    @Override
    public ResultVo savePartsRecord(RegisterParts registerParts, int userId) {
        registerParts.setUserId(userId);
        registerParts.setStatus(Const.REGTSTER.SAVE);

        if(registerParts.getId() == null)
            registerPartsMapper.insert(registerParts);
        else
            registerPartsMapper.updateByPrimaryKey(registerParts);

        return ResultUtil.createBySuccessMessage(Const.CURD.SAVESUCCESS);
    }

    @Override
    public ResultVo commitPartsRecord(RegisterParts registerParts, int userId) {
        registerParts.setUserId(userId);
        registerParts.setStatus(Const.REGTSTER.COMMIT);

        if(registerParts.getId() == null)
            registerPartsMapper.insert(registerParts);
        else
            registerPartsMapper.updateByPrimaryKey(registerParts);

        return ResultUtil.createBySuccessMessage(Const.CURD.COMMITSUCCESS);
    }

    @Override
    public ResultVo deletePartsRecord(String recordId) {
        registerPartsMapper.deleteByPrimaryKey(Integer.valueOf(recordId));
        return ResultUtil.createBySuccessMessage(Const.CURD.DELETESUCCESS);
    }

    @Override
    public ResultVo getPartsRecord(String platId, Integer pageNum, Integer pageSize, String name, String year, String month) {

        if(name!=null && name.equals("%"))
            name = null;
        if(year.equals("%"))
            year = null;
        if(month.equals("%"))
            month = null;

        List<Integer> materialIdList = proPartsMapper.getIdsByPlat(platId,name);

        if(materialIdList.size() != 0 ){
            PageHelper.startPage(pageNum,pageSize);
            List<Integer> idList = registerPartsMapper.getIds(materialIdList,year,month);

            if(idList.size() != 0){
                List<RegisterVo> registerVoList = registerPartsMapper.getRegister(idList);

                RegisterVoUtil.setString(registerVoList);

                PageInfo pageInfo = new PageInfo(idList);
                pageInfo.setList(registerVoList);

                return ResultUtil.createBySuccess("查询配件成功",pageInfo);
            }
        }
        return ResultUtil.createByErrorMessage("无登记记录");
    }

    @Override
    public ResultVo saveReagentRecord(RegisterReagent registerReagent, int userId) {
        registerReagent.setUserId(userId);
        registerReagent.setStatus(Const.REGTSTER.SAVE);

        if(registerReagent.getId() == null)
            registerReagentMapper.insert(registerReagent);
        else
            registerReagentMapper.updateByPrimaryKey(registerReagent);

        return ResultUtil.createBySuccessMessage(Const.CURD.SAVESUCCESS);
    }

    @Override
    public ResultVo commitReagentRecord(RegisterReagent registerReagent, int userId) {
        registerReagent.setUserId(userId);
        registerReagent.setStatus(Const.REGTSTER.COMMIT);

        if(registerReagent.getId() == null)
            registerReagentMapper.insert(registerReagent);
        else
            registerReagentMapper.updateByPrimaryKey(registerReagent);

        return ResultUtil.createBySuccessMessage(Const.CURD.COMMITSUCCESS);
    }

    @Override
    public ResultVo deleteReagentRecord(String recordId) {
        registerReagentMapper.deleteByPrimaryKey(Integer.valueOf(recordId));
        return ResultUtil.createBySuccessMessage(Const.CURD.DELETESUCCESS);
    }

    @Override
    public ResultVo getReagentRecord(String platId, Integer pageNum, Integer pageSize, String name, String year, String month) {

        if(name!=null && name.equals("%"))
            name = null;
        if(year.equals("%"))
            year = null;
        if(month.equals("%"))
            month = null;

        List<Integer> materialIdList = proReagentMapper.getIdsByPlat(platId,name);
        if(materialIdList.size() != 0 ){
            PageHelper.startPage(pageNum,pageSize);
            List<Integer> idList =  registerReagentMapper.getIds(materialIdList,year,month);

            if(idList.size() != 0) {
                List<RegisterVo> registerVoList = registerReagentMapper.getRegister(idList);
                RegisterVoUtil.setString(registerVoList);
                PageInfo pageInfo = new PageInfo(idList);
                pageInfo.setList(registerVoList);

                return ResultUtil.createBySuccess(Const.CURD.GETSUCCESS,pageInfo);
            }
        }

        return ResultUtil.createByErrorMessage("无登记记录");
    }

}
