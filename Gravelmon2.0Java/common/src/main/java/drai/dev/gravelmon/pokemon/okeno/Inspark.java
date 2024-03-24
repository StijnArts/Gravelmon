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
                4, 165,
                new Stats(0,0,0,0,0,0), 250,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.AMORPHOUS),
                List.of("- SingeSTAB Fire 3 Smokescreen Normal 7 EmberSTAB Fire 11 Smog Poison 16 Endure Normal 23 Flame BurstSTAB Fire 35 Explosion Normal 37 Powder Bug"),
                List.of(new EvolutionEntry("flantern", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15"))),
                        new EvolutionEntry("explosipede", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,"\""+Move.EXPLOSION.getName()+"\"")))),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 1, 17, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_VOLCANIC, Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Inspark");

    }


}
