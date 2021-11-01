package com.kp.sb.hwshopwebapp.service;

import java.util.ArrayList;
import java.util.List;

import com.kp.sb.hwshopwebapp.models.News;
import org.springframework.stereotype.Service;

@Service
public class NewsService {
    private static final List<News> news = new ArrayList();

    static{
        for(int i=0;i<10;i++){
            news.add(new News(i, "News " + i, "Desc"+i));
        }
    }

    public List<News> getAllNews(){
        return news;
    }
}
