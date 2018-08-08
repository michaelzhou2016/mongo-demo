package com.mongo.mongo4.converter;

import org.bson.types.Decimal128;
import org.springframework.core.convert.converter.Converter;

import java.math.BigDecimal;

/**
 * @Author zhouliliang
 * @Description:
 * @Date: Created in 2018/8/1 10:19
 */
public class Decimal128ToBigDecimalConverter implements Converter<Decimal128, BigDecimal> {
    public BigDecimal convert(Decimal128 decimal128) {
        return decimal128.bigDecimalValue();
    }
}