package cn.bounter.policy.controller;

import cn.bounter.policy.service.ClientServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientServiceManager clientServiceManager;

    @GetMapping
    public void process(Integer key) {
        clientServiceManager.process(key);
    }
}
