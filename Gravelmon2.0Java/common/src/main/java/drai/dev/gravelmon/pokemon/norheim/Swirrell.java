package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Swirrell extends drai.dev.gravelmon.pokemon.Pokemon {
    public Swirrell() {
        super("Swirrell",
                Type.FIRE,Type.ELECTRIC,
                new Stats(60,
                        76,
                        60,
                        76,
                        70,
                        86),
                List.of(Ability.STATIC,Ability.FLAME_BODY,Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                5, 165,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Swirrell thrives in forest fires. Hollow and burnt out logs and trees makes a suitable home to raise a family in. They are swift to escape, leaving smoke clouds behind them"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.HELPING_HAND,8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,11),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,15),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,18),
                        new MoveLearnSetEntry(Move.NUZZLE,23),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,27),
                        new MoveLearnSetEntry(Move.SPIT_UP,31),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,35),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,40),
                        new MoveLearnSetEntry(Move.AGILITY,45),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,52),
                        new MoveLearnSetEntry(Move.VOLT_TACKLE,60),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PLEDGE,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 9, 27, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER, Biome.IS_WINTER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Swirrell");

    }


}
