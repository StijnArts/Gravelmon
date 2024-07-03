package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Christrap extends drai.dev.gravelmon.pokemon.Pokemon {
    public Christrap() {
        super("Christrap",
                Type.ICE, Type.POISON,
                new Stats(120,
                        100,
                        65,
                        100,
                        75,
                        40),
                List.of(Ability.ARENA_TRAP,Ability.SNOW_CLOAK,Ability.SNOW_WARNING), Ability.SNOW_WARNING,
                17, 165,
                new Stats(2,0,0,2,0,0), 110,
                0.75,
                174, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("It gets buried in snow when winter comes along, its tree-shaped lure poking out. If something lands on the loose snow filling its cavernous mouth, they fall in and get digested almost instantly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,6),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,10),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,13),
                        new MoveLearnSetEntry(Move.SLUDGE,16),
                        new MoveLearnSetEntry(Move.DIG,19),
                        new MoveLearnSetEntry(Move.ICE_SHARD,23),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,24),
                        new MoveLearnSetEntry(Move.POISON_JAB,28),
                        new MoveLearnSetEntry(Move.CRUNCH,32),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,36),
                        new MoveLearnSetEntry(Move.BODY_SLAM,40),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,45),
                        new MoveLearnSetEntry(Move.BLIZZARD,52),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,60)                        ),
                List.of(Label.ENRIKO, Label.JOKE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 25, 52, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Christrap");

    }


}
