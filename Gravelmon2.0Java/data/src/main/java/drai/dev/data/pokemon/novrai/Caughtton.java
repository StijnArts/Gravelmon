package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Caughtton extends drai.dev.data.pokemon.Pokemon {
    public Caughtton() {
        super("Caughtton",
                Type.NORMAL,
                new Stats(64,
                        59,
                        28,
                        34,
                        49,
                        76),
                List.of(Ability.STATIC,Ability.SYMBIOSIS,Ability.FLUFFY), Ability.FLUFFY,
                2, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("A social species that greets others of its kind by rubbing up against each other affectionately. This builds static electricity in its body, which it then uses to defend itself against attackers."),
                List.of(new EvolutionEntry("amalgarment", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHARGE,1),
                        new MoveLearnSetEntry(Move.POUND,4),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,8),
                        new MoveLearnSetEntry(Move.HELPING_HAND,12),
                        new MoveLearnSetEntry(Move.ASSIST,15),
                        new MoveLearnSetEntry(Move.FAKE_OUT,20),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,24),
                        new MoveLearnSetEntry(Move.SPARK,27),
                        new MoveLearnSetEntry(Move.TICKLE,31),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,33),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,36),
                        new MoveLearnSetEntry(Move.ELECTRICCHEER,40),
                        new MoveLearnSetEntry(Move.CRUSH_GRIP,42),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,45),
                        new MoveLearnSetEntry(Move.LAST_RESORT,49),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,53),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,"tm"),
                        new MoveLearnSetEntry(Move.BESTOW,"tm"),
                        new MoveLearnSetEntry(Move.FORCE_PALM,"tm"),
                        new MoveLearnSetEntry(Move.NUZZLE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WATER_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Caughtton");

    }


}
