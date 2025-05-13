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
    public Quirk(String animationName, List<String> animations, int loopTimes, int minSecondsBetweenOccurrences, int maxSecondsBetweenOccurrences) {
        super(animationName, animations);
        this.loopTimes = loopTimes;
        this.minSecondsBetweenOccurrences = minSecondsBetweenOccurrences;
        this.maxSecondsBetweenOccurrences = maxSecondsBetweenOccurrences;
    }

    public JsonObject getAnimationJson(String animationFileName) {
        var json = super.getAnimationJson(animationFileName);
        json.remove("poseName");
        json.addProperty("name", animationName);
        if(loopTimes > 0) json.addProperty("loopTimes", loopTimes);
        if(minSecondsBetweenOccurrences > 0) json.addProperty("minSecondsBetweenOccurrences", minSecondsBetweenOccurrences);
        if(maxSecondsBetweenOccurrences > 0) json.addProperty("maxSecondsBetweenOccurrences", maxSecondsBetweenOccurrences);
        return json;
    }

    public static Quirk simpleQuirk(String animationName){
        return new Quirk(animationName, List.of(animationName));
    }
}
