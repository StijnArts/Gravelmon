package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranMakuhita extends Pokemon {
    public CefiranMakuhita(String name, Aspect aspect) {
        super(name, aspect,"CefiranMakuhita",
                Type.FIGHTING, Type.PSYCHIC,
                new Stats(72,20,30,25,60,30),
                List.of(Ability.THICK_FAT, Ability.WHITE_SMOKE), Ability.MAGIC_BOUNCE,
                5, 136,
                new Stats(1,0,0,0,0,0), 180,
                0.5,
                47, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(new EvolutionEntry("CefiranHariyama", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY, 1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK, 4),
                        new MoveLearnSetEntry(Move.CONFUSION, 7),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE, 10),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 13),
                        new MoveLearnSetEntry(Move.WHIRLWIND, 16),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, 19),
                        new MoveLearnSetEntry(Move.CALM_MIND, 22),
                        new MoveLearnSetEntry(Move.PSYBEAM, 25),
                        new MoveLearnSetEntry(Move.RECOVER, 28),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS, 31),
                        new MoveLearnSetEntry(Move.AURA_SPHERE, 34),
                        new MoveLearnSetEntry(Move.ENDURE, 37),
                        new MoveLearnSetEntry(Move.PSYCHIC, 40),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT, 43),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST, 46),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH, "egg"),
                        new MoveLearnSetEntry(Move.CHIP_AWAY, "egg"),
                        new MoveLearnSetEntry(Move.COUNTER, "egg"),
                        new MoveLearnSetEntry(Move.CROSS_CHOP, "egg"),
                        new MoveLearnSetEntry(Move.DETECT, "egg"),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH, "egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK, "egg"),
                        new MoveLearnSetEntry(Move.FEINT, "egg"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH, "egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT, "egg"),
                        new MoveLearnSetEntry(Move.HELPING_HAND, "egg"),
                        new MoveLearnSetEntry(Move.REVENGE, "egg"),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP, "egg"),
                        new MoveLearnSetEntry(Move.WIDE_GUARD, "egg")
                ),
                List.of(Label.GEN3,Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(2)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Makuhita");
    }
}
