package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Blobhorent extends drai.dev.gravelmon.pokemon.Pokemon {
    public Blobhorent() {
        super("Blobhorent",
                Type.WATER,
                new Stats(140,
                        75,
                        90,
                        75,
                        60,
                        25),
                List.of(Ability.CUTE_CHARM,Ability.SWIFT_SWIM, Ability.THICK_FAT), Ability.THICK_FAT,
                13, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Many sailors have found themselves irresistibly drawn to Blobhorent, obsessing over it for weeks afterwards. It has earned the nickname the Sea Hag."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.SLACK_OFF,28),
                        new MoveLearnSetEntry(Move.ACROBATICS,33),
                        new MoveLearnSetEntry(Move.LOVELY_KISS,38),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,44),
                        new MoveLearnSetEntry(Move.BRINE,47),
                        new MoveLearnSetEntry(Move.BATON_PASS,52),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,57),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,64)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 24, 42, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
