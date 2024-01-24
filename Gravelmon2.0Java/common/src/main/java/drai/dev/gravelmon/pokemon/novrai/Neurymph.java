package drai.dev.gravelmon.pokemon.novrai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Neurymph extends drai.dev.gravelmon.pokemon.Pokemon {
    public Neurymph() {
        super("Neurymph",
                Type.BUG,
                new Stats(35,
                        20,
                        40,
                        40,
                        45,
                        30),
                List.of(Ability.UNNERVE,Ability.TELEPATHY,Ability.RATTLED), Ability.RATTLED,
                8, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                42, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It sends signals to others by emitting subtle psychic pulses. Neurymph eggs are commonly laid upon the back of a Cascarapace."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,1),
                        new MoveLearnSetEntry(Move.FLAIL,5),
                        new MoveLearnSetEntry(Move.BUG_BITE,15)                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Neurymph");

    }


}
