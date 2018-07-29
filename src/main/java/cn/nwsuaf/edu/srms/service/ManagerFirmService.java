package cn.nwsuaf.edu.srms.service;

import cn.nwsuaf.edu.srms.entity.ComMaintainer;
import cn.nwsuaf.edu.srms.entity.ComProducer;
import cn.nwsuaf.edu.srms.entity.ComSupplier;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 16:48
 */
public interface ManagerFirmService {
    ResultVo<List<ComMaintainer>> getAllMaintainer();

    ResultVo<PageInfo<ComMaintainer>> getPageMaintainer(Integer pageNum, Integer pageSize);

    ResultVo<String> addMaintainer(ComMaintainer comMaintain);

    ResultVo<List<ComProducer>> getAllProducer();

    ResultVo<PageInfo<ComProducer>> getPageProducer(Integer pageNum, Integer pageSize);

    ResultVo addProducer(ComProducer comProducer);

    ResultVo<List<ComSupplier>> getAllSupplier();

    ResultVo<String> addSupplier(ComSupplier comSupplier);

    ResultVo<PageInfo<ComSupplier>> getPageSupplier(Integer pageNum, Integer pageSize);
}
