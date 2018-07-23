package cn.nwsuaf.edu.srms.util;

import cn.nwsuaf.edu.srms.common.ResponseCode;
import cn.nwsuaf.edu.srms.vo.ResultVO;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/22
 * Time: 16:19
 */
public class ResultUtil {
    public static <T> ResultVO<T> createBySuccess(){
        return new ResultVO<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ResultVO<T> createBySuccessMessage(String msg){
        return new ResultVO<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    public static <T> ResultVO<T> createBySuccess(T data){
        return new ResultVO<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    public static <T> ResultVO<T> createBySuccess(String msg, T data){
        return new ResultVO<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }


    public static <T> ResultVO<T> createByError(){
        return new ResultVO<T>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getDesc());
    }


    public static <T> ResultVO<T> createByErrorMessage(String errorMessage){
        return new ResultVO<T>(ResponseCode.ERROR.getCode(),errorMessage);
    }

    public static <T> ResultVO<T> createByErrorCodeMessage(int errorCode, String errorMessage){
        return new ResultVO<T>(errorCode,errorMessage);
    }


    public static void main(String[] args) {
        ResultVO<String> test = createByErrorMessage("1111");
        System.out.println(test.toString());
    }
}
