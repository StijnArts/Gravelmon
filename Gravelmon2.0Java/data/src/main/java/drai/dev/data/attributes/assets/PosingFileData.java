package drai.dev.data.attributes.assets;

import com.cobblemon.mod.common.entity.*;
import com.google.gson.*;

import java.util.*;

public class PosingFileData {
    public String animationFileName;
    public double profileScale = .22;
    public double portraitScale = .165;
    public Vector3 profileCoords = new Vector3(0.0, 1.55, -20.0);
    public Vector3 portraitCoords = new Vector3(0.0, 1.4, 0.0);
    public List<AnimationData> animations = new ArrayList<>();
    private String faint;
    private String cry;
    private String physical;
    private String special;
    private String status;
    private String recoil;
    public String head;

    public JsonElement getPosesJson() {
        var poserJson = new JsonObject();
        if(head == null || head.isEmpty()) poserJson.addProperty("head", head);
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

    public void addFaint(){
        faint = "bedrock("+animationFileName+", faint)";
    }

    public void addCry(){
        faint = "bedrock("+animationFileName+", cry)";
    }

    public void addPhysical(){
        faint = "bedrock("+animationFileName+", physical)";
    }

    public void addSpecial(){
        faint = "bedrock("+animationFileName+", special)";
    }

    public void setFaint(String faint) {
        this.faint = faint;
    }

    public void setCry(String cry) {
        this.cry = cry;
    }

    public void setPhysical(String physical) {
        this.physical = physical;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public void setRecoil(String recoil) {
        this.recoil = recoil;
    }

    public void setStatus(String status) {
        this.status = status;
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
    }

    public void setAnimationFileName(String animationFileName) {
        this.animationFileName = animationFileName;
    }

    public void shoulderAnimations() {
        var leftShoulder = new AnimationData("shoulder_left", List.of(PoseType.SHOULDER_LEFT), List.of("shoulder"), List.of(), 10);
        var rightShoulder = new AnimationData("shoulder_right", List.of(PoseType.SHOULDER_RIGHT), List.of("shoulder"), List.of(), 10);;
        animations.add(leftShoulder);
    }
}
