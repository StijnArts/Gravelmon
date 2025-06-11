package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Darskarf extends drai.dev.data.pokemon.Pokemon {
    public Darskarf() {
        super("Darskarf",
                Type.DARK,
                new Stats(70,
                        94,
                        58,
                        62,
                        58,
                        106),
                List.of(Ability.PICKUP,Ability.PICKPOCKET,Ability.HUSTLE), Ability.HUSTLE,
                12, 165,
                new Stats(0,0,0,0,0,2), 127,
                0.5,
                147, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("If your mail never arrives, it might be Darskarf's fault! They are known to steal packages to try and find shiny objects. Sometimes, they will loot eachother's stashes and start fighting."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COIL,1),
                        new MoveLearnSetEntry(Move.PESTER,4),
                        new MoveLearnSetEntry(Move.THIEF,8),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,11),
                        new MoveLearnSetEntry(Move.WORK_UP,14),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,17),
                        new MoveLearnSetEntry(Move.SLAM,20),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,24),
                        new MoveLearnSetEntry(Move.PURSUIT,27),
                        new MoveLearnSetEntry(Move.BEAT_UP,31),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,36),
                        new MoveLearnSetEntry(Move.SNATCH,41),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,45),
                        new MoveLearnSetEntry(Move.SWITCHEROO,50),
                        new MoveLearnSetEntry(Move.TEAMUP,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.POWER_TRIP,"tm"),
                        new MoveLearnSetEntry(Move.POISON_TAIL,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(22)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Darskarf");

    }


}
