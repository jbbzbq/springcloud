package com.jbb.qa.client;

import com.jbb.qa.client.factory.LabelFallbackFactory;
import entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 标签对外服务
 *
 * @author jbb
 * @date 2019/3/23
 */
@FeignClient(name = "cloud-base", fallback = LabelFallbackFactory.class)
public interface LableClient {
    /**
     * 根据标签ID返回标签信息
     *
     * @param id 标签ID
     * @return entity.Result
     */
    @GetMapping("/label/{id}")
    public Result findById(@PathVariable String id);
}
