package drai.dev.gravelmon.pokemon.urzavos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Brrbear extends drai.dev.gravelmon.pokemon.Pokemon {
    public Brrbear() {
        super("Brrbear",
                Type.ICE,Type.ELECTRIC,
                new Stats(60,
                        40,
                        70,
                        60,
                        70,
                        30),
                List.of(Ability.FLUFFY,Ability.KLUTZ), Ability.RUN_AWAY,
                7, 181,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Young Brrbear have an abundance of fluff to the point where they must roll around. As they grow older they lose their fur, which is highly prized coat stuffing."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1)                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Brrbear");

    }


}
