package com.org.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.org.dxc.service.IPLService;

@RestController
public class WebController {
	
	@Autowired
	IPLService iplService;

}
