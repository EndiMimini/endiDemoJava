package com.betaplan.angela.endidemo.controllers;

import com.betaplan.angela.endidemo.models.Art;
import com.betaplan.angela.endidemo.services.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class NftArtController {

    //inject services into the controller by creating an object so that all the methos can be used from the artservice
    @Autowired
    private ArtService artService;

    @GetMapping("/")
    public String index(Model artModel) {
        List<Art> arts=artService.getAllArts();
        artModel.addAttribute("allArts", arts);
        return "index";
    }
}
