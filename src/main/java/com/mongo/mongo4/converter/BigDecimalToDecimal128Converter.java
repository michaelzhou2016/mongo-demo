package com.mongo.mongo4.converter;

import org.bson.types.Decimal128;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author zhouliliang
 * @Description:
 * @Date: Created in 2018/8/1 10:18
 */
@ReadingConverter
@WritingConverter
public class BigDecimalToDecimal128Converter implements Converter<BigDecimal, Decimal128> {
    public Decimal128 convert(BigDecimal bigDecimal) {
        return new Decimal128(bigDecimal.setScale(2, RoundingMode.HALF_UP));
    }
}
