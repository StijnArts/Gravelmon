package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Stalittle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stalittle() {
        super("Stalittle",
                Type.ROCK, Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SOUNDPROOF), Ability.SOLID_ROCK,
                8, 165,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Sturdy Pokemon that hide in caves full of mineral-rich water. The rocky spikes on their bodies are deposits of this water."),
                List.of(new EvolutionEntry("sedinane", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(             new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,5),
                        new MoveLearnSetEntry(Move.MUD_SPORT,10),
                        new MoveLearnSetEntry(Move.MUD_BOMB,12),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,16),
                        new MoveLearnSetEntry(Move.BLOCK,20),
                        new MoveLearnSetEntry(Move.BULLDOZE,23),
                        new MoveLearnSetEntry(Move.QUASH,27),
                        new MoveLearnSetEntry(Move.RELICPILLAR,31),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,35),
                        new MoveLearnSetEntry(Move.EARTH_POWER,40),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46)           ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE, Biome.IS_DRIPSTONE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Stalittle");

    }


}
