package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pleech extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pleech() {
        super("Pleech",
                Type.WATER,Type.POISON,
                new Stats(30,
                        20,
                        50,
                        75,
                        60,
                        40),
                List.of(Ability.POISON_TOUCH,Ability.INFILTRATOR,Ability.POWERLEECH), Ability.POWERLEECH,
                3, 165,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                64, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_1),
                List.of("Their sucker-shaped heads are flexible. Once it latches onto an artery or vein, it thrusts in and out, forcing blood to the surface like a plunger."),
                List.of(new EvolutionEntry("denartery", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.FLAIL,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,4),
                        new MoveLearnSetEntry(Move.BUBBLE,7),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,13),
                        new MoveLearnSetEntry(Move.WATER_SPORT,16),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,19),
                        new MoveLearnSetEntry(Move.WATER_PULSE,23),
                        new MoveLearnSetEntry(Move.CRUNCH,25),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,29),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,32),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,36),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,40),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,45)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 8, 27, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
