package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cobworm extends drai.dev.data.pokemon.Pokemon {
    public Cobworm() {
        super("Cobworm",
                Type.BUG,
                new Stats(60,
                        65,
                        85,
                        45,
                        50,
                        55),
                List.of(Ability.SHED_SKIN,Ability.SHIELD_DUST,Ability.SHELL_ARMOR), Ability.SHELL_ARMOR,
                6, 165,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                126, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("When Hoppiler gets caught in a web, it evolves into a form with a hard outer shell to protect itself. Cobworm uses the net as a thick shield against attacking Pokemon."),
                List.of(new EvolutionEntry("hoppereign", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,15),
                        new MoveLearnSetEntry(Move.PROTECT,18),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,23),
                        new MoveLearnSetEntry(Move.FLAIL,28),
                        new MoveLearnSetEntry(Move.BUG_BITE,34),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.THREADLASH,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,"tm"),
                        new MoveLearnSetEntry(Move.PESTER,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(15)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cobworm");

    }


}
