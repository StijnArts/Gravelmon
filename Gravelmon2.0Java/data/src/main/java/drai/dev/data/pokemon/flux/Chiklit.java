package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Chiklit extends Pokemon {
    public Chiklit() {
        super("Chiklit",
                Type.FIRE,
                new Stats(50,
                        52,
                        44,
                        50,
                        44,
                        75),
                List.of(Ability.BLAZE), Ability.TOUGH_CLAWS,
                5, 105,
                new Stats(0,0,0,0,0,1), 45,
                0.875,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING, EggGroup.FIELD),
                List.of("A poor flyer, it glides and hops from branch to branch to traverse the forests where it lives. It uses tiny bursts of fire to prey on smaller bug-type Pokemon and fend off attackers."),
                List.of(new EvolutionEntry("burnychus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.EMBER,6),
                        new MoveLearnSetEntry(Move.TWISTER,8),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,11),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,15),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,18),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,22),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,25),
                        new MoveLearnSetEntry(Move.WHIRLWIND,29),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,32),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,36),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.TAILWIND,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
