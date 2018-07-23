package cn.nwsuaf.edu.srms.vo;

import cn.nwsuaf.edu.srms.common.ResponseCode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: ke li
 * Date: 2018/7/22
 * Time: 16:17
 */

//保证序列化json的时候,如果是null的对象,key也会消失
public class ResultVO<T> implements Serializable {

    private int status;
    private String msg;
    private T data;

    public ResultVO(int status){
        this.status = status;
    }
    public ResultVO(int status,T data){
        this.status = status;
        this.data = data;
    }

    public ResultVO(int status,String msg,T data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ResultVO(int status,String msg){
        this.status = status;
        this.msg = msg;
    }


    //使之不在json序列化结果当中
    @JsonIgnore
    public boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    public int getStatus(){
        return status;
    }
    public T getData(){
        return data;
    }
    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

}

