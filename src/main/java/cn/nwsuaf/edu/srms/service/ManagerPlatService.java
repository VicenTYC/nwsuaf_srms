package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.Platform;
import cn.nwsuaf.edu.srms.vo.ResultVo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 16:15
 */
public interface ManagerPlatService {

    ResultVo<List<Platform>> getPlatByManager(String userId);
}
