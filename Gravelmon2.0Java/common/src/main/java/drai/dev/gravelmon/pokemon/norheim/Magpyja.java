package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Magpyja extends drai.dev.gravelmon.pokemon.Pokemon {
    public Magpyja() {
        super("Magpyja",
                Type.FLYING, Type.DARK,
                new Stats(70,
                        77,
                        75,
                        90,
                        98,
                        75),
                List.of(Ability.UNBURDEN,Ability.PICKPOCKET,Ability.INFILTRATOR), Ability.INFILTRATOR,
                14, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Magpyja works as mob bosses over groups of Tweetler and are obsessed with shiny objects. They are merciless and may use their talons to attack children in the woods while screeching in human tongue."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THIEF,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,6),
                        new MoveLearnSetEntry(Move.SCREECH,12),
                        new MoveLearnSetEntry(Move.PLUCK,16),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,23),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,28),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,31),
                        new MoveLearnSetEntry(Move.AIR_SLASH,35),
                        new MoveLearnSetEntry(Move.SNATCH,39),
                        new MoveLearnSetEntry(Move.DARK_PULSE,45),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,50),
                        new MoveLearnSetEntry(Move.DRILL_PECK,54),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,60)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 46, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_ARID))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
