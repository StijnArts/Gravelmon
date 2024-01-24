package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Metamarine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Metamarine() {
        super("Metamarine",
                Type.WATER,Type.STEEL,
                new Stats(90,
                        70,
                        130,
                        170,
                        140,
                        80),
                List.of(Ability.MEGA_LAUNCHER), Ability.MEGA_LAUNCHER,
                8, 165,
                new Stats(0,0,0,2,1,0), 25,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Metamarine lurks beneath the deep oceans and in the deepest marinas, emitting an eerie blue glow that somehow shines to the surface of the sea. Those that see this glow flee, as it is an omen of tsunamis and terrible storms to come. The cannon on it's back is capable of obliterating nearly anything in it's path."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ORIGIN_PULSE,1)                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Metamarine");

    }


}
