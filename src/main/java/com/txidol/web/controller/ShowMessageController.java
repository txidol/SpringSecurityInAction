package com.txidol.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * <p>Copyright:Copyright(c)2013</p>
 * <p>Description: </p>
 * @date 2014年1月17日
 * @author 谭翔
 * @version 1.0
 */

@Controller
public class ShowMessageController {
	final static Logger logger = LoggerFactory.getLogger(ShowMessageController.class);
	
	@RequestMapping("/showMessage")
	public @ResponseBody String simple() {
		logger.info("showMessage");
		return "welcome txidol!";
	}
	
}
