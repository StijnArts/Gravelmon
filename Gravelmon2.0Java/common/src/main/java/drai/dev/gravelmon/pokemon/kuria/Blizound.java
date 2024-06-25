package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Blizound extends drai.dev.gravelmon.pokemon.Pokemon {
    public Blizound() {
        super("Blizound",
                Type.SOUND, Type.ICE,
                new Stats(88,
                        115,
                        80,
                        69,
                        80,
                        88),
                List.of(Ability.REFRIGERATE), Ability.REFRIGERATE,
                18, 1651,
                new Stats(0,2,0,0,0,0), 45,
                0.75,
                194, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("With heightened hearing from its ears and powerful sound projection from its jaws, Blizound uses a variety of resonating projectiles and freezing frontal assaults to hunt prey and locate allies."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.FLAIL,10),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.MIST,20),
                        new MoveLearnSetEntry(Move.ENDURE,25),
                        new MoveLearnSetEntry(Move.ICY_WIND,30),
                        new MoveLearnSetEntry(Move.AMNESIA,35),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,40),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,45),
                        new MoveLearnSetEntry(Move.BLIZZARD,50)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 51, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Blizound");

    }


}
