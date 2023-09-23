package org.example;

import org.springframework.web.bind.annotation.*;


public class ApiController {

    @RequestMapping(method = RequestMethod.GET,value = "/api/startApi")
    public String getRequest(){
        return "Swagger Api get Response";
    }

    @PostMapping("/api/posts")
    public String postRequest(@RequestBody String body){
        return body;
    }


    @PutMapping ("/api/put")
    public String putRequest(@RequestBody String body){
        return body;
    }

    @DeleteMapping  ("/api/delete")
    public String deleteRequest(@RequestBody String body){
        return body;
    }


}
