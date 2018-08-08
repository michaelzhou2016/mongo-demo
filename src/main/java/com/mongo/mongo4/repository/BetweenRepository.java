package com.mongo.mongo4.repository;

import com.mongo.mongo4.entity.Between;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author zhouliliang
 * @Description:
 * @Date: Created in 2018/8/1 10:11
 */
public interface BetweenRepository extends MongoRepository<Between, String> {
}
