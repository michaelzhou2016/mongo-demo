package com.mongo.mongo4.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

/**
 * @Author zhouliliang
 * @Description:
 * @Date: Created in 2018/7/24 9:47
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "between")
public class Between {
    @Id
    private String id;
    private String billMonth;
    private BigDecimal amount;
}
