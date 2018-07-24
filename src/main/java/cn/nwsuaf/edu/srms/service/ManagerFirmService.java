package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.ComMaintainer;
import cn.nwsuaf.edu.srms.entity.ComProducer;
import cn.nwsuaf.edu.srms.entity.ComSupplier;
import cn.nwsuaf.edu.srms.vo.ResultVo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 16:48
 */
public interface ManagerFirmService {
    ResultVo<List<ComMaintainer>> getAllMaintainer();

    ResultVo<String> addMaintainer(ComMaintainer comMaintain);

    ResultVo<List<ComProducer>> getAllProducer();

    ResultVo addProducer(ComProducer comProducer);

    ResultVo<List<ComSupplier>> getAllSupplier();

    ResultVo<String> addSupplier(ComSupplier comSupplier);
}
