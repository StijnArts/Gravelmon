package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Fupi extends Pokemon {
    public Fupi() {
        super( "Fupi",
                Type.GRASS, Type.STEEL,
                new Stats(58	,29	,60	,68	,40	,61),
                List.of(Ability.FLOWER_GIFT), Ability.SOLAR_POWER,
                5, 325,
                new Stats(0,0,0,1,0,0), 160,
                0.5,
                167, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("fupyan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,3),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,9),
                        new MoveLearnSetEntry(Move.CHARM,12),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,15),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,18),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,21),
                        new MoveLearnSetEntry(Move.LEECH_SEED,24),
                        new MoveLearnSetEntry(Move.AFTER_YOU,27),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,30),
                        new MoveLearnSetEntry(Move.SYNTHESIS,33),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,36),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,39),
                        new MoveLearnSetEntry(Move.LEAF_STORM,42),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.HEALING_WISH,"egg"),
                        new MoveLearnSetEntry(Move.INGRAIN,"egg"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,"egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(2)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
