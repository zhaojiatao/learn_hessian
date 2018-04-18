package com.zjt.learn.hession.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by zhaojiatao@souche.com on 2018/4/17
 */


@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User implements Serializable {
    String id;
    String name;
    String address;
    Integer age;
    Integer gender;
}
