package cn.nwsuaf.edu.srms.service.Impl;

import cn.nwsuaf.edu.srms.dao.PlatformMapper;
import cn.nwsuaf.edu.srms.dao.UserMapper;
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
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultVo<List<Platform>> getPlatByManager(String userId) {

        List<Platform> platformList = null;

        if(userMapper.selectByPrimaryKey(Integer.valueOf(userId)).getType() == 1)
            platformList = platformMapper.getAll();
        else
            platformList = platformMapper.selectByManager(userId);

        platformList.add(0,new Platform(0,"全部"));

        return ResultUtil.createBySuccess(platformList);
    }
}
