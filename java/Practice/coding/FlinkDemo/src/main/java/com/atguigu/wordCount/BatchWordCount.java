package com.atguigu.wordCount;

import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.AggregateOperator;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.operators.FlatMapOperator;
import org.apache.flink.api.java.operators.UnsortedGrouping;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

/**
 * @author: cgr
 * @date: 2022/10/15 - 11:06
 */
public class BatchWordCount {
    public static void main(String[] args) throws Exception {
        // 创建环境
        ExecutionEnvironment environment = ExecutionEnvironment.getExecutionEnvironment();

        //读取文件
        DataSource<String> source = environment.readTextFile("input/test.txt");

        //
        FlatMapOperator<String, Tuple2<String, Long>> wordAndOne = source.flatMap((String line, Collector<Tuple2<String, Long>> out) -> {
            String[] words = line.split(" ");
            for (String word : words) {
                out.collect(Tuple2.of(word, 1L));
            }
        }).returns(Types.TUPLE(Types.STRING, Types.LONG));

        UnsortedGrouping<Tuple2<String, Long>> tuple2UnsortedGrouping = wordAndOne.groupBy(0);

        AggregateOperator<Tuple2<String, Long>> sum = tuple2UnsortedGrouping.sum(1);

        sum.print();
    }
}
