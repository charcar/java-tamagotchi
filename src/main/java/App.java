import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.velocity.VelocityTemplateEngine;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      // model.put("tamagotchis", request.session().attribute("tamagotchis"));
      model.put("template", "templates/tamagotchi.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    // post("/tamagotchis", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //
    //   ArrayList<Tamagotchi> tamagotchis = request.session().attribute("tamagotchis");
    //
    //   if (tamagotchis == null) {
    //     tamagotchis = new ArrayList<Tamagotchi>();
    //     request.session().attribute("tamagotchis", tamagotchis);
    //   }
    //
    //   String name = request.queryParams("name");
    //   Tamagotchi newTamagotchi = new Tamagotchi(name);
    //   tamagotchis.add(newTamagotchi);
    //
    //   model.put("template", "templates/tamagotchi.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }
}
