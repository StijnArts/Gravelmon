package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Peritwinkle extends drai.dev.data.pokemon.Pokemon {
    public Peritwinkle() {
        super("Peritwinkle",
                Type.BUG,
                new Stats(30,
                        33,
                        32,
                        33,
                        55,
                        42),
                List.of(Ability.INSOMNIA,Ability.SWEET_VEIL,Ability.PRANKSTER), Ability.PRANKSTER,
                5, 165,
                new Stats(0,0,0,0,1,0), 145,
                0.5,
                44, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It produces a soft and gentle light said to bring pleasant dreams and a full nights sleep, children often use it as a night light."),
                List.of(new EvolutionEntry("illumise", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female"))),
                        new EvolutionEntry("volbeat", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male")))),
                List.of(
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,5),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,12),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,15),
                        new MoveLearnSetEntry(Move.MOONLIGHT,19),
                        new MoveLearnSetEntry(Move.TAIL_GLOW,22),
                        new MoveLearnSetEntry(Move.ENCORE,26),
                        new MoveLearnSetEntry(Move.FLATTER,29),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,33),
                        new MoveLearnSetEntry(Move.HELPING_HAND,36),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,40),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,43),
                        new MoveLearnSetEntry(Move.COVET,47),
                        new MoveLearnSetEntry(Move.INFESTATION,50)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .canSeeSky()
    .atNight()
    .isRaining()
    .setSpawnPreset(SpawnPreset.FRESHWATER, SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Peritwinkle");
setCanFly(true);
    }


}
