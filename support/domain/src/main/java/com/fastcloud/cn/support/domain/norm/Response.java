package com.fastcloud.cn.support.domain.norm;

import lombok.Data;

/**
 * REST 返回的统一封装类
 *
 * @author OreChou
 * @create 2018-06-10 5:29 PM
 */
@Data
public class Response {

    private Integer code;

    private Object content;

    private String message;

    private String url;

    public static Response ok(Object content) {
        return new Response(ResponseStatus.OK, null, content);
    }

    public static Response ok(Object content, String message) {
        return new Response(ResponseStatus.OK, message, content);
    }

    public static Response fail(String message) {
        return new Response(ResponseStatus.FAIL, message, null);
    }

    public static Response error(String message) {
        return new Response(ResponseStatus.ERROR, message, null);
    }

    private Response(ResponseStatus status, String message, Object content) {
        this(status, message, content, null);
    }

    private Response(ResponseStatus status, String message, Object content, String url) {
        this.code = status.code;
        this.message = status.desc;
        this.content = content;
        this.url = url;
        if (message != null) {
            this.message = message;
        }
    }

    private enum ResponseStatus {

        OK(200, "请求成功"),

        FAIL(201, "操作失败"),

        ERROR(500, "服务器错误");

        private final Integer code;

        private final String desc;

        ResponseStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

    }

}
