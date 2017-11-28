package com.barclays.fraud.freature.schedule;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class MainApp {
    public static void main(String[] args) {
        //SparkJobScheduler scheduler = new SparkJobScheduler(10);

        SparkConf conf = new SparkConf().setAppName("Word Count");

        if (args.length > 0) {
            System.out.println("****** Set master to " + args[0]);
            conf.setMaster(args[0]);
        }

        JavaSparkContext sc = new JavaSparkContext(conf);

        /*int count = 0;
        while(count++ < 10) {
            scheduler.schedule(() -> {
          */

        System.out.println("<<<<< Hello World! >>>>>");

      /*          return null;
            }, 1000);
        }*/

        sc.stop();
    }
}
