package edu.nf.dazhaohui.controller;

import edu.nf.dazhaohui.base.BasicController;
import edu.nf.dazhaohui.service.MailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController extends BasicController {

    @Resource
    private MailService mailService;

    @RequestMapping("test")
    @ResponseBody
    public String demoTest() {
        String result;
        try {
            mailService.sendMailByQQ("x@pp.com", "come on", "we can do it.");
            result = "perfect";
        } catch (Exception ex) {
            result = "try again";
        }

        return result;
    }

}
