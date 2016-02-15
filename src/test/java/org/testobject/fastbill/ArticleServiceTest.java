package org.testobject.fastbill;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.testobject.fastbill.domain.Article;
import org.testobject.fastbill.domain.ArticleFilter;
import org.testobject.fastbill.service.ArticleService;
import org.testobject.fastbill.service.FastbillErrorResponse;

public class ArticleServiceTest {

    private final String USER = System.getenv("FASTBILL_USER");
    private final String TOKEN = System.getenv("FASTBILL_TOKEN");

    private ArticleService articleService;
    private Fastbill fastBill;

    @Before
    public void setUp() {
        this.fastBill = Fastbill.Factory.create(this.USER, this.TOKEN);
        this.articleService = this.fastBill.getArticleService();
    }

    @Test
    public void testGetAllArticles() throws FastbillErrorResponse {
        final List<Article> articles = this.articleService.get(new ArticleFilter());
        Assert.assertNotNull(articles);
        Assert.assertTrue(articles.size() > 0);
    }

}
