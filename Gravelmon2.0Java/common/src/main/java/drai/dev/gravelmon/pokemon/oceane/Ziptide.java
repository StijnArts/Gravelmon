package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ziptide extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ziptide() {
        super("Ziptide",
                Type.ELECTRIC,
                new Stats(50,
                        100,
                        50,
                        75,
                        75,
                        100),
                List.of(Ability.ANTICIPATION), Ability.SPEED_BOOST,
                16, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                158, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ziptide live for speed. They're usually seen zig zagging wherever you can find mad waves, bro. Taking a ziptide is harder said than done, if you're even fast enough to catch one."),
                List.of(),
                List.of(  new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.DISCHARGE,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,1),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.IRON_TAIL,1),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,1),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,1),
                        new MoveLearnSetEntry(Move.NUZZLE,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.SPARK,1),
                        new MoveLearnSetEntry(Move.SWEET_KISS,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,5)),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.RARE, 21, 56, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
