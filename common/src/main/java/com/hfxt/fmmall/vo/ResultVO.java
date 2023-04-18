package com.hfxt.fmmall.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVO<T> implements Serializable {

    private Integer code; //编码：200成功，201和其它数字为失败

    private String msg; //错误信息

    private T data; //数据

    private Map map = new HashMap(); //动态数据

    public static <T> ResultVO<T> success(T object) {
        ResultVO<T> r = new ResultVO<T>();
        r.data = object;
        r.code = 200;
        return r;
    }

    public static <T> ResultVO<T> error(String msg) {
        ResultVO r = new ResultVO();
        r.msg = msg;
        r.code = 201;
        return r;
    }

    public ResultVO<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }
}
