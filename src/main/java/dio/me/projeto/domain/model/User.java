package dio.me.projeto.domain.model;

import java.util.List;

import jakarta.persistence.Entity;

@Entity(name = "tb_user")
public class User {
    private long id;
    private String same;
    private Account account;
    private Card card;
    private List<Feature> features;
    private List<News> news;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getSame() {
        return same;
    }
    public void setSame(String same) {
        this.same = same;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    public List<Feature> getFeatures() {
        return features;
    }
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
    public List<News> getNews() {
        return news;
    }
    public void setNews(List<News> news) {
        this.news = news;
    }
}
