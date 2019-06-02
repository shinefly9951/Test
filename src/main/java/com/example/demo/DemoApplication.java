package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 搭建基本环境
 * 1.导入数据库文件 创建department和employee
 * 2.创建javabean封装数据
 * 3.整合mybatis操作数据
 *      1.配置数据源
 *      2.使用注解版的mybatis：
 *      	1)@MapperScan指定需要扫描的mapper接口所在的包
 *
 */
@MapperScan("com.example.demo.mapper")
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
