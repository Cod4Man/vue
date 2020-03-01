package com.codeman.vuedemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {


    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }

    /**
     * 后台监控配置: 之前应该是配置在web.xml文件中，现在直接用java代替
     * @return
     */
    @Bean
    public ServletRegistrationBean druidServletRegister() {
        // 请求路径
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        // 配置一些自定义参数
        Map<String, String> stringMap = new HashMap<>();
        // 账号密码
        stringMap.put("loginUsername","root");
        stringMap.put("loginPassword", "zhj123");
        // 白名单
        stringMap.put("allow","");
        // 黑名单
        stringMap.put("zhangsan", "192.168.2.2");
        bean.setInitParameters(stringMap);
        return bean;
    }
}
