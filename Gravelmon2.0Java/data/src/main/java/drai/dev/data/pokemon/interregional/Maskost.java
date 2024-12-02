package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Maskost extends drai.dev.data.pokemon.Pokemon {
    public Maskost() {
        super("Maskost",
                Type.GHOST,
                new Stats(90,
                        40,
                        60,
                        55,
                        75,
                        20),
                List.of(Ability.CURSED_BODY), Ability.MAGIC_BOUNCE,
                4, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("tomaskost", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))
                ),
                List.of(         new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.SCREECH,4),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,7),
                        new MoveLearnSetEntry(Move.SPITE,10),
                        new MoveLearnSetEntry(Move.WILLOWISP,16),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,19),
                        new MoveLearnSetEntry(Move.HEX,22),
                        new MoveLearnSetEntry(Move.CURSE,26),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,30),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,34),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,38),
                        new MoveLearnSetEntry(Move.TRICK,42),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,48)),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maskost");

    }


}
