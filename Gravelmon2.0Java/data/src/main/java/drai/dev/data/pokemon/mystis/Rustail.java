package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rustail extends drai.dev.data.pokemon.Pokemon {
    public Rustail() {
        super("Rustail",
                Type.STEEL, Type.WATER,
                new Stats(70,
                        110,
                        100,
                        50,
                        90,
                        90),
                List.of(Ability.REELIN,Ability.IRON_BARBS), Ability.STRONG_JAW,
                30, 1100,
                new Stats(0,2,0,0,0,0), 50,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.MINERAL),
                List.of("Its body is patterned to blend in with the water. Its jaws and hook are extremely deadly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.JAB,1),
                        new MoveLearnSetEntry(Move.WRAP,3),
                        new MoveLearnSetEntry(Move.AQUASLAP,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.GLARE,11),
                        new MoveLearnSetEntry(Move.METAL_CLAW,13),
                        new MoveLearnSetEntry(Move.AQUA_JET,15),
                        new MoveLearnSetEntry(Move.DRAIN_LIFE,17),
                        new MoveLearnSetEntry(Move.CRUNCH,19),
                        new MoveLearnSetEntry(Move.DRAGONFANG,21),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,24),
                        new MoveLearnSetEntry(Move.COIL,27),
                        new MoveLearnSetEntry(Move.LIQUIDATION,29),
                        new MoveLearnSetEntry(Move.POISON_FANG,32),
                        new MoveLearnSetEntry(Move.IRON_TAIL,35),
                        new MoveLearnSetEntry(Move.JAW_LOCK,37),
                        new MoveLearnSetEntry(Move.ANCHOR_SHOT,39),
                        new MoveLearnSetEntry(Move.DEPTH_CHARGE,43),
                        new MoveLearnSetEntry(Move.TWINBLADE,45),
                        new MoveLearnSetEntry(Move.IRON_HEAD,48),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,"tm"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(36).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_COLD_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Rustail");

    }


}
