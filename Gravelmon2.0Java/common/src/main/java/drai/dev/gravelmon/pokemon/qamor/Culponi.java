package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Culponi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Culponi() {
        super("Culponi",
                Type.DARK,
                new Stats(58,
                        68,
                        36,
                        38,
                        28,
                        95),
                List.of(Ability.STAMINA), Ability.PICKPOCKET,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                80, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Culponi are very rowdy Pokemon who love to cause mischief and mayhem. They love to rob people for supposedly no other reason then the thrill of stealing. Their tail hair naturally braids together to form lassos, which it uses to catch and contain it's current victims of its pranks."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.SNATCH,6),
                        new MoveLearnSetEntry(Move.WRAP,11),
                        new MoveLearnSetEntry(Move.PAYBACK,16),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,21),
                        new MoveLearnSetEntry(Move.PURSUIT,25),
                        new MoveLearnSetEntry(Move.BATON_PASS,29),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,35),
                        new MoveLearnSetEntry(Move.COUNTER,40),
                        new MoveLearnSetEntry(Move.REVENGE,46),
                        new MoveLearnSetEntry(Move.LASH_OUT,50),
                        new MoveLearnSetEntry(Move.MEGA_KICK,55)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Culponi");

    }


}
