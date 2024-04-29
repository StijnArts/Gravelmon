package drai.dev.gravelmon.pokemon.okeno;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Boileror extends drai.dev.gravelmon.pokemon.Pokemon {
    public Boileror() {
        super("Boileror",
                Type.FIRE, Type.ICE,
                new Stats(92,
                        120,
                        90,
                        50,
                        50,
                        93),
                List.of(Ability.RECKLESS,Ability.MOUNTAINEER), Ability.THICK_FAT,
                17, 0,
                new Stats(0,2,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.WATER_1),
                List.of("It leaps from the top of sea cliffs directly into its prey with amazing force. Although it may seem dangerous, its sturdy body protects it from damage from the rocks. The flames on its face grow brighter the older it gets."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.FLAMEPOUNCE,8),
                        new MoveLearnSetEntry(Move.PECK,12),
                        new MoveLearnSetEntry(Move.AVALANCHE,15),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,18),
                        new MoveLearnSetEntry(Move.SCARY_FACE,20),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,23),
                        new MoveLearnSetEntry(Move.ENDEAVOR,26),
                        new MoveLearnSetEntry(Move.FLAME_BURST,30),
                        new MoveLearnSetEntry(Move.FLURRYPECK,33),
                        new MoveLearnSetEntry(Move.ICYCHARGE,37),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,40),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,44),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,50),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,56),
                        new MoveLearnSetEntry(Move.ICEBREAKER,62),
                        new MoveLearnSetEntry(Move.ENDURE,70),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm"),
                        new MoveLearnSetEntry(Move.TORPEDODASH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_SHARD,"tm"),
                        new MoveLearnSetEntry(Move.GLARE,"tm"),
                        new MoveLearnSetEntry(Move.FLAIL,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 45, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Boileror");

    }


}
