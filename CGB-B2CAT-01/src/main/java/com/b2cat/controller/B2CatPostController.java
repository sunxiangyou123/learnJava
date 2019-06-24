package com.b2cat.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class B2CatPostController {
	@RequestMapping("doPostUI")
	public String doIndexUI() {
		//转到发帖的界面
		return "";
	}
}
