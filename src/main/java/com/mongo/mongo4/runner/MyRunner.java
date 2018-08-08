package com.mongo.mongo4.runner;

import com.mongo.mongo4.common.SumGroup;
import com.mongo.mongo4.entity.Between;
import com.mongo.mongo4.repository.BetweenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * @Author zhouliliang
 * @Description:
 * @Date: Created in 2018/7/11 17:46
 */
@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private BetweenRepository betweenRepository;

    @Override
    public void run(String... args) {

        mongoTemplate.dropCollection(Between.class);
        List<Between> betweenList = Arrays.asList(new Between("1", "2018-01", new BigDecimal(12.13)),
                new Between("2", "2018-01", new BigDecimal(12.24)),
                new Between("3", "2018-02", new BigDecimal(12.35)),
                new Between("4", "2018-03", new BigDecimal(12.43)),
                new Between("5", "2018-03", new BigDecimal(12.56)));
//        mongoTemplate.insert(betweens, Between.class);
        betweenRepository.saveAll(betweenList);

        betweenRepository.findAll().forEach(System.out::println);

        System.out.println("使用mongoTemplate查询");
        mongoTemplate.find(new Query(Criteria.where("billMonth").gte("2018-02").lte("2018-03")), Between.class)
                .forEach(System.out::println);

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.group("billMonth").sum("amount").as("total"));
        AggregationResults<SumGroup> aggRes = mongoTemplate.aggregate(aggregation, "between", SumGroup.class);
        System.out.println(aggRes.getMappedResults());
    }

}
