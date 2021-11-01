package com.kp.sb.hwshopwebapp.controllers;

import java.util.ArrayList;
import java.util.List;

import com.kp.sb.hwshopwebapp.models.News;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/news")
public class NewsController {
    private static final List<News> news = new ArrayList<>();
    static {
        for(int i=0;i<10;i++){
            news.add(new News(i, "News Title"+i, "News Desc"+i));
        }
    }

    @GetMapping
    public String getAllNews(Model model){
        model.addAttribute("news", news);
        return "news";
    }
}
