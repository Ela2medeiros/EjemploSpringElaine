package cl.icap.fullstackjava2022.modulo5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebAppController {
	@RequestMapping("/") //informar la ruta
	public String getHome() {
		return("index");
	}
	
	
	@RequestMapping("/departments_page")
	public String getDepartments_page() { //@ResponseBody para return se muestre en a pantalla
		return "departments_page";
	}

}