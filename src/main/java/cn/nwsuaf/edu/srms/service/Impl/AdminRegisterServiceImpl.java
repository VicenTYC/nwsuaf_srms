package cn.nwsuaf.edu.srms.service.Impl;

import cn.nwsuaf.edu.srms.common.Const;
import cn.nwsuaf.edu.srms.dao.RegisterMaintainMapper;
import cn.nwsuaf.edu.srms.dao.RegisterMaterialMapper;
import cn.nwsuaf.edu.srms.dao.RegisterPartsMapper;
import cn.nwsuaf.edu.srms.dao.RegisterReagentMapper;
import cn.nwsuaf.edu.srms.service.AdminRegisterService;
import cn.nwsuaf.edu.srms.util.RegisterVoUtil;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.RegisterVo;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/31
 * Time: 21:01
 */
@Service
public class AdminRegisterServiceImpl implements AdminRegisterService {

    @Autowired
    private RegisterPartsMapper registerPartsMapper;
    @Autowired
    private RegisterReagentMapper registerReagentMapper;
    @Autowired
    private RegisterMaintainMapper registerMaintainMapper;
    @Autowired
    private RegisterMaterialMapper registerMaterialMapper;

    @Override
    public ResultVo getAdminRegister(Integer type) {

        List<RegisterVo> resultVoList = null;

        switch (type) {
            case 1:
                resultVoList = registerMaterialMapper.getAdminRegister(Const.REGTSTER.COMMIT);
                break;
            case 2:
                resultVoList = registerPartsMapper.getAdminRegister(Const.REGTSTER.COMMIT);
                break;
            case 3:
                resultVoList = registerReagentMapper.getAdminRegister(Const.REGTSTER.COMMIT);
                break;
            case 4:
                resultVoList = registerMaintainMapper.getAdminRegister(Const.REGTSTER.COMMIT);
                break;
        }

        RegisterVoUtil.setString(resultVoList);

        return ResultUtil.createBySuccess(resultVoList);
    }

    @Override
    public ResultVo agreeRegister(Integer type, String registerId) {

        int status = 0;

        switch (type) {
            case 1:
                status = registerMaterialMapper.updateRegister(registerId,Const.REGTSTER.PASS);
                break;
            case 2:
                status = registerPartsMapper.updateRegister(registerId,Const.REGTSTER.PASS);
                break;
            case 3:
                status = registerReagentMapper.updateRegister(registerId,Const.REGTSTER.PASS);
                break;
            case 4:
                status = registerMaintainMapper.updateRegister(registerId,Const.REGTSTER.PASS);
                break;
        }

        if(status == 1)
            return ResultUtil.createBySuccessMessage("审核成功");
        return ResultUtil.createBySuccessMessage("审核错误");
    }

    @Override
    public ResultVo unAgreeRegister(Integer type, String registerId) {
        int status = 0;

        switch (type) {
            case 1:
                status = registerMaterialMapper.updateRegister(registerId,Const.REGTSTER.UNPASS);
                break;
            case 2:
                status = registerPartsMapper.updateRegister(registerId,Const.REGTSTER.UNPASS);
                break;
            case 3:
                status = registerReagentMapper.updateRegister(registerId,Const.REGTSTER.UNPASS);
                break;
            case 4:
                status = registerMaintainMapper.updateRegister(registerId,Const.REGTSTER.UNPASS);
                break;
        }

        if(status == 1)
            return ResultUtil.createBySuccessMessage("审核成功");
        return ResultUtil.createBySuccessMessage("审核错误");
    }

    @Override
    public ResultVo agreeAllRegister(Integer type) {
        int status = 0;

        switch (type) {
            case 1:
                status = registerMaterialMapper.updateAllRegister(Const.REGTSTER.PASS,Const.REGTSTER.COMMIT);
                break;
            case 2:
                status = registerPartsMapper.updateAllRegister(Const.REGTSTER.PASS,Const.REGTSTER.COMMIT);
                break;
            case 3:
                status = registerReagentMapper.updateAllRegister(Const.REGTSTER.PASS,Const.REGTSTER.COMMIT);
                break;
            case 4:
                status = registerMaintainMapper.updateAllRegister(Const.REGTSTER.PASS,Const.REGTSTER.COMMIT);
                break;
        }

        System.out.println(status);

        return ResultUtil.createBySuccessMessage("审核成功");
    }
}
