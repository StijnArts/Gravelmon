package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Impferno extends drai.dev.data.pokemon.Pokemon {
    public Impferno() {
        super("Impferno",
                Type.FIRE, Type.FLYING,
                new Stats(60,
                        80,
                        60,
                        85,
                        55,
                        75),
                List.of(Ability.BLAZE), Ability.DEFIANT,
                10, 165,
                new Stats(0,1,0,1,0,0), 45,
                0.875,
                161, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FLYING),
                List.of("An avid hunter, Impferno can control the light emitted from its ear tips to confuse its prey. When agitated, its horns can reach dangerously high temperatures and attacks its foes with them. They communicate with each other by displaying light signals from its horns."),
                List.of(new EvolutionEntry("pyrovern", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.FIRE_SPIN,1),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,5),
                        new MoveLearnSetEntry(Move.WING_ATTACK,9),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,13),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,20),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,24),
                        new MoveLearnSetEntry(Move.FLAME_BURST,28),
                        new MoveLearnSetEntry(Move.SLASH,33),
                        new MoveLearnSetEntry(Move.CRUNCH,38),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,43),
                        new MoveLearnSetEntry(Move.AIR_SLASH,47),
                        new MoveLearnSetEntry(Move.SCREECH,51),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,55),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.HEMODRAIN,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 40, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE, Biome.IS_NETHER_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
