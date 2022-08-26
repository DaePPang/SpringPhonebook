package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import service.PhonebookServiceInter;
import vo.PhonebookVO;

@Controller
public class MemoController {

	@Autowired
	PhonebookServiceInter service;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/list")
	public ModelAndView list() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("list",service.getList());
		mv.setViewName("list");
		return mv;
	}
	
	@RequestMapping("/find")
	public ModelAndView list(String search) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("list",service.find(search));
		mv.setViewName("list");
		return mv;
	}
	//form처리시
	@RequestMapping("/insertProc")
	public String insertProc(PhonebookVO pb) {
		System.out.println(pb.toString());
		int result=service.insert(pb);		
		return "index";
	}
	
	//ajax처리시
	@RequestMapping("/insert")
	public ModelAndView insert(PhonebookVO pb) {
		ModelAndView mv=new ModelAndView();
		//첫번째 작업 입력
		int result=service.insert(pb);		
		//두번째 작업 리스트 요청(페이지로 이동하는 것이 아닌 결과로 돌려주는것)
		mv.addObject("list",service.getList());
		mv.setViewName("list");
		return mv;
	}
	
	@RequestMapping("/findOne")
	public ModelAndView findOne(int idx) {
		ModelAndView mv=new ModelAndView();
		//System.out.println(idx);
		//System.out.println(service.findOne(idx).toString());
		//첫번째 작업 입력
		//int result=service.findOne(idx); 입력하는것이 없고, 객체를 가지고오면 되기때문에 이 구문은 필요가 없음		
		//두번째 작업 리스트 요청(페이지로 이동하는 것이 아닌 결과로 돌려주는것)
		mv.addObject("phonebook",service.findOne(idx));
		mv.setViewName("findOne");
		return mv;
	}
	
	@RequestMapping("/delete")
		public ModelAndView deletelist(int idx) {
		ModelAndView mv=new ModelAndView();
			int result=service.delete(idx);	
			mv.addObject("list",service.getList());
			mv.setViewName("list");
			return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView update(PhonebookVO pb) {
		ModelAndView mv=new ModelAndView();
		//첫번째 작업 입력
		int result=service.update(pb);		
		//두번째 작업 리스트 요청(페이지로 이동하는 것이 아닌 결과로 돌려주는것)
		mv.addObject("list",service.getList());
		mv.setViewName("list");
		return mv;
	}
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	@ResponseBody
	@PostMapping("/formProc")
	public String formProc(@RequestBody String json) { //@RequestBody 데이터 형식으로 묶어서 보내기, 반드시 스트링 형태!!!
		System.out.println(json);
		return "json";
	}
	
}
