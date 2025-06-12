package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanComfey extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanComfey(String name, Aspect aspect) {
        super(name, aspect, "Comfey",
                Type.GRASS,Type.PSYCHIC,
                new Stats(80,
                        50,
                        90,
                        105,
                        120,
                        110),
                List.of(Ability.SOLAR_POWER,Ability.DROUGHT), null,
                1, 3,
                new Stats(0,0,0,0,2,0), 60,
                0.0,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Prende flores en su tallo, que es muy rico en nutrientes. Las flores se revitalizan y desprenden una agradable fragancia."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_SEED,4),
                        new MoveLearnSetEntry(Move.WRAP,16),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,40),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,1),
                        new MoveLearnSetEntry(Move.CALM_MIND,52),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,10),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,7),
                        new MoveLearnSetEntry(Move.SILA,37),
                        new MoveLearnSetEntry(Move.PSYCHIC,36),
                        new MoveLearnSetEntry(Move.LUSTER_PURGE,30),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,25),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,33),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,31),
                        new MoveLearnSetEntry(Move.CONFUSION,18),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,43),
                        new MoveLearnSetEntry(Move.GROWTH,13),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.SYNTHESIS,28),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,34),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,46),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,49),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,22),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.AMNESIA,"egg"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"egg"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"egg")                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TROPICAL, Biome.IS_JUNGLE, Biome.IS_DENSE)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Comfey");

    }


}
