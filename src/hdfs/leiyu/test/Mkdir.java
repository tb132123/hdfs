package hdfs.leiyu.test;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public 	class Mkdir {
	public static void main(String[] args) throws Exception {
		Configuration conf =new Configuration();
		conf.set("fs.defaultFS", "hdfs://master:9000/");
		conf.set("dfs.replication","2");
		FileSystem fs=FileSystem.get(conf);
		
		System.out.println(fs.mkdirs(new Path("/testdata")));
		fs.close();
	}
}
