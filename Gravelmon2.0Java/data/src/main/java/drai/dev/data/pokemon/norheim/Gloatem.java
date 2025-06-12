package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Gloatem extends drai.dev.data.pokemon.Pokemon {
    public Gloatem() {
        super("Gloatem",
                Type.FIGHTING, Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.INNER_FOCUS,Ability.SAND_SPIT,Ability.SCRAPPY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Gloatem usually stand incredibly still, waiting for the target to attack. Its moustache like arms can pack a real swing and punch."),
                List.of(new EvolutionEntry("aydoliman", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.AFTER_YOU,8),
                        new MoveLearnSetEntry(Move.MAGNITUDE,16),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,20),
                        new MoveLearnSetEntry(Move.MEDITATE,24),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,29),
                        new MoveLearnSetEntry(Move.AMNESIA,35),
                        new MoveLearnSetEntry(Move.REVERSAL,40),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,45),
                        new MoveLearnSetEntry(Move.EARTH_POWER,55)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Gloatem");

    }


}
