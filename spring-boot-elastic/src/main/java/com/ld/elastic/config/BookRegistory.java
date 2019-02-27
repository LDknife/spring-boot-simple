package com.ld.elastic.config;

import com.ld.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author:ld
 * @create:2018-11-14 11:20
 * @description:
 */
public interface BookRegistory extends ElasticsearchRepository<Book,Integer> {

}
