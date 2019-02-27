package com.ld.elastic;

import com.ld.elastic.bean.Article;
import com.ld.elastic.bean.Book;
import com.ld.elastic.config.BookRegistory;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootElasticApplicationTests {

    @Autowired
    JestClient jestClient;

    @Test
    public void contextLoads() {

        Article article = new Article();
        article.setId(1);
        article.setAuther("monkey");
        article.setTitle("我是一个好人");
        article.setContent("hello world");
        Index index = new Index.Builder(article).index("ld").type("articles").build();
        try {
            jestClient.execute(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1(){
        String query = "{\n" +
                "    \"query\": {\n" +
                "        \"match\" : {\n" +
                            "\"content\" : \"hello\"\n" +
                "        }\n" +
                "    }\n" +
                "}";

        Search search = new Search.Builder(query).addIndex("ld").addType("articles").build();
        try {
            SearchResult result = jestClient.execute(search);
            System.out.println(result.getJsonString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    BookRegistory bookRegistory;

    @Test
    public void test3(){
        Book book = new Book();
        book.setId(1);
        book.setName("活着");
        book.setAuthor("余华");
        bookRegistory.save(book);
    }

    public void test4(){
        Optional<Book> byId = bookRegistory.findById(1);
        Book book = byId.get();
        System.out.println(book);
    }

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;
    @Test
    public void test2(){
        IndexQuery build = new IndexQueryBuilder().withIndexName("ld").withType("articles").build();

        String index = elasticsearchTemplate.index(build);
    }

}
