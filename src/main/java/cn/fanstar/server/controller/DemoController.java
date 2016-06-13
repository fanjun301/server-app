package cn.fanstar.server.controller;

import cn.fanstar.server.common.ResponseGSon;
import cn.fanstar.server.dto.Account;
import cn.fanstar.server.service.AccountService;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    private static Logger logger = Logger.getLogger(DemoController.class);

    @Autowired
    private AccountService accountService;

    @RequestMapping(value="/demo", method=RequestMethod.GET)
    public ResponseGSon getInfo(){
        Map<String,String> result = new HashMap<>();
        result.put("message","greeting from Frank ");
        return ResponseGSon.buildSuccessResult(result);
    }

    @RequestMapping(value="/get-account", method = RequestMethod.GET)
    public ResponseGSon getAccount(@RequestParam("name") String username){
        logger.info(String.format("Request:/get-account, parameter:%s", username));
        Account result = null;
        if (!StringUtils.isBlank(username)) {
            result = accountService.getAccount(username);
        }
        logger.info(String.format("Response:/get-account, parameter:%s, result:%s", username, result));
        return ResponseGSon.buildSuccessResult(result);
    }
}
