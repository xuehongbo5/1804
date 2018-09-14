package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
@EnableEurekaClient  //zuul服务要注册到Eureka上
public class ZuulAppRun {

	public static void main(String[] args) {
		
		SpringApplication.run(ZuulAppRun.class, args);

	}

}
