package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fauxian extends drai.dev.data.pokemon.Pokemon {
    public Fauxian() {
        super("oxboy",
                Type.GRASS, Type.FIGHTING,
                new Stats(69,
                        86,
                        80,
                        55,
                        65,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Tackle Normal - Growl Normal 5 Vine WhipSTAB Grass 8 Leech Seed Grass 11 Growth Normal 15 Double KickSTAB Fighting 18 Headbutt Normal 22 Swagger Normal 25 Bulldoze Ground 29 Giga DrainSTAB Grass 33 Bulk Up Fighting 40 Horn LeechSTAB Grass 43 Body Slam Normal 48 Wood HammerSTAB Grass"),
                List.of(new EvolutionEntry("Sylvotaur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.LEECH_SEED,8),
                        new MoveLearnSetEntry(Move.GROWTH,11),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,15),
                        new MoveLearnSetEntry(Move.HEADBUTT,18),
                        new MoveLearnSetEntry(Move.SWAGGER,22),
                        new MoveLearnSetEntry(Move.BULLDOZE,25),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,29),
                        new MoveLearnSetEntry(Move.BULK_UP,33),
                        new MoveLearnSetEntry(Move.HORN_LEECH,40),
                        new MoveLearnSetEntry(Move.BODY_SLAM,43),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,48)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());

    }


}
