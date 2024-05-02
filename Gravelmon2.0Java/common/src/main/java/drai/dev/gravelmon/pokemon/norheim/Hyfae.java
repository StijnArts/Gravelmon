package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Hyfae extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hyfae() {
        super("Hyfae",
                Type.GRASS, Type.FAIRY,
                new Stats(125,
                        65,
                        65,
                        130,
                        80,
                        50),
                List.of(Ability.CHLOROPHYLL,Ability.SOUNDPROOF,Ability.PIXILATE), Ability.PIXILATE,
                21, 165,
                new Stats(1,0,0,2,0,0), 75,
                0.5,
                232, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of("Not even the greatest vocal coach can learn its song techniques. It is a wonder that this Pokemon can produce sound at all; while having such a long neck."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,7),
                        new MoveLearnSetEntry(Move.UPROAR,10),
                        new MoveLearnSetEntry(Move.GROWTH,14),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,19),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,24),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,28),
                        new MoveLearnSetEntry(Move.ENCORE,34),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,38),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,44),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,46),
                        new MoveLearnSetEntry(Move.SYNTHESIS,50),
                        new MoveLearnSetEntry(Move.BOOMBURST,58)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 41, 56, .07, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hyfae");

    }


}
