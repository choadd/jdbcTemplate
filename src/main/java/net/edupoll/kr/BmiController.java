package net.edupoll.kr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import net.edupoll.kr.entity.BodyMassVO;
import net.edupoll.kr.repository.BodymassDAO;

@Controller
public class BmiController {

	@Autowired
	BodymassDAO body;

	@GetMapping("/")
	public String view() {
		return "/welcome";
	}

	@PostMapping("/home")
	public String result(@ModelAttribute("result") BodyMassVO vo, Model model) {
		body.insertData(vo.getCm(), vo.getKg(), vo.getAge(), vo.getRate(), vo.getResult());
		model.addAttribute("list", body.info());
		System.out.println("testtest");
		return "/home";
	}

}
