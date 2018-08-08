package com.mongo.mongo4.common;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.Decimal128;

import java.io.Serializable;

/**
 * @Author zhouliliang
 * @Description:
 * @Date: Created in 2018/7/30 9:57
 */
@Getter
@Setter
@ToString
public class SumGroup implements Serializable {
    private String _id;
    private Decimal128 total;
}
