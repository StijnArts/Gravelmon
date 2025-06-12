package drai.dev.data.pokemon.umbra;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Spidoux extends Pokemon {
    public Spidoux() {
        super("Spidoux",
                Type.BUG, Type.POISON,
                new Stats(30,
                        60,
                        40,
                        40,
                        50,
                        50),
                List.of(Ability.POISON_TOUCH), Ability.POISON_POINT,
                2, 38,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                54, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Countless foragers of Vereshad have succumbed to Spidoux's poison after mistaking its abdomen for a Pecha Berry."),
                List.of(new EvolutionEntry("aracide", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.SPIDER_WEB, "")),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,5),
                        new MoveLearnSetEntry(Move.LEAFAGE,7),
                        new MoveLearnSetEntry(Move.INFESTATION,11),
                        new MoveLearnSetEntry(Move.BUG_BITE,13),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,17),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,19),
                        new MoveLearnSetEntry(Move.POISON_FANG,23),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,25),
                        new MoveLearnSetEntry(Move.TOXIC,29),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,31),
                        new MoveLearnSetEntry(Move.VENOSHOCK,35),
                        new MoveLearnSetEntry(Move.STICKY_WEB,37),
                        new MoveLearnSetEntry(Move.POISON_JAB,41),
                        new MoveLearnSetEntry(Move.LEAF_STORM,45),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tutor"),
                        new MoveLearnSetEntry(Move.BIND,"tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor")
                        ),
                List.of(Label.UMBRA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(2)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_BERRY_BUSH)
    .build(), List.of());
	
    }
}
