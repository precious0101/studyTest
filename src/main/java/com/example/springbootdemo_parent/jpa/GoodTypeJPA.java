package com.example.springbootdemo_parent.jpa;

import com.example.springbootdemo_parent.bean.GoodTypeBean;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ========================
 * Created with IntelliJ IDEA.
 * User：Jillian Zhu
 * Date：2023-1-17 23:18:40
 * Time：11:24
 * 码云：http://git.oschina.net/jnyqy
 * ========================
 */
public interface GoodTypeJPA extends JpaRepository<GoodTypeBean,Long> {
}
