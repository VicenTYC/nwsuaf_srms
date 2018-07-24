package cn.nwsuaf.edu.srms.service.Impl;

import cn.nwsuaf.edu.srms.dao.ComMaintainerMapper;
import cn.nwsuaf.edu.srms.dao.ComProducerMapper;
import cn.nwsuaf.edu.srms.dao.ComSupplierMapper;
import cn.nwsuaf.edu.srms.entity.ComMaintainer;
import cn.nwsuaf.edu.srms.entity.ComProducer;
import cn.nwsuaf.edu.srms.entity.ComSupplier;
import cn.nwsuaf.edu.srms.service.ManagerFirmService;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 16:48
 */
@Service
public class ManagerFirmServiceImpl implements ManagerFirmService {

    @Autowired
    private ComMaintainerMapper comMaintainerMapper;
    @Autowired
    private ComProducerMapper comProducerMapper;
    @Autowired
    private ComSupplierMapper comSupplierMapper;


    @Override
    public ResultVO<List<ComMaintainer>> getAllMaintainer() {

        List<ComMaintainer> comMaintainerList = comMaintainerMapper.getAll();
        return ResultUtil.createBySuccess(comMaintainerList);
    }

    @Override
    public ResultVO<String> addMaintainer(ComMaintainer comMaintain) {

        int result = comMaintainerMapper.insert(comMaintain);
        if(result == 1){
            return ResultUtil.createBySuccessMessage("添加维修商成功");
        }
        return ResultUtil.createBySuccessMessage("添加维修商失败");
    }

    @Override
    public ResultVO<List<ComProducer>> getAllProducer() {
        List<ComProducer> comProducerList = comProducerMapper.getAll();
        return ResultUtil.createBySuccess(comProducerList);
    }

    @Override
    public ResultVO addProducer(ComProducer comProducer) {

        int result = comProducerMapper.insert(comProducer);
        if(result == 1){
            return ResultUtil.createBySuccessMessage("添加生产商成功");
        }
        return ResultUtil.createBySuccessMessage("添加生产商失败");
    }

    @Override
    public ResultVO<List<ComSupplier>> getAllSupplier() {

        List<ComSupplier> comSupplierList = comSupplierMapper.getAll();
        return ResultUtil.createBySuccess(comSupplierList);
    }

    @Override
    public ResultVO<String> addSupplier(ComSupplier comSupplier) {
        int result = comSupplierMapper.insert(comSupplier);
        if(result == 1){
            return ResultUtil.createBySuccessMessage("添加供应商成功");
        }
        return ResultUtil.createBySuccessMessage("添加供应商失败");
    }
}
