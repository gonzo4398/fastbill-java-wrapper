package org.testobject.fastbill.domain;

public class ArticleFilter {

    private String articleNumber; // Artikelnummer
    private String tags; //    Artikel Tags 

    public String getArticleNumber() {
        return this.articleNumber;
    }

    public void setArticleNumber(final String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public String getTags() {
        return this.tags;
    }

    public void setTags(final String tags) {
        this.tags = tags;
    }
}
