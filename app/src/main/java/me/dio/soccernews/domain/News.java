package me.dio.soccernews.domain;

public class News {
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public News(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


