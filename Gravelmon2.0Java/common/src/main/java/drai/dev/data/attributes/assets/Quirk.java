package drai.dev.data.attributes.assets;

import org.jetbrains.annotations.*;

import java.util.*;

public class Quirk {
    final List<String> animations = new ArrayList<>();
    Optional<Integer> loopTimes = Optional.empty();
    Optional<Integer> minSecondsBetweenOccurrences = Optional.empty();
    Optional<Integer> maxSecondsBetweenOccurrences = Optional.empty();
    @Nullable String curve;

    public Quirk(String... animation) {
        animations.addAll(List.of(animation));
    }

    public Quirk(List<String> animation) {
        animations.addAll(animation);
    }

    public Quirk(String animation, int loopTimes, int minSecondsBetweenOccurrences, int maxSecondsBetweenOccurrences) {
        this(animation);
        this.loopTimes = Optional.of(loopTimes);
        this.minSecondsBetweenOccurrences = Optional.of(minSecondsBetweenOccurrences);
        this.maxSecondsBetweenOccurrences = Optional.of(maxSecondsBetweenOccurrences);
    }

    public Quirk(List<String> animations, int loopTimes, int minSecondsBetweenOccurrences, int maxSecondsBetweenOccurrences) {
        this(animations);
        this.loopTimes = Optional.of(loopTimes);
        this.minSecondsBetweenOccurrences = Optional.of(minSecondsBetweenOccurrences);
        this.maxSecondsBetweenOccurrences = Optional.of(maxSecondsBetweenOccurrences);
    }

    public Quirk(String animation, int loopTimes, int minSecondsBetweenOccurrences, int maxSecondsBetweenOccurrences, @Nullable String curve) {
        this(animation, loopTimes, minSecondsBetweenOccurrences, maxSecondsBetweenOccurrences);
        this.curve = curve;
    }

    public Quirk(List<String> animations, int loopTimes, int minSecondsBetweenOccurrences, int maxSecondsBetweenOccurrences, @Nullable String curve) {
        this(animations, loopTimes, minSecondsBetweenOccurrences, maxSecondsBetweenOccurrences);
        this.curve = curve;
    }

    public String getAnimationFunction(String animationFileName) {
        return "q.bedrock_quirk('" + animationFileName + getVariables() + "')";
    }

    @NotNull protected String getVariables() {
        String variables = "', '" + getAnimationsForJson();
        if(minSecondsBetweenOccurrences.isPresent()) variables += ", " + minSecondsBetweenOccurrences.get();
        if(maxSecondsBetweenOccurrences.isPresent()) variables += ", " + maxSecondsBetweenOccurrences.get();
        if(loopTimes.isPresent()) variables += ", " + loopTimes.get();
        if(curve!=null) variables += ", " + curve;
        return variables;
    }

    public String getAnimationsForJson() {
        if(animations.size()==1) return animations.getFirst();
        else return "q.array(" + String.join(", ", animations) + ")";
    }

    public List<String> getAnimations() {
        return animations;
    }

    public static Quirk simpleQuirk(String animation){
        return new Quirk(animation);
    }
}
