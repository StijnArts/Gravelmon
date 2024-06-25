package drai.dev.gravelmon.pokemon.spion;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Traflutter extends drai.dev.gravelmon.pokemon.Pokemon {
    public Traflutter() {
        super("Traflutter",
                Type.BUG, Type.FLYING,
                new Stats(83,
                        85,
                        50,
                        73,
                        53,
                        92),
                List.of(Ability.SWARM,Ability.COMPOUND_EYES), Ability.TINTED_LENS,
                12, 245,
                new Stats(0,0,0,0,0,3), 45,
                0.5,
                182, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Traflutter spend their life flying from one area of the region to the other. They say that you can always find which way is North by following a Traflutter."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.STUN_SPORE,13),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,15),
                        new MoveLearnSetEntry(Move.SILVER_WIND,18),
                        new MoveLearnSetEntry(Move.ENDURE,20),
                        new MoveLearnSetEntry(Move.SUPERSONIC,23),
                        new MoveLearnSetEntry(Move.ACROBATICS,25),
                        new MoveLearnSetEntry(Move.ENDEAVOR,28),
                        new MoveLearnSetEntry(Move.UTURN,30),
                        new MoveLearnSetEntry(Move.CAPTIVATE,33),
                        new MoveLearnSetEntry(Move.AIR_SLASH,35),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,38),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,40),
                        new MoveLearnSetEntry(Move.LUNGE,43),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,45),
                        new MoveLearnSetEntry(Move.MAGNETIC_FLUX,48),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"tm")                        ),
                List.of(Label.SPION),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Traflutter");

    }


}
