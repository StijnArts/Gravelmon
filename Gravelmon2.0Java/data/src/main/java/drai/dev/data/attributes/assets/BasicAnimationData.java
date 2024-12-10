package drai.dev.data.attributes.assets;

import com.google.gson.*;

import java.util.*;

public abstract class BasicAnimationData {
    public String animationName;
    public List<String> animations;

    public BasicAnimationData(String animationName, List<String> animations) {
        this.animationName = animationName;
        this.animations = animations;
    }

    protected JsonObject getAnimationJson(String animationFileName) {
        var jsonObject = new JsonObject();
        jsonObject.addProperty("poseName", animationName);
        var animationsJson = new JsonArray();
        animations.forEach(animation -> {
            if(animation.equalsIgnoreCase("look") || animation.contains("q."))
                animationsJson.add(animation);
            else animationsJson.add("bedrock("+animationFileName+", "+animation+")");
        });
        jsonObject.add("animations", animationsJson);
        return jsonObject;
    }
}
