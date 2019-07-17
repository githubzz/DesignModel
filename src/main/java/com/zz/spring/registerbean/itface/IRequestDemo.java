package com.zz.spring.registerbean.itface;

import com.zz.spring.registerbean.annotation.HTTPMethod;
import com.zz.spring.registerbean.annotation.HTTPRequest;
import com.zz.spring.registerbean.annotation.HTTPUtil;
import com.zz.spring.registerbean.http.HttpResult;
import org.springframework.stereotype.Component;

/**
 * @author 李佳明
 * @date 2017.10.14
 */
@Component
@HTTPUtil
public interface IRequestDemo {

    @HTTPRequest(url = "http://abc.com")
    HttpResult<String> test1();

    @HTTPRequest(url = "http://test2.com", httpMethod = HTTPMethod.POST)
    HttpResult<String> test2();
}
