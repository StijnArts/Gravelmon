package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bombeezle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bombeezle() {
        super("Bombeezle",
                Type.BUG, Type.FIRE,
                new Stats(75,
                        130,
                        90,
                        76,
                        43,
                        70),
                List.of(Ability.INFILTRATOR,Ability.SKILL_LINK,Ability.AFTERMATH), Ability.AFTERMATH,
                12, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Wild Bombeezle in a swarm can be dangerous. They will carry and drop Carabomb on their enemies if they feel threatened. They launch multiple flaming missiles towards their opponents, leaving them with a bad burn."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.WRAP,5),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,15),
                        new MoveLearnSetEntry(Move.BUG_BITE,20),
                        new MoveLearnSetEntry(Move.COIL,25),
                        new MoveLearnSetEntry(Move.SLAM,30),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,35),
                        new MoveLearnSetEntry(Move.CRUNCH,40),
                        new MoveLearnSetEntry(Move.FIRE_LASH,45),
                        new MoveLearnSetEntry(Move.LUNGE,50),
                        new MoveLearnSetEntry(Move.BURN_UP,55)            ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 43, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.WILD, SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
        setLangFileName("Bombeezle");

    }


}
