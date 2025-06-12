package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Quecko extends Pokemon {
    public Quecko() {
        super("Quecko",
                Type.GRASS,
                new Stats(58, 65, 47, 65, 55, 85),
                List.of(Ability.LEAF_GUARD, Ability.OVERGROW), Ability.WONDER_SKIN,
                9, 199,
                new Stats(0,0,0,0,0,1), 45,
                0.5,
                75, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.DRAGON, EggGroup.GRASS),
                List.of("Quecko is hard to find and catch; this makes it very sought after not only by trainers, but also by healers who use its leaves to make medicine."),
                List.of(new EvolutionEntry("tozecko", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"43")))),
                List.of(
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.GLARE,10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.LEAF_SHIELD,19),
                        new MoveLearnSetEntry(Move.POISON_FANG,24),
                        new MoveLearnSetEntry(Move.GROWTH,29),
                        new MoveLearnSetEntry(Move.TEMPEST,33),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,38),
                        new MoveLearnSetEntry(Move.AGILITY,43),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,47),
                        new MoveLearnSetEntry(Move.VENOSHOCK,52),
                        new MoveLearnSetEntry(Move.COIL,57),
                        new MoveLearnSetEntry(Move.LEAF_STORM,61),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"egg"),
                        new MoveLearnSetEntry(Move.GROWTH,"egg"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"egg"),
                        new MoveLearnSetEntry(Move.ROOST,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:seeds",50, 1,2)
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
