package drai.dev.gravelmon.pokemon.orbis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Wynaut extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wynaut() {
        super("Wynaut",
                Type.PSYCHIC,
                new Stats(95,
                        23,
                        48,
                        23,
                        48,
                        23),
                List.of(Ability.SHADOW_TAG), Ability.TELEPATHY,
                6, 140,
                new Stats(1,0,0,0,0,0), 125,
                0.5,
                52, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Wynaut gather on moonlit nights to play by squeezing up against each other. By being squeezed, this Pokémon gains endurance and is trained to dole out powerful counterattacks."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENCORE,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,15),
                        new MoveLearnSetEntry(Move.SAFEGUARD,15),
                        new MoveLearnSetEntry(Move.COUNTER,15),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,15),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wynaut");

    }


}
