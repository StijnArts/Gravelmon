package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Molit extends drai.dev.data.pokemon.Pokemon {
    public Molit() {
        super("Molit",
                Type.NORMAL,
                new Stats(45,
                        25,
                        50,
                        45,
                        55,
                        40),
                List.of(Ability.ILLUMINATE), Ability.ILLUMINATE,
                7, 61,
                new Stats(0,0,0,0,1,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("'Molite's nascent light powers only allow it to emit a weak glow to call for help when in danger.'"),
                List.of(new EvolutionEntry("luminose", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,7),
                        new MoveLearnSetEntry(Move.CONFUSION,12),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,17),
                        new MoveLearnSetEntry(Move.ASSIST,23),
                        new MoveLearnSetEntry(Move.PSYBEAM,26),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,29),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,32),
                        new MoveLearnSetEntry(Move.PSIBULLET,36),
                        new MoveLearnSetEntry(Move.CAPTIVATE,39),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,43),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,47),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,53)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Molit");

    }


}
