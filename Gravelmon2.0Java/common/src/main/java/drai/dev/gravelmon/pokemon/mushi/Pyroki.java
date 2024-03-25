package drai.dev.gravelmon.pokemon.mushi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Pyroki extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pyroki() {
        super("Pyroki",
                Type.FIRE,Type.BUG,
                new Stats(50,
                        55,
                        40,
                        70,
                        40,
                        55),
                List.of(Ability.BLAZE), Ability.FLASH_FIRE,
                0, 0,
                new Stats(0,0,0,1,0,0), 0,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("- Tackle Normal - Growl Normal - EmberSTAB Fire 7 Struggle BugSTAB Bug 12 Bite Dark 15 Flame ChargeSTAB Fire 17 Smokescreen Normal 21 Bug BiteSTAB Bug 25 Gastro Acid Poison 28 FlamethrowerSTAB Fire 32 Leech LifeSTAB Bug 36 Fire BlastSTAB Fire"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,7),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,15),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,17),
                        new MoveLearnSetEntry(Move.BUG_BITE,21),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,25),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,28),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,32),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,36)                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pyroki");

    }


}
