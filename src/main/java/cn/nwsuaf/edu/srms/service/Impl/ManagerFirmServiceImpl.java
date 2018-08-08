package cn.nwsuaf.edu.srms.service.Impl;

import cn.nwsuaf.edu.srms.common.Const;
import cn.nwsuaf.edu.srms.dao.ComMaintainerMapper;
import cn.nwsuaf.edu.srms.dao.ComProducerMapper;
import cn.nwsuaf.edu.srms.dao.ComSupplierMapper;
import cn.nwsuaf.edu.srms.entity.ComMaintainer;
import cn.nwsuaf.edu.srms.entity.ComProducer;
import cn.nwsuaf.edu.srms.entity.ComSupplier;
import cn.nwsuaf.edu.srms.service.ManagerFirmService;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public ResultVo<PageInfo<ComMaintainer>> getPageMaintainer(Integer pageNum,Integer pageSize,String name) {

        if(!name.equals("%"))
            name = "%"+name+"%";

        PageHelper.startPage(pageNum,pageSize);
        List<ComMaintainer> comMaintainerList = comMaintainerMapper.getMaintainerByName(name);

        PageInfo<ComMaintainer> pageInfo = new PageInfo<>(comMaintainerList);
        return ResultUtil.createBySuccess(pageInfo);
    }

    @Override
    public ResultVo<String> addMaintainer(ComMaintainer comMaintain) {

        comMaintain.setStatus(Const.COM_STATUS.ONLINE);
        if(comMaintain.getId() == null) {
            int result = comMaintainerMapper.insert(comMaintain);
            if(result == 1){
                return ResultUtil.createBySuccessMessage("添加维修商成功");
            }
            return ResultUtil.createByErrorMessage("添加维修商失败");
        } else {
            int result = comMaintainerMapper.updateByPrimaryKey(comMaintain);
            if(result == 1){
                return ResultUtil.createBySuccessMessage("修改维修商成功");
            }
            return ResultUtil.createByErrorMessage("修改维修商失败");
        }
    }

    @Override
    public ResultVo<String> deleteMaintainer(String id) {
        int result = comMaintainerMapper.deleteById(id);
        if(result == 1){
            return ResultUtil.createBySuccessMessage("删除维修商成功");
        }
        return ResultUtil.createByErrorMessage("删除维修商失败");
    }

    @Override
    public ResultVo<PageInfo<ComProducer>> getPageProducer(Integer pageNum, Integer pageSize, String name) {

        if(!name.equals("%"))
            name = "%"+name+"%";

        PageHelper.startPage(pageNum,pageSize);
        List<ComProducer> comProducerList = comProducerMapper.getProducerByName(name);

        PageInfo<ComProducer> pageInfo = new PageInfo<>(comProducerList);
        return ResultUtil.createBySuccess(pageInfo);
    }

    @Override
    public ResultVo addProducer(ComProducer comProducer) {
        comProducer.setStatus(Const.COM_STATUS.ONLINE);
        if(comProducer.getId() == null) {
            int result = comProducerMapper.insert(comProducer);
            if(result == 1){
                return ResultUtil.createBySuccessMessage("添加生产商成功");
            }
            return ResultUtil.createByErrorMessage("添加生产商失败");
        } else {
            int result = comProducerMapper.updateByPrimaryKey(comProducer);
            if(result == 1){
                return ResultUtil.createBySuccessMessage("修改生产商成功");
            }
            return ResultUtil.createByErrorMessage("修改生产商失败");
        }
    }

    @Override
    public ResultVo<String> deleteProducer(String id) {
        int result = comProducerMapper.deleteById(id);
        if(result == 1){
            return ResultUtil.createBySuccessMessage("删除生产商成功");
        }
        return ResultUtil.createByErrorMessage("删除生产商失败");
    }

    @Override
    public ResultVo<PageInfo<ComSupplier>> getPageSupplier(Integer pageNum, Integer pageSize, String name) {

        if(!name.equals("%"))
            name = "%"+name+"%";

        PageHelper.startPage(pageNum,pageSize);
        List<ComSupplier> comSupplierList = comSupplierMapper.getSupplierByName(name);

        PageInfo<ComSupplier> pageInfo = new PageInfo<>(comSupplierList);
        return ResultUtil.createBySuccess(pageInfo);
    }

    @Override
    public ResultVo<String> addSupplier(ComSupplier comSupplier) {

        comSupplier.setStatus(Const.COM_STATUS.ONLINE);
        if(comSupplier.getId() == null) {
            int result = comSupplierMapper.insert(comSupplier);
            if(result == 1){
                return ResultUtil.createBySuccessMessage("添加供应商成功");
            }
            return ResultUtil.createBySuccessMessage("添加供应商失败");
        } else {
            int result = comSupplierMapper.updateByPrimaryKey(comSupplier);
            if(result == 1){
                return ResultUtil.createBySuccessMessage("修改供应商成功");
            }
            return ResultUtil.createBySuccessMessage("修改供应商失败");
        }
    }

    @Override
    public ResultVo<String> deleteSupplier(String id) {
        int result = comSupplierMapper.deleteById(id);
        if(result == 1){
            return ResultUtil.createBySuccessMessage("删除维修商成功");
        }
        return ResultUtil.createByErrorMessage("删除维修商失败");
    }
}
