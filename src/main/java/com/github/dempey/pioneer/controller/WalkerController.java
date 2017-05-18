package com.github.dempey.pioneer.controller;

import com.github.dempey.pioneer.model.Demographic;
import com.github.dempey.pioneer.service.WalkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/walker")
public class WalkerController {

    @Autowired
    WalkerService walkerService;

    @RequestMapping(path = "/routes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HashMap> getRoutes() {
        List<HashMap> junkData = new ArrayList<>();

        HashMap<String, String> firstJunk = new HashMap<>();
        firstJunk.put("name", "Henry Ford");
        firstJunk.put("age", "43");
        junkData.add(firstJunk);

        HashMap<String, String> secondJunk = new HashMap<>();
        secondJunk.put("name", "Jonathon Floyd");
        secondJunk.put("age", "35");
        junkData.add(secondJunk);

        return junkData;
    }

    @RequestMapping(path = "/account/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Demographic getAccountInfo(@PathVariable(value="id") Integer id) {
        Demographic accountInfo = walkerService.getAccountInfo(id);
        return accountInfo;
    }
}
