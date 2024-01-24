package drai.dev.gravelmon.pokemon.aristos.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class AristosianArcanine extends drai.dev.gravelmon.pokemon.Pokemon {
    public AristosianArcanine() {
        super("Arcanine",
                Type.ICE,Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.INTIMIDATE,Ability.SNOW_CLOAK,Ability.SLUSH_RUSH), Ability.SLUSH_RUSH,
                8, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.75,
                194, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Legend says it can sense anyone who wanders the mountains it lives in. When Arcanine senses evil intentions it roars frightfully to bring heavy snowstorms."),
                List.of(),
                List.of(                        ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Arcanine");

    }


}
