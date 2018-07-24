package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.ProInstrument;
import cn.nwsuaf.edu.srms.vo.InstrumentVo;
import cn.nwsuaf.edu.srms.vo.ResultVo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 17:13
 */
public interface ManagerInstrumentService {
    ResultVo<List<InstrumentVo>> getInstrumentByPlat(Integer platId);

    ResultVo<String> addInstrument(ProInstrument proInstrument);
}
