package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranUrsaring extends Pokemon {
    public CefiranUrsaring(String name, Aspect aspect) {
        super(name, aspect,"CefiranUrsaring",
                Type.DARK,
                new Stats(90,125,55,95,70,75),
                List.of(Ability.GUTS, Ability.INTIMIDATE), Ability.UNNERVE,
                18, 1258,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("In forests, it is said that there are many streams and towering trees where an Ursaring gathers food. It walks through its forest collecting food every day."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COVET, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.LEER, 1),
                        new MoveLearnSetEntry(Move.LICK, 1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, 1),
                        new MoveLearnSetEntry(Move.FURY_SWIPES, 8),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, 15),
                        new MoveLearnSetEntry(Move.SWEET_SCENT, 22),
                        new MoveLearnSetEntry(Move.SLASH, 29),
                        new MoveLearnSetEntry(Move.CRUNCH, 33),
                        new MoveLearnSetEntry(Move.SCARY_FACE, 38),
                        new MoveLearnSetEntry(Move.REST, 47),
                        new MoveLearnSetEntry(Move.SNORE, 49),
                        new MoveLearnSetEntry(Move.THRASH, 58),
                        new MoveLearnSetEntry(Move.HAMMER_ARM, 67),
                        new MoveLearnSetEntry(Move.BELLY_DRUM, "egg"),
                        new MoveLearnSetEntry(Move.CHIP_AWAY, "egg"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT, "egg"),
                        new MoveLearnSetEntry(Move.COUNTER, "egg"),
                        new MoveLearnSetEntry(Move.CROSS_CHOP, "egg"),
                        new MoveLearnSetEntry(Move.CRUNCH, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, "egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS, "egg"),
                        new MoveLearnSetEntry(Move.METAL_CLAW, "egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH, "egg"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS, "egg"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, "egg"),
                        new MoveLearnSetEntry(Move.YAWN, "egg")
                ),
                List.of(Label.GEN2,Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Ursaring");
    }
}
