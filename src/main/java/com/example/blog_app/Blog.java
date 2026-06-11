package com.example.blog_app;

public class Blog {
    private Long id;
    private String title;
    private String summary;
    private String maintext;

    public Blog(Long id,String title, String summary, String maintext){
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.maintext = maintext;
    }

    //getter
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getSummary() {
        return summary;
    }
    public String getMaintext() {
        return maintext;
    }

    //setter
    public void setId(Long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public void setMaintext(String maintext) {
        this.maintext = maintext;
    }
}
