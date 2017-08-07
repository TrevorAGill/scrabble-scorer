import models.Scrabble;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Float.parseFloat;
import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

/**
 * Created by Guest on 8/1/17.
 */
public class Main {
    public static void main(String[] args) {
        staticFileLocation("/public"); //this line has changed!
        get("/form", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "form.hbs");
        }, new HandlebarsTemplateEngine());
        get("/change_result", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String word = request.queryParams("word");
            model.put("word", word);

            Scrabble newScrabble = new Scrabble();

            int result = newScrabble.calculateScore(word);
            model.put("score", result);

            return new ModelAndView(model, "change_result.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
