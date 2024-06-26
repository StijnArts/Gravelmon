package drai.dev.gravelmon.pokemon.norheim.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class NorheimanDitto extends drai.dev.gravelmon.pokemon.Pokemon {
    public NorheimanDitto(String name, Aspect aspect) {
        super(name, aspect, "Ditto",
                Type.ICE,
                new Stats(68,
                        48,
                        58,
                        88,
                        78,
                        28),
                List.of(Ability.IMPOSTER,Ability.ICE_BODY,Ability.CLEAR_BODY), Ability.CLEAR_BODY,
                3, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Found in glacier caves and among permafrost deep in the ground. Norheiman Ditto may contain DNA from the Great Snowfall, an age when Norheim froze over. Scientists believe that this peculiar Ditto has been able to learn different powers from its surroundings by surviving over a very long time."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.FROST_BREATH,11),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,21),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,31),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,41),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,51),
                        new MoveLearnSetEntry(Move.SHEER_COLD,61)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 4, 29, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ditto");

    }


}
