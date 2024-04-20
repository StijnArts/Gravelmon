package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Aydoliman extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aydoliman() {
        super("Aydoliman",
                Type.FIGHTING, Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.INNER_FOCUS,Ability.SAND_SPIT,Ability.SCRAPPY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A slow mobile idol depicting fallen heroes of great battles. Aydoliman guards entrances of holy buildings, prepared to strike with its large fists of hardened clay. It is capable of throwing its opponents at incredible distances."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VITAL_THROW,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aydoliman");

    }


}
