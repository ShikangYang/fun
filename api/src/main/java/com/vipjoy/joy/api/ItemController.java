package com.vipjoy.joy.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ItemController {

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public String findOneCity(Model model, @PathVariable("id") Long id) {
        //  model.addAttribute("city", cityService.findCityById(id));
        return "city";
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public String findAllCity(Model model) {

        return "cityList";
    }


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "oh/index";
    }

    @RequestMapping(value = "/item", method = RequestMethod.GET)
    public String item(Model model) {
        return "item";
    }
    @RequestMapping(value = "itemDetails", method = RequestMethod.GET)
    public String itemDetails(Model model) {
        return "item_details";
    }
}