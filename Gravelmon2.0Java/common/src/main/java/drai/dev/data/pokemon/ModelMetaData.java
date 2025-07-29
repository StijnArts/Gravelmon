package drai.dev.data.pokemon;

import drai.dev.data.attributes.assets.*;

import java.util.*;

public class ModelMetaData {
    private final List<String> modelers = new ArrayList<>();
    private final List<String> textureArtists = new ArrayList<>();
    private final Map<String, AnimationMetadata> animatorsPerAnimation = new HashMap<>();
    private final Map<String, AnimationMetadata> animatorsPerOptionalAnimation = new HashMap<>();
    private boolean needsRemodel = false;
    private String remodelReason = "";

    public List<String> getModelers() {
        return modelers;
    }

    public List<String> getTextureArtists() {
        return textureArtists;
    }

    public Map<String, AnimationMetadata> getAnimatorsPerAnimation() {
        return animatorsPerAnimation;
    }

    public Map<String, AnimationMetadata> getAnimatorsPerOptionalAnimation() {
        return animatorsPerOptionalAnimation;
    }

    public boolean isNeedsRemodel() {
        return needsRemodel;
    }

    public void setNeedsRemodel(String reason) {
        this.needsRemodel = true;
        this.remodelReason = reason;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(modelers.size()==1 && textureArtists.size()==1 && modelers.getFirst().equalsIgnoreCase(textureArtists.getFirst())) {
            if(needsRemodel) {
                sb.append("Remodel Required: ");
                sb.append(remodelReason);
                sb.append("\n");
            }
                sb.append("Modeled and Textured by: ");
                sb.append(String.join(", ", modelers));
                sb.append("\n");
        } else {
            if (!modelers.isEmpty()) {
                sb.append("Modeled by: ");
                sb.append(String.join(", ", modelers));
                sb.append("\n");
            }

            if (!textureArtists.isEmpty()) {
                sb.append("Textured by: ");
                sb.append(String.join(", ", textureArtists));
                sb.append("\n");
            }
        }

        if (!animatorsPerAnimation.isEmpty()) {
            sb.append("Animations:\n");
            getAnimatorsForAnimations(sb, animatorsPerAnimation);
        } else {
            sb.append(" None\n");
        }

        if (!animatorsPerOptionalAnimation.isEmpty()) {
            sb.append("Optional Animations:\n");
            getAnimatorsForAnimations(sb, animatorsPerOptionalAnimation);
        } else {
            sb.append(" None\n");
        }

        return sb.toString();
    }

    private void getAnimatorsForAnimations(StringBuilder sb, Map<String, AnimationMetadata> animatorsPerOptionalAnimation) {
        for (Map.Entry<String, AnimationMetadata> entry : animatorsPerOptionalAnimation.entrySet()) {
            String animName = entry.getKey();
            if(animName.equalsIgnoreCase("look")) continue;
            var metadata = entry.getValue();
            var animators = metadata.getAnimators();
            sb.append(" - ").append(animName).append(": ");
            if (animators != null && !animators.isEmpty()) {
                sb.append(String.join(", ", animators));
            } else {
                sb.append("needed");
            }
            sb.append(metadata.isStatic()?" (Static)" : "");
            sb.append("\n");
        }
    }
}
