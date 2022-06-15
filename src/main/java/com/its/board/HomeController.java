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

    @GetMapping("/Raúl")
    public String Raúl(){return  "soccer/Raúl González";}

    @GetMapping("/destpno")
    public String destpno(){return "soccer/destpno";}

    @GetMapping("/Butragueño")
    public String Butragueño(){return  "soccer/Butragueño";}

    @GetMapping("/Puskás")
    public String Puskás(){return  "soccer/Puskás";}

    @GetMapping("/Roberto")
    public String Roberto(){return "soccer/Roberto";}

    @GetMapping("/Casillas")
    public String Casillas(){return "soccer/Casillas";}

    @GetMapping("/Ramos")
    public String Ramos(){return "soccer/Ramos";}

    @GetMapping("/Ronaldo")
    public String Ronaldo(){return "soccer/Ronaldo";}
}
