package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Eoterra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eoterra() {
        super("Eoterra",
                Type.ROCK,
                new Stats(65,
                        120,
                        80,
                        80,
                        70,
                        100),
                List.of(Ability.SOUNDPROOF,Ability.SAND_STREAM,Ability.REGENERATOR), Ability.REGENERATOR,
                20, 165,
                new Stats(0,2,1,0,0,0), 45,
                0.5,
                232, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Eoterra's body withers easily and then grows back by regenerating itself. Swiftly they roam the volcanic deserts of Norheim. Their bodies are completely hollow and are covered in different rocks."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,9),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,13),
                        new MoveLearnSetEntry(Move.UPROAR,16),
                        new MoveLearnSetEntry(Move.SCREECH,19),
                        new MoveLearnSetEntry(Move.PURSUIT,21),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,25),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,29),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,34),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,39),
                        new MoveLearnSetEntry(Move.RETALIATE,43),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,54)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 41, 54, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eoterra");

    }


}
