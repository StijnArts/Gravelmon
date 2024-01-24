package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Candhoul extends drai.dev.gravelmon.pokemon.Pokemon {
    public Candhoul() {
        super("Candhoul",
                Type.FIRE,Type.GHOST,
                new Stats(60,
                        50,
                        65,
                        85,
                        66,
                        69),
                List.of(Ability.FLAME_BODY,Ability.ILLUMINATE,Ability.FIERYSPIRIT), Ability.FIERYSPIRIT,
                8, 165,
                new Stats(0,1,0,0,1,0), 90,
                0.5,
                130, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Their bodies are very gooey and sticky. They drip behind them as they walk leaving a big mess, so wild Candhoul are often labelled as pests."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,9),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,11),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,15),
                        new MoveLearnSetEntry(Move.CHARM,18),
                        new MoveLearnSetEntry(Move.INCINERATE,23),
                        new MoveLearnSetEntry(Move.WILLOWISP,28),
                        new MoveLearnSetEntry(Move.HEX,32),
                        new MoveLearnSetEntry(Move.CURSE,36),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,40),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,44),
                        new MoveLearnSetEntry(Move.MEMENTO,47),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,50),
                        new MoveLearnSetEntry(Move.POLTERGEIST,54),
                        new MoveLearnSetEntry(Move.RECOVER,60),
                        new MoveLearnSetEntry(Move.INFERNO,64)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Candhoul");

    }


}
