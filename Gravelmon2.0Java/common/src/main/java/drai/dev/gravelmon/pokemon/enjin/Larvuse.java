package drai.dev.gravelmon.pokemon.enjin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Larvuse extends drai.dev.gravelmon.pokemon.Pokemon {
    public Larvuse() {
        super("Larvuse",
                Type.FIRE,
                new Stats(42,
                        55,
                        45,
                        50,
                        45,
                        63),
                List.of(Ability.BLAZE), Ability.SNIPER,
                3, 200,
                new Stats(0,0,0,0,0,1), 45,
                0.75,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Larvuse can make large jumps by propelling itself forward using the fire leaking from its abdomen like a jet engine. It feeds on leaves and twigs to keep this fire burning, as igniting it takes energy."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.EMBER,7),
                        new MoveLearnSetEntry(Move.LIGHTUP,12),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,15),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,18),
                        new MoveLearnSetEntry(Move.AGILITY,22),
                        new MoveLearnSetEntry(Move.FEINT,25),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,29),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,34),
                        new MoveLearnSetEntry(Move.UTURN,40),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,46),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,51),
                        new MoveLearnSetEntry(Move.FORESIGHT,"tm"),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.ENERGYLOOP,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Larvuse");

    }


}
