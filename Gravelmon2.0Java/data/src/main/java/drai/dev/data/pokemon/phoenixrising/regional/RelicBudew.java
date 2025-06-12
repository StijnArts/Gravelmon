package drai.dev.data.pokemon.phoenixrising.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class RelicBudew extends Pokemon {
    public RelicBudew(String name, Aspect aspect) {
        super(name, aspect,"RelicBudew",
                Type.FAIRY,
                new Stats(35, 55, 50, 40, 30, 70),
                List.of(Ability.TRACE, Ability.JUSTIFIED), Ability.HUSTLE,
                9, 130,
                new Stats(0,1,0,0,0,0), 83,
                0.875,
                56, ExperienceGroup.MEDIUM_SLOW,
                70,
                51, List.of(EggGroup.UNDISCOVERED),
                List.of("Relic Budew appreciates the traditional aspects of warfare, and despite its young age, enjoys an entertaining duel. It claps on the victor using the buds on its head."),
                List.of(new EvolutionEntry("relicroselia", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"160")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,5),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,10),
                        new MoveLearnSetEntry(Move.MAT_BLOCK,14),
                        new MoveLearnSetEntry(Move.FORCE_PALM,23),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.COVET,"egg"),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,"egg"),
                        new MoveLearnSetEntry(Move.DETECT,"egg"),
                        new MoveLearnSetEntry(Move.FEINT,"egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"egg"),
                        new MoveLearnSetEntry(Move.PRESENT,"egg"),
                        new MoveLearnSetEntry(Move.REVENGE,"egg"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg")
                        ),
                List.of(Label.PHOENIX_RISING, Label.GEN4),
                0, List.of(),
                new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setAntiBiomes(Biome.IS_FLORAL)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Budew");

    }
}
