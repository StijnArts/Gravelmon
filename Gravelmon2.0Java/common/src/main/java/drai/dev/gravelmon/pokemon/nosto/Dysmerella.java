package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Dysmerella extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dysmerella() {
        super("Dysmerella",
                Type.FAIRY,
                new Stats(79,
                        64,
                        86,
                        102,
                        94,
                        100),
                List.of(Ability.CUTE_CHARM,Ability.HEALER,Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                35, 165,
                new Stats(0,0,0,2,1,0), 45,
                0.0,
                236, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.TACKLE,10),
                        new MoveLearnSetEntry(Move.VINE_WHIP,15),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,20),
                        new MoveLearnSetEntry(Move.SAFEGUARD,22),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,24),
                        new MoveLearnSetEntry(Move.WISH,28),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,33),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,37),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,41),
                        new MoveLearnSetEntry(Move.SYNTHESIS,45),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,48),
                        new MoveLearnSetEntry(Move.MOONBLAST,1),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,1),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,1)
                ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 38, 56, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dysmerella");

    }


}
