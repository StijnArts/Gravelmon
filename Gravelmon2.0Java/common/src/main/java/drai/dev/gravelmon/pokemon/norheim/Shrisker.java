package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Shrisker extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shrisker() {
        super("Shrisker",
                Type.GRASS,Type.ELECTRIC,
                new Stats(80,
                        58,
                        50,
                        80,
                        78,
                        82),
                List.of(Ability.STATIC,Ability.CHLOROPHYLL,Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Tackle Normal - AbsorbSTAB Grass - Growl Normal - Tail Whip Normal 5 Thunder ShockSTAB Electric 8 Cotton Spore Grass 11 Quick Attack Normal 15 Growth Normal 18 Tail Slap Normal 23 NuzzleSTAB Electric 27 Razor LeafSTAB Grass 31 Leech Seed Grass 35 Thunder Wave Electric 40 Giga DrainSTAB Grass 45 Cotton Guard Grass 52 Solar BeamSTAB Grass 60 Volt TackleSTAB Electric"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,11),
                        new MoveLearnSetEntry(Move.GROWTH,15),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,18),
                        new MoveLearnSetEntry(Move.NUZZLE,23),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,31),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,35),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,40),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,45),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,52),
                        new MoveLearnSetEntry(Move.VOLT_TACKLE,60),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"tm"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shrisker");

    }


}
