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

    ResultVo<PageInfo<ComMaintainer>> getPageMaintainer(Integer pageNum, Integer pageSize,String name);

    ResultVo<String> addMaintainer(ComMaintainer comMaintain);

    ResultVo<String> deleteMaintainer(String id);


    ResultVo<PageInfo<ComProducer>> getPageProducer(Integer pageNum, Integer pageSize, String name);

    ResultVo addProducer(ComProducer comProducer);

    ResultVo<String> deleteProducer(String id);


    ResultVo<PageInfo<ComSupplier>> getPageSupplier(Integer pageNum, Integer pageSize, String name);

    ResultVo<String> addSupplier(ComSupplier comSupplier);

    ResultVo<String> deleteSupplier(String id);
}
