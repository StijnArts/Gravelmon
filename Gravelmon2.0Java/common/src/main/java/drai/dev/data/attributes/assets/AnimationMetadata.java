package drai.dev.data.attributes.assets;

import java.util.*;

public class AnimationMetadata  {
    private final Set<String> animators = new HashSet<>();
    private boolean isStatic = false;
    private boolean hasParity = false;

    public AnimationMetadata(List<String> animators, boolean isStatic) {
        this(animators);
        this.isStatic = isStatic;
    }

    public AnimationMetadata(List<String> animators) {
        this.animators.addAll(animators);
    }

    public AnimationMetadata(){}

    public Set<String> getAnimators() {
        return animators;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public AnimationMetadata addAnimator(String animator) {
        animators.add(animator);
        return this;
    }

    public AnimationMetadata setStatic(boolean isStatic) {
        this.isStatic = isStatic;
        return this;
    }
}
