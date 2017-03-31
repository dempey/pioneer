package com.github.dempey.pioneer.controller;

import com.github.dempey.pioneer.entity.Record;
import com.github.dempey.pioneer.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/app")
public class HomeController {

    private RecordRepository repository;

    @Autowired
    public HomeController(RecordRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap model) {
        List<Record> records = repository.findAll();
        model.addAttribute("records", records);
        model.addAttribute("insertRecord", new Record());
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String insertData(ModelMap model, @ModelAttribute("insertRecord") @Valid Record record, BindingResult result) {
        if(!result.hasErrors()) {
            repository.save(record);
        }
        return home(model);
    }

}
