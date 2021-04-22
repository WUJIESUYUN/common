package com.wj.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: research-assistant
 *
 * @description: 分页拦截器
 *
 * @author: UNARAS.LIU
 *
 * @create: 2020-09-26 16:53
 *
 **/
@Configuration
@MapperScan(basePackages = {"com.wj.common.**.mapper"})
@ConditionalOnClass(value = {PaginationInterceptor.class})
public class MybatisConfig {

    /**
     * mybatis-plus分页插件
     *
     * @author
     * @date
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }


}
