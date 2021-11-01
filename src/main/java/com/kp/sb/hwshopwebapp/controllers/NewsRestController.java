package com.kp.sb.hwshopwebapp.controllers;

import com.kp.sb.hwshopwebapp.models.News;
import com.kp.sb.hwshopwebapp.service.NewsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/news")
public class NewsRestController {

    private final NewsService newsService;

    public NewsRestController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public List<News> getAllNews(){
        return newsService.getAllNews();
    }
}
