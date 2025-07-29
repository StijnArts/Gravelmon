package drai.dev.data.attributes.assets;

import com.cobblemon.mod.common.entity.*;
import com.google.gson.*;
import drai.dev.data.pokemon.*;
import kotlin.*;

import java.util.*;
import java.util.stream.*;

public class PosingFileData {
    WorldRepresentablePokemon pokemon;
    public String animationFileName;
    public double profileScale = .26;
    public double portraitScale = .205;
    public Vector3 profileCoords = new Vector3(0.0, 1.46, 0.0);
    public Vector3 portraitCoords = new Vector3(0.09, 1.25999, 0.0);
    public List<AnimationData> animations = new ArrayList<>();
    public List<Pair<String, String>> miscAnimations = new ArrayList<>();
    public String head;
    private String rootBone;
    private final Map<String, Vector3> firstPersonCameraOffsets = new HashMap<>();
    private final Map<String, Vector3> thirdPersonCameraOffsets = new HashMap<>();

    public PosingFileData(WorldRepresentablePokemon pokemon) {
        this.pokemon = pokemon;
    }

    public JsonElement getPosesJson() {
        var poserJson = new JsonObject();
//        if(head != null && !head.isEmpty()) poserJson.addProperty("head", head);
        if(rootBone != null && !rootBone.isEmpty()) {
            poserJson.addProperty("rootBone", rootBone);
        }


        if(animationFileName == null || animationFileName.isEmpty()) animationFileName = "cutout";
        poserJson.addProperty("portraitScale", portraitScale);
        poserJson.add("portraitTranslation", portraitCoords.getJsonArray());
        poserJson.addProperty("profileScale", profileScale);
        poserJson.add("profileTranslation", profileCoords.getJsonArray());
        if(!miscAnimations.isEmpty()) {
            var animationsJson = new JsonObject();
            poserJson.add("animations", animationsJson);
            miscAnimations.forEach(pair -> animationsJson.addProperty(pair.getFirst(), pair.getSecond()));
        }
        var poses = new JsonObject();
        animations.forEach(animation->poses.add(animation.poseName, animation.getAnimationJson(animationFileName)));
        poserJson.add("poses", poses);
        return poserJson;
    }

    public void addMiscAnimations(String... types) {
        for (int i = 0; i < types.length; i++) {
            addMiscAnimation(types[i]);
        }
    }

    public void addMiscAnimation(String type){
        addMiscAnimation(type, "q.bedrock_stateful('"+animationFileName+"', '"+type+"')");
    }

    public void addMiscAnimation(String type, String animation){
        miscAnimations.add(new Pair<>(type, animation));
    }

    public void setCryFromAnimationType(String bedrockAnimationType){
        miscAnimations.add(new Pair<>("cry", bedrockAnimationType + "('"+animationFileName+"', 'cry')"));
    }

    public void setFaintFromAnimationType(String bedrockAnimationType){
        miscAnimations.add(new Pair<>("faint", bedrockAnimationType + "('"+animationFileName+"', 'cry')"));
    }

    public void addAnimator(String animation, String... animator) {
        if(animator.length < 1) return;
        var pokemon = this.getPokemon();
        var metaData = pokemon.getModelMetaData();
        if(metaData.getAnimatorsPerOptionalAnimation().containsKey(animation)) {
            metaData.getAnimatorsPerAnimation().computeIfAbsent(animation, k -> new AnimationMetadata()).addAnimator(animator[0]);
        }
        metaData.getAnimatorsPerAnimation().computeIfAbsent(animation, k -> new AnimationMetadata()).addAnimator(animator[0]);
    }

    public void addFaint(String... animator){
        miscAnimations.add(new Pair<>("faint", "bedrock("+animationFileName+", faint)"));
        addAnimator("faint", animator);
    }

    public void addCry(String... animator){
        miscAnimations.add(new Pair<>("cry", "bedrock("+animationFileName+", cry)"));
        addAnimator("cry", animator);
    }

    public void addPhysical(String... animator){
        miscAnimations.add(new Pair<>("physical", "bedrock("+animationFileName+", physical)"));
        addAnimator("physical", animator);
    }

    public void addSpecial(String... animator){
        miscAnimations.add(new Pair<>("special", "bedrock("+animationFileName+", special)"));
        addAnimator("special", animator);
    }

    public void setFaint(String faint, String... animator) {
        miscAnimations.add(new Pair<>("faint", faint));
        addAnimator("faint", animator);
    }

    public void setCry(String cry, String... animator) {
        miscAnimations.add(new Pair<>("cry", cry));
        addAnimator("cry", animator);
    }

    public void setPhysical(String physical, String... animator) {
        miscAnimations.add(new Pair<>("physical", physical));
        addAnimator("physical", animator);
    }

    public void setSpecial(String special, String... animator) {
        miscAnimations.add(new Pair<>("special", special));
        addAnimator("special", animator);
    }

    public void setRecoil(String recoil, String... animator) {
        miscAnimations.add(new Pair<>("recoil", recoil));
        addAnimator("recoil", animator);
    }

    public void setStatus(String status, String... animator) {
        miscAnimations.add(new Pair<>("status", status));
        addAnimator("status", animator);
    }

    public void setPortraitData(float scale, Vector3 positioning){
        this.portraitScale = scale;
        this.portraitCoords = positioning;
    }

    public void setProfileData(float scale, Vector3 positioning){
        this.profileScale = scale;
        this.profileCoords = positioning;
    }

    public void setBasicHead() {
        head = "head";
    }

    public void addAnimations(List<AnimationData> animationData) {
        this.animations.addAll(animationData);
        animations.forEach(animationData1 -> animationData1.setPosingFileData(this));
    }

    public void setAnimationFileName(String animationFileName) {
        this.animationFileName = animationFileName;
    }

    public void shoulderAnimations(String... animator) {
        var leftShoulder = new AnimationData("shoulder_left", List.of(PoseType.SHOULDER_LEFT), List.of("shoulder"), List.of(), 10, animator);
        var rightShoulder = new AnimationData("shoulder_right", List.of(PoseType.SHOULDER_RIGHT), List.of("shoulder"), List.of(), 10, animator);
        animations.add(leftShoulder);
    }

    public List<PoseType> getUnusedPoseTypes() {
        var poseTypes = new ArrayList<>(List.of(PoseType.values()));
        var usedPoseTypes = animations.stream().flatMap(animationData -> animationData.poseTypes.stream()).collect(Collectors.toSet());
        usedPoseTypes.forEach(poseTypes::remove);
        return poseTypes;
    }

    public WorldRepresentablePokemon getPokemon() {
        return pokemon;
    }

    public void setRootBone(String rootBone) {
        this.rootBone = rootBone;
    }

    public void setThirdPersonCameraOffset(String seat, Vector3 forwards, Vector3 backwards) {
        thirdPersonCameraOffsets.put(seat, forwards);
        thirdPersonCameraOffsets.put(seat+"_reverse", backwards);
    }

    public void addFirstPersonCameraOffset(String seat, Vector3 offset) {
        firstPersonCameraOffsets.put(seat, offset);
    }
}
