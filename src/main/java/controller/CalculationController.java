package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculationController {
	@RequestMapping("/home")
	public String home()
	{
		return "hello.jsp";
	}
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res)
	{
		ModelAndView mvc = new ModelAndView();
		int n1 = Integer.parseInt(req.getParameter("n1"));	
		int n2 = Integer.parseInt(req.getParameter("n2"));
		mvc.addObject("fn","ADDITION");
		mvc.addObject("p1", n1);
		mvc.addObject("p2", n2);
		mvc.addObject("result",(n1+n2));
		mvc.setViewName("result.jsp");
		return mvc;
		}
	
	@RequestMapping("/sub")
	public ModelAndView sub(HttpServletRequest req, HttpServletResponse res)
	{
		ModelAndView mvc = new ModelAndView();
		int n1 = Integer.parseInt(req.getParameter("n1"));	
		int n2 = Integer.parseInt(req.getParameter("n2"));
		mvc.addObject("fn","SUBTRACTION");
		mvc.addObject("p1", n1);
		mvc.addObject("p2", n2);
		mvc.addObject("result",(n1-n2));
		mvc.setViewName("result.jsp");
		return mvc;
		}
}
