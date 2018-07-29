package cn.nwsuaf.edu.srms.service.Impl;

import cn.nwsuaf.edu.srms.dao.ProInstrumentMapper;
import cn.nwsuaf.edu.srms.entity.ProInstrument;
import cn.nwsuaf.edu.srms.service.ManagerInstrumentService;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.InstrumentVo;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public ResultVo<String> addInstrument(ProInstrument proInstrument, Integer userId) {

        proInstrument.setUserId(userId);
        int result = proInstrumentMapper.insertSelective(proInstrument);

        if(result == 1){
            return ResultUtil.createBySuccessMessage("添加仪器成功");
        }
        return ResultUtil.createBySuccessMessage("添加仪器失败");
    }

    @Override
    public ResultVo<PageInfo<InstrumentVo>> getPageInstrumentByPlat(Integer platId, Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        List<InstrumentVo> proInstrumentList = proInstrumentMapper.getInstrumentByPlat(platId);

        PageInfo<InstrumentVo> pageInfo = new PageInfo<>(proInstrumentList);

        return ResultUtil.createBySuccess(pageInfo);
    }
}
