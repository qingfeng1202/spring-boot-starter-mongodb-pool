package com.mongodb.config;

import lombok.Data;

@Data
public class MongoPoolProperties {
	private String mongoTemplateName = "mongoTemplate";
	
	private String gridFsTemplateName = "gridFsTemplate";
	
	private String applicationName;
	
	// 集群模式，多个数据库地址，和host,port二选一。格式为：192.168.1.1:8212,192.168.1.2:8213
	private String uri;
	
	/**
	 * 存储时是否保存_class
	 */
	private boolean showClass = true;
	private String host;
	private Integer port = 27017;
	private String database;
	private String authenticationDatabase;
	private String gridFsDatabase;
	private String username;
	private char[] password;

    private int minConnectionsPerHost;
    private int maxConnectionsPerHost = 100;
    private int threadsAllowedToBlockForConnectionMultiplier = 5;
    private int serverSelectionTimeout = 1000 * 30;
    private int maxWaitTime = 1000 * 60 * 2;
    private int maxConnectionIdleTime;
    private int maxConnectionLifeTime;
    private int connectTimeout = 1000 * 10;
    private int socketTimeout = 0;
    private boolean socketKeepAlive = false;
    private boolean sslEnabled = false;
    private boolean sslInvalidHostNameAllowed = false;
    private boolean alwaysUseMBeans = false;

    private int heartbeatFrequency = 10000;
    private int minHeartbeatFrequency = 500;
    private int heartbeatConnectTimeout = 20000;
    private int heartbeatSocketTimeout = 20000;
    private int localThreshold = 15;
}
