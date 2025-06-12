package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Witherscence extends drai.dev.data.pokemon.Pokemon {
    public Witherscence() {
        super("Witherscence",
                Type.PSYCHIC, Type.GRASS,
                new Stats(120,
                        50,
                        65,
                        100,
                        120,
                        60),
                List.of(Ability.COTTON_DOWN,Ability.REGENERATOR,Ability.HEATPROOF), Ability.HEATPROOF,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,1)   ,
                        new MoveLearnSetEntry(Move.COTTON_SPORE,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,12),
                        new MoveLearnSetEntry(Move.ROUND,16),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,23),
                        new MoveLearnSetEntry(Move.SYNTHESIS,28),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,34),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,40),
                        new MoveLearnSetEntry(Move.LEAF_STORM,46),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,52),
                        new MoveLearnSetEntry(Move.GROWTH,"egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"egg"),
                        new MoveLearnSetEntry(Move.POISON_POWDER,"egg"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"egg"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"egg"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,"tm")
                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(35)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL, Biome.IS_MAGICAL, Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Witherscence");
        addAdditionalEvolution("eldegoss", new EvolutionEntry("witherscence", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,Biome.IS_AUTUMN.getId() + ":" + Biome.IS_AUTUMN.getName()))));

    }


}
