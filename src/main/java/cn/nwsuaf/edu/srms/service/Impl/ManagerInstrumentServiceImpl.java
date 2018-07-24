package cn.nwsuaf.edu.srms.service.Impl;

import cn.nwsuaf.edu.srms.dao.ProInstrumentMapper;
import cn.nwsuaf.edu.srms.entity.ProInstrument;
import cn.nwsuaf.edu.srms.service.ManagerInstrumentService;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.InstrumentVo;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 17:13
 */
@Service
public class ManagerInstrumentServiceImpl implements ManagerInstrumentService {

    @Autowired
    private ProInstrumentMapper proInstrumentMapper;

    @Override
    public ResultVo<List<InstrumentVo>> getInstrumentByPlat(Integer platId) {

        List<InstrumentVo> proInstrumentList = proInstrumentMapper.getInstrumentByPlat(platId);
        return ResultUtil.createBySuccess(proInstrumentList);
    }

    @Override
    public ResultVo<String> addInstrument(ProInstrument proInstrument) {

        int result = proInstrumentMapper.insertSelective(proInstrument);

        if(result == 1){
            return ResultUtil.createBySuccessMessage("添加仪器成功");
        }
        return ResultUtil.createBySuccessMessage("添加仪器失败");
    }
}
