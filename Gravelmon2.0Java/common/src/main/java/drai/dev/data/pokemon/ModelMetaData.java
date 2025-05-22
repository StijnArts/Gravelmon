package drai.dev.data.pokemon;

import java.util.*;

public class ModelMetaData {
    private final List<String> modelers = new ArrayList<>();
    private final List<String> textureArtists = new ArrayList<>();
    private final Map<String, Set<String>> animatorsPerAnimation = new HashMap<>();
    private final Map<String, Set<String>> animatorsPerOptionalAnimation = new HashMap<>();

    public List<String> getModelers() {
        return modelers;
    }

    public List<String> getTextureArtists() {
        return textureArtists;
    }

    public Map<String, Set<String>> getAnimatorsPerAnimation() {
        return animatorsPerAnimation;
    }

    public Map<String, Set<String>> getAnimatorsPerOptionalAnimation() {
        return animatorsPerOptionalAnimation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(modelers.size()==1 && textureArtists.size()==1 && modelers.getFirst().equalsIgnoreCase(textureArtists.getFirst())) {
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

    private void getAnimatorsForAnimations(StringBuilder sb, Map<String, Set<String>> animatorsPerOptionalAnimation) {
        for (Map.Entry<String, Set<String>> entry : animatorsPerOptionalAnimation.entrySet()) {
            String animName = entry.getKey();
            Set<String> animators = entry.getValue();
            sb.append(" - ").append(animName).append(": ");
            if (animators != null && !animators.isEmpty()) {
                sb.append(String.join(", ", animators));
            } else {
                sb.append("Unknown");
            }
            sb.append("\n");
        }
    }
}
