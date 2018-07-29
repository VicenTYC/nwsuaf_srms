package cn.nwsuaf.edu.srms.common;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/23
 * Time: 18:00
 */
public class Const {

    public static final String CURRENT_USER = "currentUser";

    public interface LOGIN{
        String SUCCESS = "登录成功";
        String ERROR = "用户名或密码错误";
    }

    public interface UPDATEPASSWORD{
        String SUCCESS = "密码修改成功";
        String ERROR = "原密码错误";
    }

    public interface LOGINOUT{
        String SUCCESS = "登出成功";
    }

    public interface REGTSTER{
        Integer SAVE = 0;
        Integer COMMIT = 1;
        Integer UNPASS = 2;
        Integer PASS = 3;
    }

    public interface TYPE{

        String PARTS = "配件";
        String REAGENT = "试剂";
        String MATERIAL = "耗材";
        String MAINTAIN = "维修";

    }

    public interface CURD{
        String GETSUCCESS = "查询成功";
        String GETERROR = "查询失败";

        String CREATESUCCESS = "增加成功";
        String CREATEERROR = "增加失败";
        String DELETESUCCESS = "删除成功";
        String DELETEERROR = "删除失败";
        String UPDATESUCCESS = "修改成功";
        String UPDATEERROR = "修改失败";

        String COMMITSUCCESS = "提交成功";
        String COMMITEERROR = "提交失败";

        String SAVESUCCESS = "保存成功";
    }

}
