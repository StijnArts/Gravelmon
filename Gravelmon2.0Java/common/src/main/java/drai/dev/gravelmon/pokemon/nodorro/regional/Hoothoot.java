package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Hoothoot extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hoothoot(int dex) {
        super(dex, "Hoothoot",
                Type.DARK, Type.FLYING,
                new Stats(50,
                        30,
                        40,
                        52,
                        30,
                        60),
                List.of(Ability.OWN_TEMPO,Ability.KEEN_EYE), Ability.UNAWARE,
                8, 210,
                new Stats(0,0,0,1,0,0), 255,
                0.75,
                52, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Hoothoot has a passion for serving people, its often seen in the housekeep of rich families. Hoothoot are extremely loyal and won't leave the mansion even once."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.PECK,5),
                        new MoveLearnSetEntry(Move.HYPNOSIS,8),
                        new MoveLearnSetEntry(Move.PURSUIT,10),
                        new MoveLearnSetEntry(Move.HAZE,11),
                        new MoveLearnSetEntry(Move.HELPING_HAND,14),
                        new MoveLearnSetEntry(Move.REFLECT,18),
                        new MoveLearnSetEntry(Move.WING_ATTACK,20),
                        new MoveLearnSetEntry(Move.ROOST,25),
                        new MoveLearnSetEntry(Move.ASSURANCE,27),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,31),
                        new MoveLearnSetEntry(Move.AIR_SLASH,36),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,45),
                        new MoveLearnSetEntry(Move.TAUNT,48),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.NIGHTMARE,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hoothoot");

    }


}
