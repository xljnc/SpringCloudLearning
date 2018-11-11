package com.wt.spring.provider.dto.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Xljnc
 * @date 2018/11/11 16:17
 * @description
 */
@Data
public class InstanceInfoDto implements Serializable {
    private static final long serialVersionUID = 3587401600636517573L;
    private Integer field1;
    private String field2;
}
