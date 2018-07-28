package cn.nwsuaf.edu.srms.util;

import cn.nwsuaf.edu.srms.common.Const;
import cn.nwsuaf.edu.srms.vo.RegisterVo;

import java.util.List;
import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/26
 * Time: 21:55
 */
public class RegisterVoUtil {

    public static void setString(List<RegisterVo> registerVoList){
        for(RegisterVo registerVo: registerVoList){
            if(Objects.equals(registerVo.getStatus(), Const.REGTSTER.SAVE)){
                registerVo.setStatusString("已保存");
            } else if(Objects.equals(registerVo.getStatus(), Const.REGTSTER.COMMIT)){
                registerVo.setStatusString("未审核");
            } if(Objects.equals(registerVo.getStatus(), Const.REGTSTER.PASS)){
                registerVo.setStatusString("已通过");
            } if(Objects.equals(registerVo.getStatus(), Const.REGTSTER.UNPASS)){
                registerVo.setStatusString("未通过");
            }
        }
    }

}
