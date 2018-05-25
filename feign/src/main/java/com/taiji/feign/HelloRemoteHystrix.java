package com.taiji.feign;

import org.springframework.stereotype.Component;

/**
 * @author 潘宏智
 * @date
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(String name) {
        return "hello World!";
    }
}
