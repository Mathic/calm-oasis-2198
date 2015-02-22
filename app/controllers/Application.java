package controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import play.*;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render(""));
    }
    
    public static Result allevents() {
        return ok(allevents.render(""));
    }
    
    public static Result myevents() {
        return ok(myevents.render(""));
    }
    
    public static Result rinkmaps() {
        return ok(rinkmaps.render(""));
    }
    public static Result parkmaps() {
        return ok(parkmaps.render(""));
    }
    public static Result bikemaps() {
        return ok(bikemaps.render(""));
    }
    public static Result allmaps() {
        return ok(allmaps.render(""));
    }
    
}
