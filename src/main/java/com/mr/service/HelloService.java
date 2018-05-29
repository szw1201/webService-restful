package com.mr.service;

import com.mr.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by lenovo on 2018/5/29.
 */
@Path("hello")
public class HelloService {

    @GET
    @Path("/hello")
    public void test1(){
        System.out.println("test get.....");
    }

    @GET
    @Path("/hello/{id}")
    public void test2(@PathParam("id") Integer id){
        System.out.println("test get....."+id);
    }

    @GET
    @Path("/getUser/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User test3(@PathParam("id") Integer id){
        System.out.println("test get....."+id);
        User user = new User(id,"haha",18);
        return user;
    }

    @POST
    @Path("/hello")
    public void test4(){
        System.out.println("hello POST ....");
    }

    @POST
    @Path("/helloName")
    public void test5(@QueryParam("name") String name){
        System.out.println("hello POST ...."+name);
    }

    @POST
    @Path("/helloInfo")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public User test6(User user){
        System.out.println(user);
        return user;
    }

}
