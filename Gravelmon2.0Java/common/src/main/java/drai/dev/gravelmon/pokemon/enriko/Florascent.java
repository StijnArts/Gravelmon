package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Florascent extends drai.dev.gravelmon.pokemon.Pokemon {
    public Florascent() {
        super("Florascent",
                Type.GRASS,Type.ELECTRIC,
                new Stats(115,
                        125,
                        105,
                        20,
                        105,
                        10),
                List.of(Ability.ILLUMINATE), Ability.ARENA_TRAP,
                8, 165,
                new Stats(0,2,0,0,0,0), 70,
                0.5,
                140, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Its tongue can glow as bright as the sun when it's angry. They used to illuminate the lush jungles here, but deforestation and pollution drove them off."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SYNTHESIS,5),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Florascent");

    }


}
