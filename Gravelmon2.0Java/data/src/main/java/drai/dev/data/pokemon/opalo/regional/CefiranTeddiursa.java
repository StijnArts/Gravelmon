package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranTeddiursa extends Pokemon {
    public CefiranTeddiursa(String name, Aspect aspect) {
        super(name, aspect,"CefiranTeddiursa",
                Type.DARK,
                new Stats(60,80,40,50,50,50),
                List.of(Ability.PICKUP, Ability.QUICK_FEET), Ability.HONEY_GATHER,
                6, 88,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It licks its palms that are sweetened by being soaked in honey. A Teddiursa makes its own honey by blending fruits and pollen collected by Beedrill."),
                List.of(new EvolutionEntry("CefiranUrsaring", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
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
                        new MoveLearnSetEntry(Move.CHARM, 36),
                        new MoveLearnSetEntry(Move.REST, 43),
                        new MoveLearnSetEntry(Move.SNORE, 43),
                        new MoveLearnSetEntry(Move.THRASH, 50),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, 57),
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Teddiursa");
    }
}
