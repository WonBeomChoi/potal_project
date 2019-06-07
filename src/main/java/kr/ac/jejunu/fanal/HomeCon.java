package kr.ac.jejunu.fanal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeCon {
    @GetMapping("/")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView("test");
        modelAndView.addObject("id","외않되");
        return  modelAndView;
    }
}
