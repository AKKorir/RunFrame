package controllers;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result about() {
        return ok(views.html.about.render());
    }
    
    public Result service() {
        return ok(views.html.service.render());
    }
    
    public Result reserve() {
        return ok(views.html.reserv.render());
    }
    public Result contact() {
        return ok(views.html.contact.render());
    }
}
