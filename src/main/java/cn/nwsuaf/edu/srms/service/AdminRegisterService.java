package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.vo.ResultVo;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/31
 * Time: 21:01
 */
public interface AdminRegisterService {
    ResultVo getAdminRegister(Integer type);

    ResultVo agreeRegister(Integer type, String registerId);

    ResultVo unAgreeRegister(Integer type, String registerId);

    ResultVo agreeAllRegister(Integer type);

    ResultVo getAdminViewRegister(Integer type, Integer pageNum, Integer pageSize);

    ResultVo getViewRegister(Integer type, Integer pageNum, Integer pageSize);

}
