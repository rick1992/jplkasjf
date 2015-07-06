/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.BindException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.HolaService;

/**
 *
 * @author RICARDO
 */
public class HolaController extends SimpleFormController {
    
   private HolaService holaService;

    public void setHolaService(HolaService holaService) {
        this.holaService = holaService;
    }
   

    public HolaController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Nombre.class);
        setCommandName("nombre");
        setSuccessView("holaView");
        setFormView("nombreVIew");
    }

//    @Override
//    protected void doSubmitAction(Object command) throws Exception {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }
    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
//    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request,
            HttpServletResponse response,
            Object command,
            BindException errors) throws Exception {
        Nombre nombre = (Nombre) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("holaMensaje",holaService.diHola(nombre.getValor()));
        //Do something...
        return mv;
    }

}
