package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Rayscal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rayscal() {
        super("Rayscal",
                Type.DARK,
                new Stats(40,
                        80,
                        40,
                        50,
                        40,
                        60),
                List.of(Ability.UNDERLING), Ability.UNNERVE,
                6, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                62, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_1),
                List.of("They make their home in deep, ocean trenches lined with geothermal vents. The sight of Rayscal swooping in the darkness among the burning towers is thought to have inspired our concept of hell."),
                List.of(new EvolutionEntry("rayth", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(         new MoveLearnSetEntry(Move.MALICE_STRIKE,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.FIRE_FANG,1),
                        new MoveLearnSetEntry(Move.FIRE_LASH,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.MEGAHORN,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 7, 31, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
