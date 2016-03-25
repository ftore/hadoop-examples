package com.akmal.hadoop.mr.configuration;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.apache.hadoop.conf.Configuration;
import org.junit.Test;

public class ConfigurationTest {

	@Test
	public void oneConfigFileTest() {
		Configuration conf = new Configuration();
		conf.addResource("configuration1.xml");
		assertThat(conf.get("color"), is("yellow"));
		assertThat(conf.getInt("size", 0), is(10));
	}
	
	@Test
	public void twoConfigFileTest() {
		Configuration conf = new Configuration();
		conf.addResource("configuration1.xml");
		conf.addResource("configuration2.xml");
		assertThat(conf.getInt("size", 0), is(25));
		//assertThat(conf.get("color"), is("yellow"));
		assertThat(conf.get("color"), is("red"));
		assertThat(conf.get("weight"), is("heavy"));
		assertThat(conf.get("size-weight"), is("25, heavy"));
	}

}
