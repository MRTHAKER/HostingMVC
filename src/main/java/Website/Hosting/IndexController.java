package Website.Hosting;
import javax.servlet.http.*;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.*;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;  

@Controller
public class IndexController{
	@RequestMapping("/hello")
	public ModelAndView Index(HttpServletRequest req,Model m) {
		m.addAttribute("message","hello initial");
		return new ModelAndView("Login");
	} 
	
}
