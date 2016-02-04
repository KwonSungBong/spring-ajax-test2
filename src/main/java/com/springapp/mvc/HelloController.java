package com.springapp.mvc;

import com.springapp.mvc.requestWrapper.ComplexTest2Wrapper;
import com.springapp.mvc.requestWrapper.ComplexTestWrapper;
import com.springapp.mvc.requestWrapper.PostTestWrapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(value = "/complexTest2", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity complexTest2(@RequestBody ComplexTest2Wrapper complexTest2Wrapper) {
		return new ResponseEntity(complexTest2Wrapper, HttpStatus.OK);
	}

	@RequestMapping(value = "/complexTest", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity complexTest(@RequestBody ComplexTestWrapper complexTestWrapper) {
		return new ResponseEntity(complexTestWrapper, HttpStatus.OK);
	}

	//참조 : http://www.leveluplunch.com/java/tutorials/014-post-json-to-spring-rest-webservice/
	@RequestMapping(value = "/post1test", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity post1Test(@RequestBody PostTestWrapper postTestWrapper) {
		return new ResponseEntity(postTestWrapper, HttpStatus.OK);
	}
}