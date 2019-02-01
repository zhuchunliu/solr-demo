package com.solr.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zcl on 2019/1/31.
 */
@SpringBootApplication
@ComponentScan("com.solr")
public class SolrStart {
    public static void main(String[] args) {
        SpringApplication.run(SolrStart.class);
    }
}
