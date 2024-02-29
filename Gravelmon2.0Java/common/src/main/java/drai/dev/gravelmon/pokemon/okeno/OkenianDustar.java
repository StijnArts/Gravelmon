package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class OkenianDustar extends drai.dev.gravelmon.pokemon.Pokemon {
    public OkenianDustar(int dex) {
        super(dex, "Dustar",
                Type.DARK,Type.ROCK,
                new Stats(40,
                        30,
                        70,
                        90,
                        55,
                        35),
                List.of(Ability.LEVITATE), Ability.DARKHOLD,
                8, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.0,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FAIRY),
                List.of("They crash from outer space into various parts of the world. This Pokemon is impish and mean, but its said that there's another kind of Dustar which are good-natured."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.MAGIC_POWDER,5),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,9),
                        new MoveLearnSetEntry(Move.ASSURANCE,13),
                        new MoveLearnSetEntry(Move.IMPRISON,17),
                        new MoveLearnSetEntry(Move.SWIFT,21),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,24),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,26),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,30),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,34),
                        new MoveLearnSetEntry(Move.MOONLIGHT,39),
                        new MoveLearnSetEntry(Move.METEORSHOWER,43),
                        new MoveLearnSetEntry(Move.GRAVITY,48),
                        new MoveLearnSetEntry(Move.STARSTREAM,54),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,60),
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
           setLangFileName("Dustar");

    }


}
