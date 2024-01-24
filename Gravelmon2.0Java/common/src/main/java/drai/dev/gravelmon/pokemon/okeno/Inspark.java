package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Inspark extends drai.dev.gravelmon.pokemon.Pokemon {
    public Inspark() {
        super("Inspark",
                Type.FIRE,Type.BUG,
                new Stats(40,
                        50,
                        35,
                        60,
                        50,
                        30),
                List.of(Ability.IGNITION), Ability.IGNITION,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.AMORPHOUS),
                List.of("- SingeSTAB Fire 3 Smokescreen Normal 7 EmberSTAB Fire 11 Smog Poison 16 Endure Normal 23 Flame BurstSTAB Fire 35 Explosion Normal 37 Powder Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SINGE,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,3),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.SMOG,11),
                        new MoveLearnSetEntry(Move.ENDURE,16),
                        new MoveLearnSetEntry(Move.FLAME_BURST,23),
                        new MoveLearnSetEntry(Move.EXPLOSION,35),
                        new MoveLearnSetEntry(Move.POWDER,37),
                        new MoveLearnSetEntry(Move.BARRAGE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Inspark");

    }


}
