package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Symphy extends drai.dev.data.pokemon.Pokemon {
    public Symphy() {
        super("Symphy",
                Type.ELECTRIC, Type.SOUND,
                new Stats(60,
                        55,
                        55,
                        80,
                        60,
                        100),
                List.of(Ability.STATIC,Ability.SOUNDWAVES), Ability.REVERB,
                4, 47,
                new Stats(0,0,0,2,0,0), 190,
                0.5,
                124, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Symphy can feel thunderstorms coming from many miles away. When it feels a storm coming, it climbs up a tree and sings a soothing song for the entire forest to hear. This lets other forest Pokémon know about the coming storm and also makes sure they are not afraid of it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.SING,5),
                        new MoveLearnSetEntry(Move.POPSHOT,10),
                        new MoveLearnSetEntry(Move.LIFE_DEW,15),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,20),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,25),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,30),
                        new MoveLearnSetEntry(Move.CHARGE,35),
                        new MoveLearnSetEntry(Move.GEYSERPULSE,40),
                        new MoveLearnSetEntry(Move.ICE_BEAM,45),
                        new MoveLearnSetEntry(Move.SOUNDWAVE,50),
                        new MoveLearnSetEntry(Move.THUNDER,55),
                        new MoveLearnSetEntry(Move.PERISH_SONG,60),
                        new MoveLearnSetEntry(Move.BOOMBURST,65)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 8, 29, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Symphy");

    }


}
