package com.example.blog_app;

public class BlogForm {
    private String title;
    private String maintext;

    public BlogForm(String title, String maintext){
        this.title = title;
        this.maintext = maintext;
    }

    public String getTitle() {
        return title;
    }
    public String getMaintext() {
        return maintext;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setMaintext(String maintext) {
        this.maintext = maintext;
    }
}
