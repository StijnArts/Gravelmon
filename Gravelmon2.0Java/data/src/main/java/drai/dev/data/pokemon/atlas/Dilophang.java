package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Dilophang extends drai.dev.data.pokemon.Pokemon {
    public Dilophang() {
        super("Dilophang",
                Type.POISON,
                new Stats(34,
                        61,
                        45,
                        73,
                        64,
                        43),
                List.of(Ability.INTIMIDATE,Ability.POISON_TOUCH,Ability.CORROSION), Ability.CORROSION,
                4, 165,
                new Stats(0,0,0,1,0,0), 100,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("dilophright", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.GASTRO_ACID,1),
                        new MoveLearnSetEntry(Move.ACID,4),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,13),
                        new MoveLearnSetEntry(Move.POISON_TAIL,18),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,24),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,29),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,34),
                        new MoveLearnSetEntry(Move.CRUNCH,38),
                        new MoveLearnSetEntry(Move.POISONBURST,43),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,47),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,52),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,56),
                        new MoveLearnSetEntry(Move.OUTRAGE,60),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.POISONBURST,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Dilophang");

    }


}
