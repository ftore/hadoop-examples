package com.akmal.hadoop.mr.configuration;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;

public class ConfigurationPrinter extends Configured implements Tool {

	static {
		Configuration.addDefaultResource("");
		Configuration.addDefaultResource("");
		Configuration.addDefaultResource("");
		Configuration.addDefaultResource("");
		Configuration.addDefaultResource("");
		Configuration.addDefaultResource("");
	}
	
	public int run(String[] arg0) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
