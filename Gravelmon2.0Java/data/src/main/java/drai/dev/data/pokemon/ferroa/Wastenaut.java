package drai.dev.data.pokemon.ferroa;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Wastenaut extends drai.dev.data.pokemon.Pokemon {
    public Wastenaut() {
        super("Wastenaut",
                Type.GHOST, Type.POISON,
                new Stats(135,
                        50,
                        50,
                        105,
                        115,
                        45),
                List.of(Ability.OVERCOAT,Ability.CLEAR_BODY,Ability.FILTER), Ability.FILTER,
                18, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("The interior of its tough skin is filled with toxic slime. It sucks up as much poison as it can hold, then explosively releases it all."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SMOG,7),
                        new MoveLearnSetEntry(Move.REFRESH,12),
                        new MoveLearnSetEntry(Move.SLUDGE,15),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,19),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,22),
                        new MoveLearnSetEntry(Move.PURIFY,25),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,28),
                        new MoveLearnSetEntry(Move.SWALLOW,32),
                        new MoveLearnSetEntry(Move.TOXICFUMES,35),
                        new MoveLearnSetEntry(Move.CROPCIRCLE,38),
                        new MoveLearnSetEntry(Move.STORED_POWER,42),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,46),
                        new MoveLearnSetEntry(Move.EXPLOSION,50),
                        new MoveLearnSetEntry(Move.BIND,"tm"),
                        new MoveLearnSetEntry(Move.BLOCK,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.FILTHY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,"tm"),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.POLTERGEIST,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYDROKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.STARSTREAM,"tm"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Wastenaut");

    }


}
