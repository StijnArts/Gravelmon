package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Carcaheet extends drai.dev.data.pokemon.Pokemon {
    public Carcaheet() {
        super("Carcaheet",
                Type.FIRE,Type.FLYING,
                new Stats(37,
                        57,
                        37,
                        47,
                        37,
                        80),
                List.of(Ability.EARLY_BIRD,Ability.FIERYSPIRIT), Ability.DROUGHT,
                5, 0,
                new Stats(0,1,0,0,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("- Scratch Normal - EmberSTAB Fire 2 Leer Normal 6 GustSTAB Flying 9 Sand Attack Ground 13 Fury Attack  Normal 17 Detect Fighting 21 Wing AttackSTAB Flying 25 Flame ChargeSTAB Fire 28 Razor Wind Normal 32 Sunny Day Fire 37 Aerial AceSTAB Flying 41 Solar FlareSTAB Fire 45 Feather RushSTAB Flying 49 Flare BlitzSTAB Fire 53 Brave BirdSTAB Flying"),
                List.of(new EvolutionEntry("carcahawk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
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
                        new MoveLearnSetEntry(Move.SOLARFLARE,41),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,45),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,49),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,53),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 34, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
