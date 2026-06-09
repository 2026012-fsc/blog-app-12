package com.example.blog_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService){
        this.blogService = blogService;
    }

    @GetMapping("/blog")
    public String blog(Model model) {
        model.addAttribute("Blogs", blogService.findAll());
        return "blog";
    }

    @GetMapping("/blog/new")
    public String newbolg() {
        return "blognew";
    }

    @GetMapping("/blog/{id}/colam")
    public String colam(Model model) {
        return new String();
    }
    
    
    
}
