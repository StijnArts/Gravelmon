package drai.dev.data.attributes.assets;

import com.google.gson.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class AnimatedLayerData extends BasicLayerData {
    List<String> textureFrames = new ArrayList<>();
    int framerate;
    boolean loop;

    public AnimatedLayerData(String name, List<String> textureFrames, int framerate, boolean loop) {
        super(name);
        this.textureFrames = textureFrames;
        this.framerate = framerate;
        this.loop = loop;
    }

    public AnimatedLayerData(String name, List<String> textureFrames, int framerate, boolean loop,  boolean emissive,
                             boolean translucent, boolean considerGender, boolean considerShiny) {
        super(name, emissive, translucent, considerGender, considerShiny);
        this.textureFrames = textureFrames;
        this.framerate = framerate;
        this.loop = loop;
    }

    public static List<String> getFrames(String frameName, int i) {
        var frames  = new ArrayList<String>();
        for (int j = 0; j < i; j++) {
            frames.add(frameName+i+1);
        }
        return frames;
    }

    public JsonObject toJsonObject(AbstractPokemon abstractPokemon, boolean isShiny, boolean isFemale) {
        var json = super.toJsonObject();
        json.add("texture", getTextures(abstractPokemon, isShiny, isFemale));
        return json;
    }

    private JsonObject getTextures(AbstractPokemon abstractPokemon, boolean isShiny, boolean isFemale) {
        var jsonObject = new JsonObject();
        var frames = new JsonArray();
        textureFrames.forEach(frame -> frames.add(getTextureLocation(frame, abstractPokemon, considerShiny, considerGender, isShiny, isFemale)));
        jsonObject.add("frames", frames);
        jsonObject.addProperty("fps", framerate);
        jsonObject.addProperty("loop", loop);
        return jsonObject;
    }
}
