package drai.dev.data.attributes.assets;

import com.google.gson.*;

import java.util.*;

public class PosingFileData {
    public String animationFileName;
    public double profileScale = .22;
    public double portraitScale = .165;
    public Vector3 profileCoords = new Vector3(0.0, 1.55, -20.0);
    public Vector3 portraitCoords = new Vector3(0.0, 1.4, 0.0);
    public List<AnimationData> animations = new ArrayList<>();
    public String faint;
    public String head;
    public String cry;

    public JsonElement getPosesJson() {
        var poserJson = new JsonObject();
        if(head == null || head.isEmpty()) poserJson.addProperty("head", head);
        poserJson.addProperty("portraitScale", portraitScale);
        poserJson.add("portraitTranslation", portraitCoords.getJsonArray());
        poserJson.addProperty("profileScale", profileScale);
        poserJson.add("profileTranslation", profileCoords.getJsonArray());
        poserJson.addProperty("faint", faint);
        poserJson.addProperty("cry", cry);
        var poses = new JsonObject();
        animations.forEach(animation->poses.add(animation.animationName, animation.getAnimationJson(animationFileName)));
        poserJson.add("poses", poses);
        return poserJson;
    }


}
