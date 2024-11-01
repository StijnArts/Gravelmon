package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Stunzeed extends drai.dev.data.pokemon.Pokemon {
    public Stunzeed() {
        super("Stunzeed",
                Type.ELECTRIC,Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.LEVITATE,Ability.ELECTRIC_SURGE), Ability.GRASSY_SURGE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Twin Beam (N) Psychic - Seed BombSTAB Grass - Seed ShotSTAB Grass - Charge BeamSTAB Electric - Confuse Ray Ghost - Topsy-Turvy Dark - Double-Edge Normal - Double ShockSTAB Electric - Double Hit (N) Normal - Double Slap (N) Normal - Thunder ShockSTAB Electric - Thunder Wave Electric - Gravity (N) Psychic - Electro BallSTAB Electric - Energy BallSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,1),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,1),
                        new MoveLearnSetEntry(Move.TWIN_BEAM,1),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,1),
                        new MoveLearnSetEntry(Move.SEEDSHOT,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.TOPSYTURVY,1),
                        new MoveLearnSetEntry(Move.SEED_BOMB,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,1),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,1),
                        new MoveLearnSetEntry(Move.DOUBLE_SHOCK,1),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.GRAVITY,1)                        ),
                List.of(Label.SORIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stunzeed");

    }


}
