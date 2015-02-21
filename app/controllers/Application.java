package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("hello."));
    }
    
    public static Result allevents() {
        return ok(allevents.render("hello."));
    }
    
    public static Result myevents() {
        return ok(myevents.render("hello."));
    }
    
    public static Result rinkmaps() {
        return ok(rinkmaps.render("hello."));
    }
    public static Result parkmaps() {
        return ok(parkmaps.render("hello."));
    }
    public static Result bikemaps() {
        return ok(bikemaps.render("hello."));
    }
    public static Result allmaps() {
        return ok(allmaps.render("hello."));
    }
    
}
