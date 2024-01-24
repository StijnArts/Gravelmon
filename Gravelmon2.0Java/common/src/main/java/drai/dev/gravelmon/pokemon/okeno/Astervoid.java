package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Astervoid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Astervoid() {
        super("Astervoid",
                Type.DARK,Type.ROCK,
                new Stats(80,
                        40,
                        96,
                        135,
                        89,
                        60),
                List.of(Ability.LEVITATE), Ability.DARKHOLD,
                8, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.0,
                219, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FAIRY),
                List.of("During evolution, only the sturdiest of the two bodies that made Clustar remains. When Astervoid becomes upset, anything that enters its cosmic ring gets shredded immediately."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.METEOR_BEAM,1),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Astervoid");

    }


}
