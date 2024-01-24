package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Flantern extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flantern() {
        super("Flantern",
                Type.FIRE,Type.BUG,
                new Stats(55,
                        65,
                        58,
                        74,
                        48,
                        70),
                List.of(Ability.IGNITION), Ability.IGNITION,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.AMORPHOUS),
                List.of("Barrage Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BARRAGE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flantern");

    }


}
