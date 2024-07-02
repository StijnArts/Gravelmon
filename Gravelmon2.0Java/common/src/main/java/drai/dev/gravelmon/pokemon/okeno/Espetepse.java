package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Espetepse extends drai.dev.gravelmon.pokemon.Pokemon {
    public Espetepse() {
        super("Espetepse",
                Type.ROCK, Type.BUG,
                new Stats(111,
                        92,
                        90,
                        61,
                        90,
                        51),
                List.of(Ability.POISON_POINT), Ability.LIGHTNING_ROD,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.BUG),
                List.of("Confusion Psychic Hypnosis Psychic Confuse Ray Ghost Brine Water Gastro Acid Poison Toxic Spikes Poison Spiky Shield Grass Sticky Web Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Espetepse");

    }


}
