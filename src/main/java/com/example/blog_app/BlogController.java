package com.example.blog_app;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



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
    public String colam(@PathVariable Long id, Model model) {
        Optional<Blog> blogOpt = blogService.findById(id);
        if (blogOpt.isEmpty()) {
            return "redirect:/blog";
        }
        model.addAttribute(blogOpt.get());
        return "detail";
    }
    
    @PostMapping("/blog/new")
    public String blognew(BlogForm blogForm) {
        blogService.save(blogForm);
        return "redirect:/blog";
    }
    
    @PostMapping("/blog/{id}/delete")
    public String delete(@PathVariable Long id) {
        //TODO: process POST request
        blogService.delete(id);
        return "redirect:/blog";
    }
    
    
}
