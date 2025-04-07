package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Carcaheat extends drai.dev.data.pokemon.Pokemon {
    public Carcaheat() {
        super("Carcaheat",
                Type.FIRE, Type.FLYING,
                new Stats(37,
                        77,
                        37,
                        47,
                        37,
                        80),
                List.of(Ability.FLASH_FIRE,Ability.FIERYSPIRIT,Ability.DROUGHT), Ability.DROUGHT,
                8, 165,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("- Scratch Normal - EmberSTAB Fire 2 Leer Normal 6 GustSTAB Flying 9 Sand Attack Ground 13 Fury Attack Normal 17 Detect Fighting 21 Wing AttackSTAB Flying 25 Flame ChargeSTAB Fire 28 Razor Wind Normal 32 Sunny Day Fire 37 Aerial AceSTAB Flying 41 Sky AttackSTAB Flying 45 Solar FlareSTAB Fire 49 Flare BlitzSTAB Fire 53 Brave BirdSTAB Flying"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.LEER,2),
                        new MoveLearnSetEntry(Move.GUST,6),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,9),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,13),
                        new MoveLearnSetEntry(Move.DETECT,17),
                        new MoveLearnSetEntry(Move.WING_ATTACK,21),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,25),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,28),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,32),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,37),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,41),
                        new MoveLearnSetEntry(Move.SOLARFLARE,45),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,49),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,53),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.SETTINGSUN,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"tm"),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Carcaheat");

    }


}
