package cn.nwsuaf.edu.srms.util;

import cn.nwsuaf.edu.srms.common.ResponseCode;
import cn.nwsuaf.edu.srms.vo.ResultVo;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/22
 * Time: 16:19
 */
public class ResultUtil {
    public static <T> ResultVo<T> createBySuccess(){
        return new ResultVo<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ResultVo<T> createBySuccessMessage(String msg){
        return new ResultVo<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    public static <T> ResultVo<T> createBySuccess(T data){
        return new ResultVo<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    public static <T> ResultVo<T> createBySuccess(String msg, T data){
        return new ResultVo<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }


    public static <T> ResultVo<T> createByError(){
        return new ResultVo<T>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
    }


    public static <T> ResultVo<T> createByErrorMessage(String errorMessage){
        return new ResultVo<T>(ResponseCode.ERROR.getCode(),errorMessage);
    }

    public static <T> ResultVo<T> createByErrorCodeMessage(int errorCode, String errorMessage){
        return new ResultVo<T>(errorCode,errorMessage);
    }


    public static void main(String[] args) {
        ResultVo<String> test = createByErrorMessage("1111");
        System.out.println(test.toString());
    }
}
