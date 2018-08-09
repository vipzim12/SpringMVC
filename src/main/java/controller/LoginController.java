package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
  @RequestMapping(value = "/" )
  public String addEmployee() {
    return "login";
  }

  @RequestMapping(value = "/inputLogin", method = RequestMethod.POST)
  public String doAddEmployee(@RequestParam("username") String username,
      @RequestParam("password") String password, ModelMap modelMap) {
    if (username.equals("abc") && password.equals("123")) {
      return "resultLogin";
    } else {
      modelMap.addAttribute("message", "Login fail, Please login again!");
      return "login";
    }

  }
}
