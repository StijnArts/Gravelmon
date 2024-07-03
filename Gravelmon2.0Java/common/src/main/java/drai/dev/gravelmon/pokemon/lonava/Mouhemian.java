package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Mouhemian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mouhemian() {
        super("Mouhemian",
                Type.GRASS, Type.PSYCHIC,
                new Stats(65,
                        20,
                        80,
                        20,
                        80,
                        60),
                List.of(Ability.OWN_TEMPO,Ability.LEAF_GUARD), Ability.TANGLING_HAIR,
                6, 165,
                new Stats(0,0,0,0,0,0), 99,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("Mouhemian are passive, sometimes to a fault. They rarely bathe, so aren't popular with urban-dwelling trainers; more alternative, travelling trainers love it however. Their large, misty eyes have been the subject of many traditional folk songs."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,7),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,12),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,16),
                        new MoveLearnSetEntry(Move.BATON_PASS,20),
                        new MoveLearnSetEntry(Move.LEECH_SEED,25),
                        new MoveLearnSetEntry(Move.DETECT,29),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,33),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,37),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,41),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,46),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,52)
                ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 22, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OLD_GROWTH_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mouhemian");

    }


}
