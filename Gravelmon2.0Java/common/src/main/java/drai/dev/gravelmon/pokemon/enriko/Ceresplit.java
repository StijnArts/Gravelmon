package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Ceresplit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ceresplit() {
        super("Ceresplit",
                Type.GROUND, Type.FIRE,
                new Stats(90,
                        50,
                        100,
                        65,
                        100,
                        35),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                128, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("An elusive lava-bodied Pokemon that only grows a protective shell on one half of its body. If, by accident, it were to grow one on the other half, it would break it off. Nobody really knows why it does this."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,9),
                        new MoveLearnSetEntry(Move.MUD_SHOT,11),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,16),
                        new MoveLearnSetEntry(Move.ROLLOUT,20),
                        new MoveLearnSetEntry(Move.BULLDOZE,24),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,30),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,34),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,40),
                        new MoveLearnSetEntry(Move.SHELL_TRAP,46),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,50),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,54),
                        new MoveLearnSetEntry(Move.EARTH_POWER,60),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,65),
                        new MoveLearnSetEntry(Move.FISSURE,70),
                        new MoveLearnSetEntry(Move.BATON_PASS,75)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 54, 7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.MAXY,"20")
                ), List.of(),
                List.of(SpawnPreset.NEAR_LAVA),
                0.28, 0.3,
                List.of());
           setLangFileName("Ceresplit");

    }


}
