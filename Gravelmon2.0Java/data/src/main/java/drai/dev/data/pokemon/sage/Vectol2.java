package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Vectol2 extends Pokemon {
    public Vectol2() {
        super("Vectol.2",
                Type.POISON,
                new Stats(43, 95, 60, 105, 70, 97),
                List.of(Ability.VOLT_ABSORB, Ability.FEEDBACK), Ability.POISON_TOUCH,
                9, 183,
                new Stats(0,0,0,1,0,1), 75,
                -1,
                165, ExperienceGroup.MEDIUM_FAST,
                70,
                39, List.of(EggGroup.BUG, EggGroup.MINERAL),
                List.of("Exposed to an unknown code, Vectol has upgraded to Vectol.2. It feeds by using its stinger to download data, leaving computers a corrupt mess afterwards."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,1),
                        new MoveLearnSetEntry(Move.MIMIC,1),
                        new MoveLearnSetEntry(Move.OVERDRIVE,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.CONVERSION,1),
                        new MoveLearnSetEntry(Move.CONVERSION_2,1),
                        new MoveLearnSetEntry(Move.PURSUIT,4),
                        new MoveLearnSetEntry(Move.DISABLE,8),
                        new MoveLearnSetEntry(Move.ELECTROWEB,12),
                        new MoveLearnSetEntry(Move.DETECT,15),
                        new MoveLearnSetEntry(Move.POISON_TAIL,19),
                        new MoveLearnSetEntry(Move.TAUNT,23),
                        new MoveLearnSetEntry(Move.SPARK,26),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,30),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,34),
                        new MoveLearnSetEntry(Move.CROSS_POISON,37),
                        new MoveLearnSetEntry(Move.CORRUPT,41),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,45),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,48),
                        new MoveLearnSetEntry(Move.POISON_JAB,52),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,56),
                        new MoveLearnSetEntry(Move.NULL_ROOM,59),
                        new MoveLearnSetEntry(Move.POSSESSION,63),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.PINCER_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tutor")
                        ),
                List.of(Label.SAGE),
                1, List.of(
                        new ItemDrop("gravelmon:corrupted_disc",40, 1,1)
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(22)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	

    }
}
