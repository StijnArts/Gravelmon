package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Flurse extends drai.dev.data.pokemon.Pokemon {
    public Flurse() {
        super("Flurse",
                Type.NORMAL, Type.GROUND,
                new Stats(60,
                        50,
                        55,
                        35,
                        45,
                        40),
                List.of(Ability.SUPER_LUCK), Ability.SUPER_LUCK,
                5, 165,
                new Stats(1,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("elvile", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19")))),
                List.of(
                        new MoveLearnSetEntry(Move.PIN_MISSILE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.MUD_SPORT,8),
                        new MoveLearnSetEntry(Move.MUD_SHOT,14),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,17),
                        new MoveLearnSetEntry(Move.THIEF,20),
                        new MoveLearnSetEntry(Move.SPIKES,25),
                        new MoveLearnSetEntry(Move.SLASH,29),
                        new MoveLearnSetEntry(Move.FLAIL,32),
                        new MoveLearnSetEntry(Move.RETURN,37),
                        new MoveLearnSetEntry(Move.EARTH_POWER,40),
                        new MoveLearnSetEntry(Move.BITE,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ME_FIRST,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Flurse");

    }


}
