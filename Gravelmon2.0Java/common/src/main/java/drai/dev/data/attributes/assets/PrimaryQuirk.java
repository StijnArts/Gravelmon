package drai.dev.data.attributes.assets;

import org.jetbrains.annotations.*;

import java.util.*;

public class PrimaryQuirk extends Quirk {

    public PrimaryQuirk(String animation) {
        super(animation);
    }

    public PrimaryQuirk(String... animation) {
        super(animation);
    }

    public PrimaryQuirk(List<String> animation) {
        super(animation);
    }

    public PrimaryQuirk(String animation, int loopTimes, int minSecondsBetweenOccurrences, int maxSecondsBetweenOccurrences) {
        super(animation, loopTimes, minSecondsBetweenOccurrences, maxSecondsBetweenOccurrences);
    }

    public PrimaryQuirk(List<String> animations, int loopTimes, int minSecondsBetweenOccurrences, int maxSecondsBetweenOccurrences) {
        super(animations, loopTimes, minSecondsBetweenOccurrences, maxSecondsBetweenOccurrences);
    }

    public PrimaryQuirk(String animation, int loopTimes, int minSecondsBetweenOccurrences, int maxSecondsBetweenOccurrences, @Nullable String curve) {
        super(animation, loopTimes, minSecondsBetweenOccurrences, maxSecondsBetweenOccurrences, curve);
    }

    public PrimaryQuirk(List<String> animations, int loopTimes, int minSecondsBetweenOccurrences, int maxSecondsBetweenOccurrences, @Nullable String curve) {
        super(animations, loopTimes, minSecondsBetweenOccurrences, maxSecondsBetweenOccurrences, curve);
    }

    @Override
    public String getAnimationFunction(String animationFileName) {
        return "q.bedrock_primary_quirk('" + animationFileName + "', " + getVariables() + ")";
    }
}
