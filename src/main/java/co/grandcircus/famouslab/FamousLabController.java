package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.famouslab.entity.Innovator;
import co.grandcircus.famouslab.entity.Inventor;
import co.grandcircus.famouslab.service.ApiService;

@Controller
public class FamousLabController {

	@Autowired
	ApiService apiService;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		List<Inventor> inventors = apiService.getNerds(); 
		mv.addObject("list", inventors);
		return mv;
	}

	@RequestMapping("/complete")
	public ModelAndView complete() {
		ModelAndView mv = new ModelAndView("complete");
		List<Innovator> innovators = apiService.getAllNerds();
		mv.addObject("listComp", innovators);
		return mv;
		// return new ModelAndView("complete", "list", "get other nerbs");
	}

}
