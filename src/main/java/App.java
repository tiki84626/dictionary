import java.util.*;
import static spark.Spark.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    Definition newDefinition = new Definition("Def1", "Def2", "Def3", "Def4");
    
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/word", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String _word = request.queryParams("_word");


      Word myWord = new Word(_word, newDefinition);
      model.put("myWord", myWord);

      model.put("template", "templates/rectangle.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());




  }
}
