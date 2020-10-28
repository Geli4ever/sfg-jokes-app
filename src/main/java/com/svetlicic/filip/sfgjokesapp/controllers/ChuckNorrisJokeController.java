package com.svetlicic.filip.sfgjokesapp.controllers;

import com.svetlicic.filip.sfgjokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisJokeController {

    private final JokeService jokeService;

    public ChuckNorrisJokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model){
        model.addAttribute("chuckNorris", jokeService.getQuote());

        return "chuckNorris/joke";
    }
}
