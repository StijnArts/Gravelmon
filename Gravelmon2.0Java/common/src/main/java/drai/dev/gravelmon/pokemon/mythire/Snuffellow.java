package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Snuffellow extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snuffellow() {
        super("Snuffellow",
                Type.FIRE,
                new Stats(45,
                        30,
                        55,
                        65,
                        45,
                        60),
                List.of(Ability.SNIPER,Ability.MAGMA_ARMOR,Ability.WHITE_SMOKE), Ability.WHITE_SMOKE,
                8, 165,
                new Stats(0,0,0,1,0,0), 200,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("It communicates with honks and hoots after it eats its fill of warm food. Train operators use Snuffellow as a convenient substitute if the whistle fails to work, and they are rewarded with a share of hot coals to eat."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STOKE,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snuffellow");

    }


}
