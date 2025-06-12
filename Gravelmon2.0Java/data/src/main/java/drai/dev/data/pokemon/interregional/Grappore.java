package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Grappore extends drai.dev.data.pokemon.Pokemon {
    public Grappore() {
        super("Grappore",
                Type.GROUND,
                new Stats(55,
                        100,
                        90,
                        80,
                        50,
                        80),
                List.of(Ability.SAND_FORCE), Ability.STEELWORKER,
                17, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.SCRATCH,8),
                        new MoveLearnSetEntry(Move.SAND_TOMB,11),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,15),
                        new MoveLearnSetEntry(Move.MAGNITUDE,19),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,22),
                        new MoveLearnSetEntry(Move.DIG,26),
                        new MoveLearnSetEntry(Move.SANDSTORM,30),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,33),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,37),
                        new MoveLearnSetEntry(Move.BULLDOZE,41),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,44),
                        new MoveLearnSetEntry(Move.IRON_HEAD,48),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,52),
                        new MoveLearnSetEntry(Move.COIL,55),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,59)
                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(29)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Grappore");

    }


}
