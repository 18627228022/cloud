package com.taoatao.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisPlus分页插件
 * @author Admin
 *
 */
@Configuration
//@MapperScan("com.taoatao.mapper")
public class MybatisPlusConfig {

    //@Bean
    //public MybatisPlusInterceptor mybatisPlusInterceptor() {
    //    MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
    //    interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.H2));
    //    return interceptor;
    //}

    /**
     * 分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}