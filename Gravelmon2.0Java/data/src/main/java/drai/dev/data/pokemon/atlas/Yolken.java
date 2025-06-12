package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Yolken extends drai.dev.data.pokemon.Pokemon {
    public Yolken() {
        super("Yolken",
                Type.NORMAL,
                new Stats(52,
                        60,
                        30,
                        35,
                        30,
                        53),
                List.of(Ability.FIERYSPIRIT,Ability.CUTE_CHARM), Ability.RATTLED,
                7, 165,
                new Stats(0,1,0,0,0,0), 235,
                0.5,
                52, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Yolken live very close to one another to constantly exchange body heat, as they hate being cold. The orange marking on its stomach darkens as it gets closer to evolution."),
                List.of(new EvolutionEntry("roostegg", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.CHIRP,3),
                        new MoveLearnSetEntry(Move.PECK,6),
                        new MoveLearnSetEntry(Move.COPYCAT,10),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,14),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,17),
                        new MoveLearnSetEntry(Move.CHARM,21),
                        new MoveLearnSetEntry(Move.FACADE,25),
                        new MoveLearnSetEntry(Move.TAUNT,30),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,34),
                        new MoveLearnSetEntry(Move.BODY_SLAM,39),
                        new MoveLearnSetEntry(Move.UPROAR,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,47),
                        new MoveLearnSetEntry(Move.WISH,54),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SANDSHOT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SOFTBOILED,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Yolken");

    }


}
