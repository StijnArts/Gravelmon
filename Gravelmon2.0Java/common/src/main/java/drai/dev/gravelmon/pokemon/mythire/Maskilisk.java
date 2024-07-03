package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Maskilisk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Maskilisk() {
        super("Maskilisk",
                Type.DRAGON,
                new Stats(60,
                        85,
                        60,
                        60,
                        75,
                        65),
                List.of(Ability.STEADFAST,Ability.SCRAPPY,Ability.ROCK_HEAD), Ability.ROCK_HEAD,
                17, 165,
                new Stats(0,2,0,0,0,0), 125,
                0.5,
                142, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("A mysterious Pokemon that lives in the woods, a covering of feathers keeps it warm in the winter months. There are stories of a human child that was raised by these Pokemon as one of their own."),
                List.of(new EvolutionEntry("maskrusher", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.SKULL_BASH,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,1),
                        new MoveLearnSetEntry(Move.SOLID_KICK,1),
                        new MoveLearnSetEntry(Move.REVERSAL,1),
                        new MoveLearnSetEntry(Move.DETECT,1),
                        new MoveLearnSetEntry(Move.FORESIGHT,1),
                        new MoveLearnSetEntry(Move.SLAM,1),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,1),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,1),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,1),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,1),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.BERSERK_FURY,1),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.JUMPSCARE,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 37, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maskilisk");

    }


}
