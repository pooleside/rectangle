import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    //this method puts the home page out in the layout.vtl template
    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");//We are putting the home.vtl template into the root "/" route
      return new ModelAndView(model, layout);  //returning to Spark
    }, new VelocityTemplateEngine());

    //We are now making a second page that displays results of home page(root page /)
    get("/rectangle", (request,response) -> {
    HashMap<String, Object> model = new HashMap<String, Object>();//created a HashMap called model
    int height = Integer.parseInt(request.queryParams("height")); // This brings in what was typed text box with the name "height" from home.vtl or root route
    int width = Integer.parseInt(request.queryParams("width"));  //Example line..<input id="height" name="height" class="form-control" type="text"/>
                                                                //anything coming in from a text input on a website is a string.  In this program the string needs to be converted to an integer
    Rectangle testR = new Rectangle (height, width);//This is creating a new instance of the class Rectangle called "testR" We are passing it the height and width from user interface (UI)
    model.put("testR", testR);
    //line above..adding to HashMap called "model" a string and object using .put method. "testR" is the string key and testR is the rectangle object
    model.put("template", "templates/rectangle.vtl");//put in my HashMap a rectangle.vtl template called "template"
    return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  }//end of main method
}//end of class
