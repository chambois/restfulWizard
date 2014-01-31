package hotelbooker.controller;

import hotelbooker.Customer;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class StartController {

    @RequestMapping(value = "/one", method = RequestMethod.GET)
    @ResponseBody
    public String getStart() throws Exception {
        // return required input information
        Customer customer = new Customer();
        return new ObjectMapper().writeValueAsString(customer);
    }

    @RequestMapping(value = "/one", method = RequestMethod.POST)
    @ResponseBody
    public void postStart(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setStatus(201);
//        response.sendRedirect("/two");
    }

}
