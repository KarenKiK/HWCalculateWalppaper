package ru.itpark.calculateWalpaper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itpark.calculateWalpaper.service.CalculateWallpaperService;

@Controller
public class FrontpageController {
    private CalculateWallpaperService service;

    public FrontpageController(CalculateWallpaperService service) {this.service = service;}

    @RequestMapping
    public String index(Model model) {
        model.addAttribute("title", "Some value");
        return "frontpage";
    }

    @RequestMapping(params = {"isLong", "with", "height", "withWallpaperInM", "isLongWallpaperInM"})
    public String calculate(Model model,
                            @RequestParam int isLong,
                            @RequestParam int with,
                            @RequestParam int height,
                            @RequestParam double withWallpaperInM,
                            @RequestParam int isLongWallpaperInM
    ) {
        double rolls = service.calculate(isLong, with, height, withWallpaperInM, isLongWallpaperInM);
        model.addAttribute("result", rolls);
        return "frontpage";
    }
}
