package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.ProInstrument;
import cn.nwsuaf.edu.srms.vo.InstrumentVo;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 17:13
 */
public interface ManagerInstrumentService {
    ResultVo<List<InstrumentVo>> getInstrumentByPlat(Integer platId);

    ResultVo<String> addInstrument(ProInstrument proInstrument, Integer userId);

    ResultVo<PageInfo<InstrumentVo>> getPageInstrumentByPlat(Integer platId, Integer pageNum, Integer pageSize);
}
