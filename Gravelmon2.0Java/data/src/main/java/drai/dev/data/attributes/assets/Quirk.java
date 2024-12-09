package drai.dev.data.attributes.assets;

import com.google.gson.*;

import java.util.*;

public class Quirk extends BasicAnimationData {
    int loopTimes;
    int minSecondsBetweenOccurrences;
    int maxSecondsBetweenOccurrences;
    public Quirk(String animationName, List<String> animations) {
        super(animationName, animations);
    }

    public JsonObject getAnimationJson(String animationFileName) {
        var json = super.getAnimationJson(animationFileName);
        json.remove("poseName");
        json.addProperty("name", animationName);
        json.addProperty("loopTimes", loopTimes);
        json.addProperty("minSecondsBetweenOccurrences", minSecondsBetweenOccurrences);
        json.addProperty("maxSecondsBetweenOccurrences", maxSecondsBetweenOccurrences);
        return json;
    }
}
