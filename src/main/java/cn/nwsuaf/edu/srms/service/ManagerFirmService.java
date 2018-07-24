package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.ComMaintainer;
import cn.nwsuaf.edu.srms.entity.ComProducer;
import cn.nwsuaf.edu.srms.entity.ComSupplier;
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

    ResultVO<String> addMaintainer(ComMaintainer comMaintain);

    ResultVO<List<ComProducer>> getAllProducer();

    ResultVO addProducer(ComProducer comProducer);

    ResultVO<List<ComSupplier>> getAllSupplier();

    ResultVO<String> addSupplier(ComSupplier comSupplier);
}
