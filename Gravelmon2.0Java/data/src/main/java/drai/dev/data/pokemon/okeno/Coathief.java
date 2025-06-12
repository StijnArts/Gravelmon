package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Coathief extends drai.dev.data.pokemon.Pokemon {
    public Coathief() {
        super("Coathief",
                Type.DARK,
                new Stats(34,
                        53,
                        32,
                        26,
                        32,
                        71),
                List.of(Ability.PICKUP,Ability.PICKPOCKET,Ability.HUSTLE), Ability.HUSTLE,
                7, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                44, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Coathief form packs that live in the woods. At night, they run rampage and invade the nearest city or town, stealing food and items from any Pokemon or trainer they encounter."),
                List.of(new EvolutionEntry("darskarf", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.PESTER,4),
                        new MoveLearnSetEntry(Move.THIEF,8),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,11),
                        new MoveLearnSetEntry(Move.WORK_UP,14),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,17),
                        new MoveLearnSetEntry(Move.SLAM,20),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,23),
                        new MoveLearnSetEntry(Move.PURSUIT,26),
                        new MoveLearnSetEntry(Move.BEAT_UP,29),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,32),
                        new MoveLearnSetEntry(Move.SNATCH,34),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,37),
                        new MoveLearnSetEntry(Move.SWITCHEROO,40),
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Coathief");

    }


}
