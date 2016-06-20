package cn.fanstar.server.controller;

import cn.fanstar.server.facade.RemoteFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MvcDemoController {

    @Autowired
    RemoteFacade remoteFacade;

    @RequestMapping(value="/index")
    public String index(Model model) {
        String result = remoteFacade.test();
        model.addAttribute("result", result);
        return "index";
    }

}
