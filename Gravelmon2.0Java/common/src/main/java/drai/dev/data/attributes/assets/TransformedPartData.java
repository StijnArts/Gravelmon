package drai.dev.data.attributes.assets;

import com.google.gson.*;

public class TransformedPartData {
    String part;
    Vector3 position;
    Vector3 rotations;
    boolean isVisible = true;

    public TransformedPartData(String part, Vector3 position, Vector3 rotations, boolean isVisible) {
        this.part = part;
        this.position = position;
        this.rotations = rotations;
        this.isVisible = isVisible;
    }

    public JsonObject toJsonObjet(){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("part", part);
        jsonObject.addProperty("isVisible", part);
        jsonObject.add("position", position.getJsonArray());
        jsonObject.add("rotation", position.getJsonArray());
        return jsonObject;
    }
}
