package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Metamarine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Metamarine() {
        super("Metamarine",
                Type.WATER,Type.STEEL,
                new Stats(90,
                        70,
                        130,
                        170,
                        140,
                        80),
                List.of(Ability.MEGA_LAUNCHER), Ability.MEGA_LAUNCHER,
                38, 165,
                new Stats(0,0,0,2,1,0), 25,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Metamarine lurks beneath the deep oceans and in the deepest marinas, emitting an eerie blue glow that somehow shines to the surface of the sea. Those that see this glow flee, as it is an omen of tsunamis and terrible storms to come. The cannon on it's back is capable of obliterating nearly anything in it's path."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,11),
                        new MoveLearnSetEntry(Move.PECK,15),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,19),
                        new MoveLearnSetEntry(Move.SWAGGER,24),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,28),
                        new MoveLearnSetEntry(Move.BRINE,33),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,39),
                        new MoveLearnSetEntry(Move.MIST,46),
                        new MoveLearnSetEntry(Move.DRILL_PECK,52),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,59),
                        new MoveLearnSetEntry(Move.WAVE_CRASH,66),

                        new MoveLearnSetEntry(Move.ORIGIN_PULSE,1)                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.MAXY,"20")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
