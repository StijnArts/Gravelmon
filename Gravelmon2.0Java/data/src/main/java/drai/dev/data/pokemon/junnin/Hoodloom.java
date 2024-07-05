package drai.dev.data.pokemon.junnin;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hoodloom extends drai.dev.data.pokemon.Pokemon {
    public Hoodloom() {
        super("Hoodloom",
                Type.DARK,
                new Stats(73,
                        75,
                        42,
                        75,
                        94,
                        79),
                List.of(Ability.PICKPOCKET), Ability.PICKPOCKET,
                8, 165,
                new Stats(0,0,0,0,1,0), 175,
                0.5,
                88, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Hoodloom typically hides in dark alleyways, and are always looking for stuff to loot. They don't like working together, but will team up if they need to."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.ASTONISH,6),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,10),
                        new MoveLearnSetEntry(Move.TAUNT,15),
                        new MoveLearnSetEntry(Move.THIEF,18),
                        new MoveLearnSetEntry(Move.FAKE_OUT,22),
                        new MoveLearnSetEntry(Move.SLASH,25),
                        new MoveLearnSetEntry(Move.TAUNT,29),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,31),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,35),
                        new MoveLearnSetEntry(Move.FLING,39),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,42),
                        new MoveLearnSetEntry(Move.SWITCHEROO,45),
                        new MoveLearnSetEntry(Move.GRUDGE,51)                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hoodloom");

    }


}
