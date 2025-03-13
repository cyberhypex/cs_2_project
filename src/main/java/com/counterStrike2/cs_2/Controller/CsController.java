package com.counterStrike2.cs_2.Controller;

import com.counterStrike2.cs_2.Services.CsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cs")
public class CsController {
    @Autowired
    private CsService csService;


    @GetMapping("/allSkins")
    public String getAllSkins(){
        return csService.callCsApi("/skins.json");
    }

    @GetMapping("/skinsNotGrouped")
    public String getAllSkinsNotGrouped(){
        return csService.callCsApi("/skins_not_grouped.json");
    }

    @GetMapping("/stickers")
    public String getStickers(){
        return csService.callCsApi("/stickers.json");
    }

    @GetMapping("/collections")
    public String getCollections(){
        return csService.callCsApi("/collections.json");
    }

    @GetMapping("/getCrates")
    public String getCrates(){
        return csService.callCsApi("/crates.json");
    }

    @GetMapping("/keys")
    public String getKeys(){
        return csService.callCsApi("/keys.json");
    }

    @GetMapping("/collectibles")
    public String getCollectibles(){
        return csService.callCsApi("/collectibles.json");
    }

    @GetMapping("/getAgents")
    public String getAgents(){
        return csService.callCsApi("/agents.json");
    }

    @GetMapping("/getGraffiti")
    public String getGraffiti(){
        return csService.callCsApi("/graffiti.json");
    }

    @GetMapping("getMusicKits")
    public String getMusicKit(){
        return csService.callCsApi("/music_kits.json");
    }
}
