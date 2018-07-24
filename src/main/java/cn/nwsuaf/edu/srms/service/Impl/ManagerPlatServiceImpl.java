package cn.nwsuaf.edu.srms.service.Impl;

import cn.nwsuaf.edu.srms.dao.PlatformMapper;
import cn.nwsuaf.edu.srms.entity.Platform;
import cn.nwsuaf.edu.srms.service.ManagerPlatService;
import cn.nwsuaf.edu.srms.util.ResultUtil;
import cn.nwsuaf.edu.srms.vo.ResultVo;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/24
 * Time: 16:15
 */
@Service
public class ManagerPlatServiceImpl implements ManagerPlatService {

    @Autowired
    private PlatformMapper platformMapper;

    @Override
    public ResultVo<List<Platform>> getPlatByManager(String userId) {

        List<Platform> platformList = platformMapper.selectByManager(userId);
        return ResultUtil.createBySuccess(platformList);
    }
}
