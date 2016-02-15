package org.testobject.fastbill.service;

import java.util.List;

import org.testobject.fastbill.domain.Article;
import org.testobject.fastbill.domain.ArticleFilter;
import org.testobject.fastbill.service.ServiceBuilder.Factory;

public class ArticleService {

    private final Factory factory;

    public ArticleService(final ServiceBuilder.Factory factory) {
        this.factory = factory;
    }

    public List<Article> get(final ArticleFilter filter) throws FastbillErrorResponse {
        return this.factory.create("article.get").withFilter(filter).execute(ArticlesWrapper.class).getArticles();
    }

    public static final class ArticlesWrapper {
        private List<Article> articles;

        public ArticlesWrapper() {
        }

        public List<Article> getArticles() {
            return this.articles;
        }

        public void setArticles(final List<Article> articles) {
            this.articles = articles;
        }
    }
}
