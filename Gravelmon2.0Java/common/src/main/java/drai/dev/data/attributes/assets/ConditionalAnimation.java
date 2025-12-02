package drai.dev.data.attributes.assets;

import com.google.gson.*;

public class ConditionalAnimation {
    String animation;
    String condition;

    public ConditionalAnimation(String animation, String condition) {
        this.animation = animation;
        this.condition = condition;
    }

    public JsonObject getAsJson(String animationFileName){
        var json = new JsonObject();
        json.addProperty("condition", condition);
        json.addProperty("animation", "q.bedrock('"+animationFileName+"', '"+animation+"')");
        return json;
    }
}
