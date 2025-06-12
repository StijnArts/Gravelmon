package drai.dev.data.pokemon.africanus;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Imperiavem extends drai.dev.data.pokemon.Pokemon {
    public Imperiavem() {
        super("Imperiavem",
                Type.FIRE,Type.FLYING,
                new Stats(82,
                        110,
                        65,
                        130,
                        73,
                        95),
                List.of(Ability.BLAZE,Ability.FLASH_FIRE), null,
                7, 160,
                new Stats(0,0,0,1,0,0), 255,
                1.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Imperiavem es un majestuoso pokémon y los soldados suelen llevarlo en sus estandartes. Su velocidad ha llegado a compararse con la del dios Mercurio."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHATTER,22),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,36),
                        new MoveLearnSetEntry(Move.DRILL_PECK,40),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,65),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,1),
                        new MoveLearnSetEntry(Move.SPQR,55),
                        new MoveLearnSetEntry(Move.TAILWIND,30),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,45),
                        new MoveLearnSetEntry(Move.WILLOWISP,28),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,60)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 53, 0.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Imperiavem");

    }


}
