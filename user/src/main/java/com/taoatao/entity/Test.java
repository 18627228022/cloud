package com.taoatao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author taoatao
 * @since 2021-04-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String username;

    private String password;

    private String mobile;

    private String nickName;

    private String uid;

    private LocalDateTime createTime;

    private String salt;

    private Integer state;

    private Integer type;

    private String storeMarkCode;

    private String pwd;

    private String cityCode;

    private String provinceCode;

    private String remark;

    private String remark2;

    private String remark3;

    private String remark4;

    private String remark5;
    private String reason;
}
