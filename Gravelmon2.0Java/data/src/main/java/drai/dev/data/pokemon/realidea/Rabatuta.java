package drai.dev.data.pokemon.realidea;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Rabatuta extends Pokemon {
    public Rabatuta() {
        super("Rabatuta",
                Type.FIRE, Type.SOUND,
                new Stats(70,60,75,65,75,75),
                List.of(Ability.BLAZE), Ability.SOLAR_POWER,
                14, 330,
                new Stats(0,0,1,0,1,0), 45,
                0.875,
                163, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(new EvolutionEntry("flamelin", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER, 1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 1),
                        new MoveLearnSetEntry(Move.SCRATCH, 1),
                        new MoveLearnSetEntry(Move.GROWL, 1),
                        new MoveLearnSetEntry(Move.FEINT, 1),
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.EMBER, 5),
                        new MoveLearnSetEntry(Move.CONFUSION, 7),
                        new MoveLearnSetEntry(Move.HYPNOSIS, 10),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK, 12),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 13),
                        new MoveLearnSetEntry(Move.ROUND, 16),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 19),
                        new MoveLearnSetEntry(Move.YAWN, 19),
                        new MoveLearnSetEntry(Move.FLAME_BURST, 22),
                        new MoveLearnSetEntry(Move.AGILITY, 24),
                        new MoveLearnSetEntry(Move.PSYBEAM, 25),
                        new MoveLearnSetEntry(Move.CALM_MIND, 28),
                        new MoveLearnSetEntry(Move.HEADBUTT, 30),
                        new MoveLearnSetEntry(Move.WILLOWISP, 31),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 37),
                        new MoveLearnSetEntry(Move.COUNTER, 38),
                        new MoveLearnSetEntry(Move.DREAM_EATER, 39),
                        new MoveLearnSetEntry(Move.FIRE_SPIN, 42),
                        new MoveLearnSetEntry(Move.INFERNO, 44),
                        new MoveLearnSetEntry(Move.BOUNCE, 46),
                        new MoveLearnSetEntry(Move.OVERHEAT, 47),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE, 54),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, 62)
                ),
                List.of(Label.REALIDEA_SYSTEM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
