package com.example.web.socket.SocketChat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value="/messaging")
public class Controller {
	/*@Autowired
	private KafkaTemplate<String,String> kafka;*/
	
	@GetMapping(value="/send")
	public void send() {
		//kafka.send("topic","teste");
	}
	@GetMapping(value="/inicio")
	public ModelAndView cadastrarClient(){
		   return new ModelAndView("index");
	}
}
