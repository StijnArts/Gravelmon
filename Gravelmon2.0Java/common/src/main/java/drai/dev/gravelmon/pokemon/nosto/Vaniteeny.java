package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Vaniteeny extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vaniteeny() {
        super("Vaniteeny",
                Type.GHOST,Type.FAIRY,
                new Stats(67,
                        73,
                        52,
                        47,
                        33,
                        34),
                List.of(Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.25,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Vaniteeny are very shy and will not move in the presence of another being. They stand very still on all 4 of their legs."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,1),
                        new MoveLearnSetEntry(Move.TACKLE,6),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,10),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,14),
                        new MoveLearnSetEntry(Move.METAL_SOUND,19),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,22),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,32),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,37),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,42)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vaniteeny");

    }


}
