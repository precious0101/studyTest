package com.example.springbootdemo_parent.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：Jillian Zhu
 * Date：2023-1-17 22:44:31
 * Time：11:17
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
@Entity
@Table(name = "good_types")
@Data
public class GoodTypeBean {
    @Id
    @Column(name = "tgt_id")
    private Long id;

    @Column(name = "tgt_name")
    private String name;
    @Column(name = "tgt_is_show")
    private int show;
    @Column(name = "tgt_order")
    private int order;

}
