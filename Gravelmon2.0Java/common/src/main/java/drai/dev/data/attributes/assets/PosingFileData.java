package drai.dev.data.attributes.assets;

import com.cobblemon.mod.common.entity.*;
import com.google.gson.*;
import drai.dev.data.pokemon.*;

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
    private String faint;
    private String cry;
    private String physical;
    private String special;
    private String status;
    private String recoil;
    public String head;

    public PosingFileData(WorldRepresentablePokemon pokemon) {
        this.pokemon = pokemon;
    }

    public JsonElement getPosesJson() {
        var poserJson = new JsonObject();
        if(head != null && !head.isEmpty()) poserJson.addProperty("head", head);

        if(animationFileName == null || animationFileName.isEmpty()) animationFileName = "cutout";
        poserJson.addProperty("portraitScale", portraitScale);
        poserJson.add("portraitTranslation", portraitCoords.getJsonArray());
        poserJson.addProperty("profileScale", profileScale);
        poserJson.add("profileTranslation", profileCoords.getJsonArray());
        var hasFaint = faint != null && !faint.isEmpty();
        var hasCry = cry != null && !cry.isEmpty();
        var hasPhysical = physical != null && !physical.isEmpty();
        var hasSpecial = special != null && !special.isEmpty();
        var hasStatus = status != null && !status.isEmpty();
        var hasRecoil = recoil != null && !recoil.isEmpty();
        if(hasFaint || hasCry || hasPhysical || hasSpecial) {
            var animationsJson = new JsonObject();
            poserJson.add("animations", animationsJson);
            if(hasFaint) animationsJson.addProperty("faint", faint);
            if(hasCry) animationsJson.addProperty("cry", cry);
            if(hasPhysical) animationsJson.addProperty("physical", physical);
            if(hasSpecial) animationsJson.addProperty("special", special);
            if(hasStatus) animationsJson.addProperty("status", status);
            if(hasRecoil) animationsJson.addProperty("recoil", recoil);
        }
        var poses = new JsonObject();
        animations.forEach(animation->poses.add(animation.animationName, animation.getAnimationJson(animationFileName)));
        poserJson.add("poses", poses);
        return poserJson;
    }

    public void setCryFromAnimationType(String bedrockAnimationType){
        cry = bedrockAnimationType + "('"+animationFileName+"', 'cry')";
    }

    public void setFaintFromAnimationType(String bedrockAnimationType){
        cry = bedrockAnimationType + "('"+animationFileName+"', 'cry')";
    }

    public void addAnimator(String animation, String... animator) {
        if(animator.length < 1) return;
        var pokemon = this.getPokemon();
        var metaData = pokemon.getModelMetaData();
        if(metaData.getAnimatorsPerOptionalAnimation().containsKey(animation)) {
            metaData.getAnimatorsPerAnimation().computeIfAbsent(animation, k -> new HashSet<>()).add(animator[0]);
        }
        metaData.getAnimatorsPerAnimation().computeIfAbsent(animation, k -> new HashSet<>()).add(animator[0]);
    }

    public void addFaint(String... animator){
        faint = "bedrock("+animationFileName+", faint)";
        addAnimator("faint", animator);
    }

    public void addCry(String... animator){
        cry = "bedrock("+animationFileName+", cry)";
        addAnimator("cry", animator);
    }

    public void addPhysical(String... animator){
        physical = "bedrock("+animationFileName+", physical)";
        addAnimator("physical", animator);
    }

    public void addSpecial(String... animator){
        special = "bedrock("+animationFileName+", special)";
        addAnimator("special", animator);
    }

    public void setFaint(String faint, String... animator) {
        this.faint = faint;
        addAnimator("faint", animator);
    }

    public void setCry(String cry, String... animator) {
        this.cry = cry;
        addAnimator("cry", animator);
    }

    public void setPhysical(String physical, String... animator) {
        this.physical = physical;
        addAnimator("physical", animator);
    }

    public void setSpecial(String special, String... animator) {
        this.special = special;
        addAnimator("special", animator);
    }

    public void setRecoil(String recoil, String... animator) {
        this.recoil = recoil;
        addAnimator("recoil", animator);
    }

    public void setStatus(String status, String... animator) {
        this.status = status;
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
}
