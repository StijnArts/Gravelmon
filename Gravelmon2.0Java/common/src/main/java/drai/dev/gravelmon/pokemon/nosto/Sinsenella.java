package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sinsenella extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sinsenella() {
        super("Sinsenella",
                Type.FAIRY,
                new Stats(64,
                        54,
                        61,
                        87,
                        72,
                        60),
                List.of(Ability.CUTE_CHARM,Ability.HARVEST,Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                7, 165,
                new Stats(0,0,0,2,0,0), 120,
                0.0,
                139, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of(""),
                List.of(new EvolutionEntry("dysmerella", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:shiny_stone")),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 25, 34, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sinsenella");

    }


}
