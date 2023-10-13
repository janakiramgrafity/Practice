package com.dms.orgservice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class Informationcontroller {
    @GetMapping("/hi")
    public String getInfo(HttpServletRequest request){
        String serverIpAddress = getServerIpAddress(request);
        int serverport = request.getLocalPort();
        return "Hi, you are using donor Service...!"+serverport+":"+serverport;
    }
    private String getServerIpAddress(HttpServletRequest request ) {
        try {
            InetAddress serverAddress = InetAddress.getByName(request.getLocalAddr());
           return serverAddress.getHostAddress();
        }
        catch (Exception e) {
            return "UNKNOWN";
        }

    }
}
