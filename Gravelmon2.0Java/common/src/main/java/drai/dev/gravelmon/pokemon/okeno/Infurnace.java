package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Infurnace extends drai.dev.gravelmon.pokemon.Pokemon {
    public Infurnace() {
        super("Infurnace",
                Type.FIRE,Type.ROCK,
                new Stats(43,
                        103,
                        100,
                        93,
                        75,
                        30),
                List.of(Ability.FIREPROOF,Ability.SKILL_LINK,Ability.OVERCOAT), Ability.OVERCOAT,
                8, 165,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Infurnace are known for their temper. They cause a lot of trouble during Christmas Eve, launching hot coal at any moving target."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.RAGE,4),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,8),
                        new MoveLearnSetEntry(Move.ROCK_THROW,12),
                        new MoveLearnSetEntry(Move.ENDURE,15),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,18),
                        new MoveLearnSetEntry(Move.COALTHROW,22),
                        new MoveLearnSetEntry(Move.FIREWALL,25),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,29),
                        new MoveLearnSetEntry(Move.INCINERATE,33),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,37),
                        new MoveLearnSetEntry(Move.FLAME_BURST,40),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,43),
                        new MoveLearnSetEntry(Move.ERUPTION,47),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.SMOG,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Infurnace");

    }


}
