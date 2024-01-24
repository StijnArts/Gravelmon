package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Chopteran extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chopteran() {
        super("Chopteran",
                Type.BUG,Type.FLYING,
                new Stats(135,
                        80,
                        70,
                        100,
                        55,
                        80),
                List.of(Ability.AERILATE), Ability.AERILATE,
                8, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                182, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It perfected its flight ability to the point it never needs to land. When asleep it gracefully hovers high in the air."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.FLAIL,5),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,15),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,25),
                        new MoveLearnSetEntry(Move.AIR_SLASH,35),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,40),
                        new MoveLearnSetEntry(Move.AGILITY,45),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,50),
                        new MoveLearnSetEntry(Move.TAILWIND,55),
                        new MoveLearnSetEntry(Move.BOOMBURST,60)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chopteran");

    }


}
