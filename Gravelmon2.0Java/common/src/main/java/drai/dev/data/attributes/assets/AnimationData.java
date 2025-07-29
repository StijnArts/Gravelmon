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
    private final Map<String, String> namedAnimations = new HashMap<>();
    private String condition;
    private List<ConditionalAnimation> conditionalAnimations;
    private Optional<Boolean> isUnderwater = Optional.empty();

    public AnimationData(String animationName, List<PoseType> poseTypes, List<String> animations, List<Quirk> quirks, int transformTicks, String... animator) {
        super(animationName, animations, animator);
        this.poseTypes.addAll(poseTypes);
        this.transformTicks = transformTicks;
        this.quirks.addAll(quirks);
    }

    public static AnimationData sleepingAnimation(String... animator){
        return new AnimationData("sleeping", List.of(PoseType.SLEEP), List.of("sleep"),
                List.of(), 10, animator);
    }

    public static AnimationData battleIdleAnimation(String... animator){
        return new AnimationData("battle-standing", List.of(PoseType.STAND), List.of("battle_idle"),
                List.of(), 10, animator).setIsBattle(true);
    }

    public static AnimationData battleFlyingAnimation(String... animator){
        return new AnimationData("battle-flying", List.of(PoseType.HOVER), List.of("air_idle"),
                List.of(), 10, animator).setIsBattle(true);
    }

    public static AnimationData standingAnimation(String... animator){
        return new AnimationData("standing", List.of(PoseType.STAND, PoseType.PORTRAIT, PoseType.PROFILE, PoseType.NONE), List.of("ground_idle"), List.of(), 10, animator);
    }

    public static AnimationData walkingAnimation(String... animator){
        return new AnimationData("walking", List.of(PoseType.WALK), List.of("ground_walk"), List.of(), 10, animator);
    }

    public static AnimationData hoveringAnimation(String... animator){
        return new AnimationData("hovering", List.of(PoseType.HOVER), List.of("air_idle"), List.of(), 10, animator);
    }

    public static AnimationData flyingAnimation(String... animator){
        return new AnimationData("flying", List.of(PoseType.FLY), List.of("air_fly"), List.of(), 10, animator);
    }

    public static AnimationData glidingAnimation(String... animator){
        return new AnimationData("flying", List.of(PoseType.FLY), List.of("air_fly"), List.of(), 10, animator);
    }

    public static AnimationData floatingAnimation(String... animator){
        return new AnimationData("floating", List.of(PoseType.FLOAT), List.of("water_idle"), List.of(), 10, animator);
    }

    public static AnimationData swimmingAnimation(String... animator){
        return new AnimationData("swimming", List.of(PoseType.SWIM), List.of("water_swim"), List.of(), 10, animator);
    }

    public static AnimationData emptyAnimation() {
        return new AnimationData("standing", List.of(), List.of(), List.of(), 10, "").markAsBackupPose();
    }

    public static AnimationData surfaceFloatingAnimation(String... animator){
        return new AnimationData("on_floating", List.of(PoseType.FLOAT), List.of("surface_idle"), List.of(), 10, animator)
                .setIsTouchingWater(true).setIsUnderwater(false).setPoseName("surface_idle");
    }

    public static AnimationData surfaceSwimmingAnimation(String... animator){
        return new AnimationData("on_swimming", List.of(PoseType.FLOAT), List.of("surface_swim"), List.of(), 10, animator)
                .setIsTouchingWater(true).setIsUnderwater(false).setPoseName("surface_swim");
    }

    public static AnimationData waterSleepingAnimation(String... animator){
        return new AnimationData("water_sleeping", List.of(PoseType.FLOAT), List.of("water_sleep"), List.of(), 10, animator).inWater();
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
        var quirk = new Quirk(blinkList);
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
        animations.add(0, "q.look('head_ai')");
        return this;
    }

    public AnimationData setStatic(){
        isStatic = true;
        return this;
    }

    private AnimationData setIsUnderwater(boolean isUnderwater) {
        this.isUnderwater = Optional.of(isUnderwater);
        return this;
    }

    public AnimationData addPoseType(PoseType poseType) {
        this.poseTypes.add(poseType);
        return this;
    }

    public JsonObject getAnimationJson(String animationFileName) {
        var json = super.getAnimationJson(animationFileName);
        if(!conditionalAnimations.isEmpty()){
            var animationsJson = json.get("animations").getAsJsonArray();
            conditionalAnimations.forEach(animation -> animationsJson.add(animation.getAsJson(animationFileName)));
        }

        if (isBackup && posingFileData != null){
            poseTypes.addAll(posingFileData.getUnusedPoseTypes());
            if (poseTypes.size() == PoseType.values().length) {
                poseTypes.clear();
                allPoseTypes = Optional.of(true);
            }
        }

        if(!poseTypes.isEmpty()) {
            var poseTypesJson = new JsonArray();
            poseTypes.forEach(poseType -> poseTypesJson.add(poseType.name()));
            json.add("poseTypes", poseTypesJson);
        }

//        json.addProperty("transformTicks", transformTicks);
        isBattle.ifPresent(aBoolean -> json.addProperty("isBattle", aBoolean));
        isTouchingWater.ifPresent(aBoolean -> json.addProperty("isTouchingWater", aBoolean));
        isUnderwater.ifPresent(aBoolean -> json.addProperty("isUnderWater", aBoolean));
        allPoseTypes.ifPresent(aBoolean -> json.addProperty("allPoseTypes", aBoolean));
        if(condition!=null)  json.addProperty("condition", condition);
        var quirksJson = new JsonArray();
        var transformedParts = new JsonArray();
        var namedAnimations = new JsonArray();
        transformedPartDataList.forEach(transformedPart -> transformedParts.add(transformedPart.toJsonObjet()));
        quirks.forEach(quirk -> quirksJson.add(quirk.getAnimationFunction(animationFileName)));
        this.namedAnimations.forEach((key, value) -> namedAnimations.getAsJsonObject().addProperty(key, value));
        json.add("quirks", quirksJson);
        json.add("namedAnimations", namedAnimations);
        json.add("transformedParts", transformedParts);
        return json;
    }

    public List<PoseType> getPoseTypes() {
        return poseTypes;
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

    public AnimationData addQuirk(String quirk) {
        quirks.add(Quirk.simpleQuirk(quirk));
        return this;
    }

    public AnimationData notTouchingWater() {
        this.isTouchingWater = Optional.of(false);
        return this;
    }

    public AnimationData inWater() {
        this.isTouchingWater = Optional.of(true);
        return this;
    }

    public AnimationData setPoseName(String poseName) {
        this.poseName = poseName;
        return this;
    }

    public boolean isBackup() {
        return isBackup;
    }

    public List<Quirk> getQuirks() {
        return quirks;
    }

    public AnimationData addAnimations(String... s) {
        animations.addAll(Arrays.asList(s));
        return this;
    }

    public AnimationData addNamedAnimation(String name, String method) {
        this.namedAnimations.put(name, method);
        return this;
    }

    public AnimationData setCondition(String s) {
        this.condition = s;
        return this;
    }

    public AnimationData addConditionalAnimation(ConditionalAnimation conditionalAnimation) {
        this.conditionalAnimations.add(conditionalAnimation);
        return this;
    }

    public AnimationData removePoseTypes(PoseType... poseTypes) {
        for (PoseType poseType : poseTypes) {
            this.poseTypes.remove(poseType);
        }
        return this;
    }
}
