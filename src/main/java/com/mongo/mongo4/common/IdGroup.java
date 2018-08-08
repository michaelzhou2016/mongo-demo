package com.mongo.mongo4.common;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author zhouliliang
 * @Description:
 * @Date: Created in 2018/7/30 9:57
 */
@Getter
@Setter
public class IdGroup implements Serializable {
    private static final long serialVersionUID = -2676118587606366168L;
    private String _id;
}
