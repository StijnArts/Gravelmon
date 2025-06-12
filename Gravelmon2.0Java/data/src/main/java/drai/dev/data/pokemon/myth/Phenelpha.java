package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Phenelpha extends Pokemon {
    public Phenelpha() {
        super("Phenelpha",
                Type.FIRE, Type.FLYING,
                new Stats(100,70,80,120,145,120),
                List.of(Ability.FLAME_BODY), Ability.FLAME_BODY,
                12, 679,
                new Stats(0,0,0,0,1,0), 3,
                -1,
                250, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("A Mythical Pokemon that is said to be the descent of Cresselia, although it seems a bit more evil."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLAME_WHEEL, 1),
                        new MoveLearnSetEntry(Move.PECK, 3),
                        new MoveLearnSetEntry(Move.WILLOWISP, 6),
                        new MoveLearnSetEntry(Move.WING_ATTACK, 10),
                        new MoveLearnSetEntry(Move.PROTECT, 14),
                        new MoveLearnSetEntry(Move.ROOST, 18),
                        new MoveLearnSetEntry(Move.FLAMETHROWER, 23),
                        new MoveLearnSetEntry(Move.TAIL_GLOW, 28),
                        new MoveLearnSetEntry(Move.NASTY_PLOT, 32),
                        new MoveLearnSetEntry(Move.CALM_MIND, 35),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 39),
                        new MoveLearnSetEntry(Move.HURRICANE, 44),
                        new MoveLearnSetEntry(Move.INFERNOSTORM, 50),
                        new MoveLearnSetEntry(Move.FLASH_CANNON, 55),
                        new MoveLearnSetEntry(Move.ENCORE, 60),
                        new MoveLearnSetEntry(Move.TOXIC, 65),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, 70),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 75),
                        new MoveLearnSetEntry(Move.BLAST_BURN, 80)
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(65)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .duringDaytime()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
