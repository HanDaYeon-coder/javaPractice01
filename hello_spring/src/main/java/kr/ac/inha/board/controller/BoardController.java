package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	@RequestMapping("/hello")
	public String hello(String num) {
		for(int i=0; ; i++) {
			
		}
	}
	
	@RequestMapping("/inha")
	public String inha(String param) {
		return param+"inha.ac.kr";
	}
	
	@RequestMapping("/name")
	public String name(String id) {
		return "당신의 학번은 : " + id;
	}
}