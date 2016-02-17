import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.velocity.VelocityTemplateEngine;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/create.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/tamagotchi", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();

      Tamagotchi myGotchi = request.session().attribute("tamagotchi");
      String name;
      if(myGotchi == null) {
        name = request.queryParams("name");
        myGotchi = new Tamagotchi(name);
        request.session().attribute("tamagotchi", myGotchi);
      } else {
        name = myGotchi.getName();
      }

      String action = request.queryParams("action");
      myGotchi.timePasses();
      if(action!=null) {
        if(action.equals("feed")) {
          myGotchi.feed();
        } else if (action.equals("play")) {
          myGotchi.play();
        } else if (action.equals("sleep")) {
          myGotchi.sleep();
        }
      }

      int foodLevel = myGotchi.getFoodLevel();
      int activityLevel = myGotchi.getActivityLevel();
      int sleepLevel = myGotchi.getSleepLevel();
      int age = myGotchi.getAge();

      model.put("name", name);
      model.put("age", age);
      model.put("foodLevel", foodLevel);
      model.put("playLevel", activityLevel);
      model.put("sleepLevel", sleepLevel);

      model.put("template", "templates/tamagotchi.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
