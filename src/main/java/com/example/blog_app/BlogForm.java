package com.example.blog_app;

public class BlogForm {
    private String title;
    private String maintext;
    private String summary;

    public BlogForm(String title, String summary, String maintext){
        this.title = title;
        this.summary = summary;
        this.maintext = maintext;
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
