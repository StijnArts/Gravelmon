package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bulberry extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bulberry() {
        super("Bulberry",
                Type.GRASS, Type.ELECTRIC,
                new Stats(70,
                        80,
                        70,
                        20,
                        70,
                        10),
                List.of(Ability.ILLUMINATE), Ability.ARENA_TRAP,
                7, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                90, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("The bulb on its backside attracts bugs at night. When the bugs touch the bulb, it electrocutes them and they are promptly eaten."),
                List.of(new EvolutionEntry("florascent", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.SNAP_TRAP,1),
                        new MoveLearnSetEntry(Move.SYNTHESIS,5),
                        new MoveLearnSetEntry(Move.INGRAIN,8),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.VINE_WHIP,16),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,21),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,30),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,35),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,39),
                        new MoveLearnSetEntry(Move.SPORE,49),
                        new MoveLearnSetEntry(Move.POWER_WHIP,54),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,60)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bulberry");

    }


}
