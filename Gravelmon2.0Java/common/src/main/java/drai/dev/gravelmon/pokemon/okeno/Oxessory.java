package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Oxessory extends drai.dev.gravelmon.pokemon.Pokemon {
    public Oxessory() {
        super("Oxessory",
                Type.GHOST,Type.PSYCHIC,
                new Stats(70,
                        66,
                        60,
                        80,
                        114,
                        75),
                List.of(Ability.RIVALRY), Ability.COMPETITIVE,
                8, 165,
                new Stats(0,0,1,0,1,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.AMORPHOUS),
                List.of("- LickSTAB Ghost 30 Shadow Dance Ghost"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.SHADOWDANCE,30)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Oxessory");

    }


}
