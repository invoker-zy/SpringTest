package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//JavaConfig,相当于xml配置文件
@ComponentScan//默认扫描与配置类相同的包，即此类的同包下的带有@Component注解的类，自定义包使用@ComponentScan(basePackages={"com.qhf.soundsystem","xxx"})
public class CDPlayerConfig {
	
}
