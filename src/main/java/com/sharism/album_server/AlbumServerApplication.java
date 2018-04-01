package com.sharism.album_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@MapperScan("com.sharism.album_server.mapper")
@SpringBootApplication
public class AlbumServerApplication  extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AlbumServerApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(AlbumServerApplication.class, args);
	}
}
