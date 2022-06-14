package com.its.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){return "index";}

    @GetMapping("/home")
    public String home(){return "soccer/home";}

    @GetMapping("/Players")
    public String player(){return "soccer/player";}

    @GetMapping("/stadium")
    public String stadim() {return  "soccer/stadium";}

    @GetMapping("/shop")
    public String shop(){return "soccer/shop";}

    @GetMapping("/Gallery")
    public String Gallery(){return "soccer/Gallery";}
}
