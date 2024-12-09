package drai.dev.data.attributes.assets;

import com.cobblemon.mod.common.entity.*;
import com.google.gson.*;

import java.util.*;

public class AnimationData extends BasicAnimationData {
    List<PoseType> poseTypes = new ArrayList<>();
    int transformTicks;
    List<Quirk> quirks = new ArrayList<>();
    List<TransformedPartData> transformedPartDataList = new ArrayList<>();
    Optional<Boolean> isBattle = Optional.empty();
    Optional<Boolean> isTouchingWater = Optional.empty();

    public AnimationData(String animationName, List<PoseType> poseTypes, List<String> animations, List<Quirk> quirks, int transformTicks) {
        super(animationName, animations);
        this.poseTypes.addAll(poseTypes);
        this.transformTicks = transformTicks;
        this.quirks.addAll(quirks);
    }

    public static AnimationData sleepingAnimation(){
        return new AnimationData("sleeping", List.of(PoseType.SLEEP), List.of("sleep"),
                List.of(), 10);
    }

    public static AnimationData battleIdleAnimation(){
        return new AnimationData("battle-idle", List.of(PoseType.STAND), List.of("battle_idle"),
                List.of(), 10).setIsBattle(true);
    }

    public static AnimationData standingAnimation(){
        return new AnimationData("standing", List.of(PoseType.STAND, PoseType.PORTRAIT, PoseType.PROFILE, PoseType.NONE), List.of("ground_idle"), List.of(), 10);
    }

    public static AnimationData walkingAnimation(){
        return new AnimationData("walking", List.of(PoseType.WALK), List.of("ground_walk"), List.of(), 10);
    }

    public AnimationData notBattle() {
        setIsBattle(false);
        return this;
    }

    public AnimationData withBlink(){
        quirks.add(Quirk.simpleQuirk("blink"));
        return this;
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

    public AnimationData setPoseTypes(List<PoseType> poseTypes) {
        this.poseTypes = poseTypes;
        return this;
    }

    public AnimationData setTransformTicks(int transformTicks) {
        this.transformTicks = transformTicks;
        return this;
    }

    public AnimationData setQuirks(List<Quirk> quirks) {
        this.quirks = quirks;
        return this;
    }

    public AnimationData setTransformedPartDataList(List<TransformedPartData> transformedPartDataList) {
        this.transformedPartDataList = transformedPartDataList;
        return this;
    }

    public AnimationData setIsBattle(boolean isBattle) {
        this.isBattle = Optional.of(isBattle);
        return this;
    }

    public AnimationData setIsTouchingWater(boolean isTouchingWater) {
        this.isTouchingWater = Optional.of(isTouchingWater);
        return this;
    }

    public AnimationData addPoseType(PoseType poseType) {
        this.poseTypes.add(poseType);
        return this;
    }
}
