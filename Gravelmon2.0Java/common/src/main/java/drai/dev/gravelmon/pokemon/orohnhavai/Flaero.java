package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Flaero extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flaero() {
        super("Flaero",
                Type.FIRE, Type.FLYING,
                new Stats(45,
                        55,
                        45,
                        65,
                        45,
                        55),
                List.of(Ability.BLAZE), Ability.DEFIANT,
                5, 165,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FLYING),
                List.of("The tips of its horn glows as guides its way into the darkness. In the dark, it likes to communicate with glowing signals from its horns. They dart themselves from place to place, almost looking like flaming arrows, which its name was derived from."),
                List.of(new EvolutionEntry("impferno", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,5),
                        new MoveLearnSetEntry(Move.WING_ATTACK,9),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,13),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,19),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,22),
                        new MoveLearnSetEntry(Move.FLAME_BURST,26),
                        new MoveLearnSetEntry(Move.SLASH,30),
                        new MoveLearnSetEntry(Move.CRUNCH,34),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,37),
                        new MoveLearnSetEntry(Move.AIR_SLASH,40),
                        new MoveLearnSetEntry(Move.SCREECH,43),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,47),
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
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE, Biome.IS_NETHER_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
