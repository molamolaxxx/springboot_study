package com.mola.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 自定义监听器
 */
@Component
public class MyEventListener implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        String msg=myEvent.getMsg();

        System.out.println("监听器接收到了信息，内容为:"+msg);
    }
}
