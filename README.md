# HADOOP MapReduce example code

## Compiling and running

```
$ mvn compile
$ export HADOOP_CLASSPATH=target/classes/
$ hadoop com.akmal.hadoop.mr.driver.MaxTemperatureDriver -fs file:/// -jt local input/ncdc/micro output
```

PS. output directory should not be exist