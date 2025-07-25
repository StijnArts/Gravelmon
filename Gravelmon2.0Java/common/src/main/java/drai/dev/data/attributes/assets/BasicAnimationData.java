package drai.dev.data.attributes.assets;

import com.google.gson.*;

import java.util.*;

public abstract class BasicAnimationData {
    public String animationName;
    public String poseName;
    public List<String> animations = new ArrayList<>();
    protected PosingFileData posingFileData;
    private String animator;
    protected boolean isStatic;

    public BasicAnimationData(String animationName, List<String> animations, String... animator) {
        this.animationName = animationName;
        this.poseName = animationName;
        this.animations.addAll(animations);
        if(animator.length > 0) {
            this.animator = animator[0];
        }
    }

    protected JsonObject getAnimationJson(String animationFileName) {
        var jsonObject = new JsonObject();
        jsonObject.addProperty("poseName", poseName);
        var animationsJson = new JsonArray();
        animations.forEach(animation -> {
            if(animation.equalsIgnoreCase("look") || animation.contains("q."))
                animationsJson.add(animation);
            else animationsJson.add("bedrock("+animationFileName+", "+animation+")");
        });
        jsonObject.add("animations", animationsJson);
        return jsonObject;
    }

    public PosingFileData getPosingFileData() {
        return posingFileData;
    }

    public void setPosingFileData(PosingFileData posingFileData) {
        this.posingFileData = posingFileData;
        String animator;
        if(this.animator == null || this.animator.isEmpty()) animator = posingFileData.getPokemon().getModelMetaData().getModelers().getFirst();
        else {
            animator = this.animator;
        }
        var pokemon = this.posingFileData.getPokemon();
        var metaData = pokemon.getModelMetaData();
        animations.forEach(animation -> {
//            if(metaData.getAnimatorsPerOptionalAnimation().containsKey(animation)) {
//                metaData.getAnimatorsPerOptionalAnimation().computeIfAbsent(animation, k -> new AnimationMetadata()).addAnimator(animator).setStatic(isStatic);
//            }
            metaData.getAnimatorsPerAnimation().computeIfAbsent(animation, k -> new AnimationMetadata()).addAnimator(animator).setStatic(isStatic);
        });
    }
}
