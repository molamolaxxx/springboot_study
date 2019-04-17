package com.mola.event;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件类
 */
public class MyEvent extends ApplicationEvent{

    private String msg;

    public MyEvent(Object source,String msg){
        super(source);
        this.msg=msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
