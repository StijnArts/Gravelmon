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
    private Optional<Boolean> allPoseTypes = Optional.empty();
    private boolean isBackup;

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

    public static AnimationData hoveringAnimation(){
        return new AnimationData("hovering", List.of(PoseType.HOVER), List.of("air_idle"), List.of(), 10);
    }

    public static AnimationData flyingAnimation(){
        return new AnimationData("flying", List.of(PoseType.FLY), List.of("air_fly"), List.of(), 10);
    }

    public static AnimationData floatingAnimation(){
        return new AnimationData("floating", List.of(PoseType.FLOAT), List.of("water_idle"), List.of(), 10);
    }

    public static AnimationData swimmingAnimation(){
        return new AnimationData("swimming", List.of(PoseType.SWIM), List.of("water_swim"), List.of(), 10);
    }

    public static AnimationData emptyAnimation() {
        return new AnimationData("none", List.of(), List.of(), List.of(), 10);
    }

    public static AnimationData surfaceFloatingAnimation(){
        return new AnimationData("on_floating", List.of(PoseType.FLOAT), List.of("surface_idle"), List.of(), 10)
                .notInWater().setPoseName("floating");
    }

    public static AnimationData surfaceSwimmingAnimation(){
        return new AnimationData("on_swimming", List.of(PoseType.FLOAT), List.of("surface_idle"), List.of(), 10)
                .notInWater().setPoseName("swimming");
    }

    public static AnimationData waterSleepingAnimation() {
        return new AnimationData("water_sleeping", List.of(PoseType.FLOAT), List.of("water_sleep"), List.of(), 10).inWater();
    }

    private AnimationData setPoseName(String s) {
        this.poseName = s;
        return this;
    }

    public AnimationData notBattle() {
        setIsBattle(false);
        return this;
    }

    public AnimationData withBlink(int numberOfBlinkAnimations){
        var blinkList = new ArrayList<String>();
        for (int i = 0; i < numberOfBlinkAnimations; i++) {
//            if(i == 0) {
//                blinkList.add("blink");
//                continue;
//            }
            int blinkIndex = i + 1;
            blinkList.add("blink" + blinkIndex);
        }
        var quirk = new Quirk("blink", blinkList);
        quirks.add(quirk);
        return this;
    }

    public AnimationData withBlink(){
        quirks.add(Quirk.simpleQuirk("blink"));
        return this;
    }

    public AnimationData withCry(){
        quirks.add(Quirk.simpleQuirk("cry"));
        return this;
    }

    public AnimationData withLook() {
        animations.add(0, "look");
        return this;
    }

    public AnimationData addPoseType(PoseType poseType) {
        this.poseTypes.add(poseType);
        return this;
    }

    public JsonObject getAnimationJson(String animationFileName) {
        var json = super.getAnimationJson(animationFileName);

        if (isBackup && posingFileData != null){
            poseTypes.addAll(posingFileData.getUnusedPoseTypes());
        }

        if(!poseTypes.isEmpty()) {
            var poseTypesJson = new JsonArray();
            poseTypes.forEach(poseType -> poseTypesJson.add(poseType.name()));
            json.add("poseTypes", poseTypesJson);
        }

        json.addProperty("transformTicks", transformTicks);
        isBattle.ifPresent(aBoolean -> json.addProperty("isBattle", aBoolean));
        isTouchingWater.ifPresent(aBoolean -> json.addProperty("isTouchingWater", aBoolean));
        allPoseTypes.ifPresent(aBoolean -> json.addProperty("allPoseTypes", aBoolean));
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

    public AnimationData addAnimation(String animation) {
        animations.add(animation);
        return this;
    }

    public AnimationData addAnimation(int index, String animation) {
        animations.add(index, animation);
        return this;
    }

    public AnimationData markAsBackupPose() {
        isBackup = true;
        poseTypes.clear();
        return this;
    }

    public AnimationData clearAnimations() {
        animations.clear();
        return this;
    }

    public AnimationData addQuirk(Quirk quirk) {
        quirks.add(quirk);
        return this;
    }

    public AnimationData notInWater() {
        this.isTouchingWater = Optional.of(false);
        return this;
    }

    public AnimationData inWater() {
        this.isTouchingWater = Optional.of(true);
        return this;
    }

    public AnimationData setAnimationName(String waterSleep) {
        animationName = waterSleep;
        poseName = waterSleep;
        return this;
    }

    public boolean isBackup() {
        return isBackup;
    }

    public List<Quirk> getQuirks() {
        return quirks;
    }
}
