package drai.dev.gravelmon.pokemon.fliga.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Silicobra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Silicobra(int dex) {
        super(dex, "Silicobra",
                Type.GROUND,
                new Stats(52,
                        57,
                        75,
                        35,
                        50,
                        46),
                List.of(Ability.SAND_SPIT,Ability.SHED_SKIN), Ability.SAND_VEIL,
                4, 76,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                63, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.DRAGON),
                List.of("It spews sand from its nostrils. While the enemy is blinded, it burrows into the ground to hide."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,5),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,10),
                        new MoveLearnSetEntry(Move.BULLDOZE,15),
                        new MoveLearnSetEntry(Move.HEADBUTT,20),
                        new MoveLearnSetEntry(Move.GLARE,25),
                        new MoveLearnSetEntry(Move.DIG,30),
                        new MoveLearnSetEntry(Move.SANDSTORM,35),
                        new MoveLearnSetEntry(Move.SLAM,40),
                        new MoveLearnSetEntry(Move.COIL,45),
                        new MoveLearnSetEntry(Move.SAND_TOMB,50),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.DRILL_RUN,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tm"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.BELCH,"tm"),
                        new MoveLearnSetEntry(Move.POISON_TAIL,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Silicobra");

    }


}
