package drai.dev.data.pokemon.aristos.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class AristosianTaillow extends drai.dev.data.pokemon.Pokemon {
    public AristosianTaillow() {
        super("Taillow",
                Type.ELECTRIC, Type.FLYING,
                new Stats(40,
                        30,
                        30,
                        55,
                        30,
                        85),
                List.of(Ability.KEEN_EYE), Ability.LIGHTNING_ROD,
                8, 165,
                new Stats(0,0,0,0,0,1), 200,
                0.5,
                54, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("With every flap of its wings, Taillow's body generates and stores electricity. At full power capacity, its body discharges abruptly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.WING_ATTACK,13),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,17),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,21),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,24),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.AIR_SLASH,32),
                        new MoveLearnSetEntry(Move.ENDEAVOR,37),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,42),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,47),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,52)                        ),
                List.of(Label.ARISTOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Taillow");

    }


}
