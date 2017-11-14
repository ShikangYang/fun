package com.vipjoy.joy.config;

import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class DataSourceConfig {

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Value("${db.url.master}")
    private String master;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.auto-commit}")
    private boolean autoCommit;

    @Value("${spring.datasource.connection-test-query}")
    private String connectionTestQuery;

    @Value("${spring.datasource.maximum-pool-size}")
    private int maximumPoolSize;

    @Value("${spring.datasource.maxLifetime}")
    private Integer maxLifeTime;

    @Value("${spring.datasource.connectionTimeout}")
    private Integer connectionTimeout;

    @Bean
    public DataSource getDataSource() {
        org.apache.tomcat.jdbc.pool.DataSource ds = new org.apache.tomcat.jdbc.pool.DataSource();
        ds.setPoolProperties(poolProperties(master, username, password));
        return ds;
    }

    private PoolProperties poolProperties(String masterReadOnly, String usernameReadOnly, String passwordReadOnly) {
        PoolProperties p = new PoolProperties();
        p.setDriverClassName(driverClassName);
        p.setUrl(masterReadOnly);
        p.setUsername(usernameReadOnly);
        p.setPassword(passwordReadOnly);
        p.setJmxEnabled(true);//是否利用 JMX 注册连接池
        p.setTestWhileIdle(false);//是否通过空闲对象清除者（如果存在的话）验证对象
        p.setTestOnBorrow(true);//从池中借出对象之前，是否对其进行验证
        p.setValidationQuery(connectionTestQuery);//在将池中连接返回给调用者之前，用于验证这些连接的 SQL 查询
        p.setTestOnReturn(false);//将对象返回池之前，是否对齐进行验证
        p.setMaxActive(maximumPoolSize);//最大链接数
        p.setMaxWait(connectionTimeout);//在抛出异常之前，连接池等待（没有可用连接时）返回连接的最长时间
        p.setRemoveAbandonedTimeout(60);//移除坏链接超时时间
        p.setRemoveAbandoned(true);//表示如果连接时间超出了 removeAbandonedTimeout，则将清除废弃连接
        p.setLogAbandoned(true);//标志能够针对丢弃连接的应用代码，进行堆栈跟踪记录
        p.setMaxAge(10 * 1000l);//链接最大 10秒
        p.setDefaultAutoCommit(autoCommit);
        return p;
    }


}
