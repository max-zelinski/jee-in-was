package ru.smply.was.jee.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class JaxWSEndpoint {
    @WebMethod
    public String hello() {
        return "hello";
    }
}
