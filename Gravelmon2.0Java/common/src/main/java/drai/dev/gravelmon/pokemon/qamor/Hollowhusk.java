package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Hollowhusk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hollowhusk() {
        super("Hollowhusk",
                Type.GHOST,Type.STEEL,
                new Stats(101,
                        100,
                        100,
                        100,
                        100,
                        39),
                List.of(Ability.FRISK), Ability.CURSED_BODY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Hollohusk come into existence when the child-like docile spirit from its preevolutions are released from the Pokemon's body, leaving behind only sinister emotions and evil energy. They are known for being pretty sadistic, and enjoy torturing other Pokemon for reasons unknown."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CURSE,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hollowhusk");

    }


}
