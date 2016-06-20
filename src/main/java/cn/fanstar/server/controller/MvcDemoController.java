package cn.fanstar.server.controller;

import cn.fanstar.server.facade.RemoteFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;


@Controller
public class MvcDemoController {

    @Autowired
    RemoteFacade remoteFacade;

    @RequestMapping(value="/index")
    public String index(Model model) {
        String result = remoteFacade.test();

        Map<String, String>  map = new HashMap<>();
        map.put("key","value");

        model.addAttribute("result", result);
        model.addAttribute("map", map);
        return "index";
    }

}
