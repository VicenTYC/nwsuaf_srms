package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.ComMaintainer;
import cn.nwsuaf.edu.srms.vo.ResultVO;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 16:48
 */
public interface ManagerFirmService {
    ResultVO<List<ComMaintainer>> getAllMaintainer();
}
