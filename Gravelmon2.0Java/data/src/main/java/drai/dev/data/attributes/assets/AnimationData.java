package drai.dev.data.attributes.assets;

import com.cobblemon.mod.common.entity.*;
import com.google.gson.*;

import java.util.*;

public class AnimationData extends BasicAnimationData {
    List<PoseType> poseTypes;
    int transformTicks;
    List<Quirk> quirks = new ArrayList<>();
    List<TransformedPartData> transformedPartDataList = new ArrayList<>();
    Optional<Boolean> isBattle = Optional.empty();
    Optional<Boolean> isTouchingWater = Optional.empty();

    public AnimationData(String animationName, List<PoseType> poseTypes, List<String> animations, int transformTicks) {
        super(animationName, animations);
        this.poseTypes = poseTypes;
        this.transformTicks = transformTicks;
    }

    public JsonObject getAnimationJson(String animationFileName) {
        var json = super.getAnimationJson(animationFileName);
        var poseTypesJson = new JsonArray();
        poseTypes.forEach(poseType -> poseTypesJson.add(poseType.name()));
        json.add("poseTypes", poseTypesJson);
        json.addProperty("transformTicks", transformTicks);
        isBattle.ifPresent(aBoolean -> json.addProperty("isBattle", aBoolean));
        isTouchingWater.ifPresent(aBoolean -> json.addProperty("isTouchingWater", aBoolean));
        var quirksJson = new JsonArray();
        var transformedParts = new JsonArray();
        transformedPartDataList.forEach(transformedPart -> transformedParts.add(transformedPart.toJsonObjet()));
        quirks.forEach(quirk -> quirksJson.add(quirk.getAnimationJson(animationFileName)));
        json.add("quirks", quirksJson);
        return json;
    }

    public String getAnimationName() {
        return animationName;
    }

    public List<PoseType> getPoseTypes() {
        return poseTypes;
    }

    public int getTransformTicks() {
        return transformTicks;
    }

    public List<String> getAnimations() {
        return animations;
    }
}
