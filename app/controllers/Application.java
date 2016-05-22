package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.products;

import java.util.HashMap;

public class Application extends Controller {

  private static final java.util.Map<Integer,String> productMap = new HashMap<>();

  static {
    productMap.put(1,"KeyBoard");
    productMap.put(2,"mouse");
    productMap.put(3,"monitor");
  }

  public static Result listProducts() {
    return ok(products.render(productMap.values()));
  }

  public static Result index()  {
    return ok(views.html.main.render());
  }

  public static Result hello(){

    return ok("Hello my friend");
  }

  public static Result echo(String message) {

    return ok("message : " + message);
  }

  public static Result helloRedirect(){

    return redirect(controllers.routes.Application.echo("HelloWorldRedirection"));
  }

}
