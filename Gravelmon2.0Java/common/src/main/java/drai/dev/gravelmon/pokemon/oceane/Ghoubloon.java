package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ghoubloon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ghoubloon() {
        super("Ghoubloon",
                Type.GHOST,Type.DARK,
                new Stats(45,
                        60,
                        55,
                        60,
                        40,
                        40),
                List.of(Ability.JACKPOT,Ability.STEELWORKER,Ability.CURSED_BODY), Ability.CURSED_BODY,
                8, 165,
                new Stats(0,1,0,0,0,0), 240,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MINERAL),
                List.of("It dislikes human contact, so it seeks the most remote, secret hideaways. Unfortunately, this just makes them more sought after by treasure hunters. It's able to create coins, but they are only illusions which fade away in a day."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,1),
                        new MoveLearnSetEntry(Move.ASTONISH,7),
                        new MoveLearnSetEntry(Move.CURSE,12),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,15),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,18),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,21),
                        new MoveLearnSetEntry(Move.HEX,25),
                        new MoveLearnSetEntry(Move.NUGGETFLING,29),
                        new MoveLearnSetEntry(Move.GRUDGE,33),
                        new MoveLearnSetEntry(Move.FLING,37),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,41),
                        new MoveLearnSetEntry(Move.GOLD_BREAKER,46)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ghoubloon");

    }


}
