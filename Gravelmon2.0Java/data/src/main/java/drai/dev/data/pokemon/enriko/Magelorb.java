package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Magelorb extends drai.dev.data.pokemon.Pokemon {
    public Magelorb() {
        super("Magelorb",
                Type.FAIRY,
                new Stats(45,
                        75,
                        60,
                        20,
                        50,
                        30),
                List.of(Ability.DAZZLING,Ability.DANCER,Ability.MULTISCALE), Ability.MULTISCALE,
                8, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Magelorb float in the sky, casting lights down below. They can be attracted to the ground by bright, flashing lights."),
                List.of(new EvolutionEntry("discobrawl", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.FLASH_CANNON.getName())))),
                List.of(
                        new MoveLearnSetEntry(Move.TRICK_ROOM,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,5),
                        new MoveLearnSetEntry(Move.FLASH,7),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,10),
                        new MoveLearnSetEntry(Move.METAL_CLAW,14),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,18),
                        new MoveLearnSetEntry(Move.MOONLIGHT,22),
                        new MoveLearnSetEntry(Move.FORCE_PALM,26),
                        new MoveLearnSetEntry(Move.ROLLOUT,30),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,37),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,39)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .cantSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Magelorb");

    }


}
