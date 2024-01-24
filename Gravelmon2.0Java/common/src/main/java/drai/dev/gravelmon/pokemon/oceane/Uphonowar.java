package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Uphonowar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Uphonowar() {
        super("Uphonowar",
                Type.PSYCHIC,
                new Stats(85,
                        65,
                        65,
                        140,
                        100,
                        55),
                List.of(Ability.LEVITATE), Ability.ANALYTIC,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                230, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Upon evolving, they're drawn deep into the abyss. Some believe there is a signal calling to them, but the source has never been discovered. Entire colonies have been discovered moving the same way as if controlled by single host."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TELEKINESIS,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Uphonowar");

    }


}
