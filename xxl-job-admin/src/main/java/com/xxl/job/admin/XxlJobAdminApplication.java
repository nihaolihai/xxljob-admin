package com.xxl.job.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuxueli 2018-10-28 00:38:13
 * 打包命令：mvn clean -U package -Dmaven.test.skip=true
 * cd xxl-job-admin
 * cd target
 * java -jar xxl-job-admin-2.3.0-SNAPSHOT.jar
 */
@SpringBootApplication
public class XxlJobAdminApplication {

	public static void main(String[] args) {
        SpringApplication.run(XxlJobAdminApplication.class, args);
	}

}