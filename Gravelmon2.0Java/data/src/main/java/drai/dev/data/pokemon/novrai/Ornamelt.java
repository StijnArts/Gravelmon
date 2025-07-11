package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ornamelt extends drai.dev.data.pokemon.Pokemon {
    public Ornamelt() {
        super("Ornamelt",
                Type.POISON, Type.STEEL,
                new Stats(75,
                        75,
                        165,
                        75,
                        75,
                        35),
                List.of(Ability.INTIMIDATE,Ability.SHELL_ARMOR,Ability.LIQUID_OOZE), Ability.LIQUID_OOZE,
                12, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MINERAL),
                List.of("Ornamelt's eggshell has been reinforced with a resilient metal alloy. It uses sticky slime to attach jewels and gold trim to its shell in order to attract potential mates."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,5),
                        new MoveLearnSetEntry(Move.PROTECT,10),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,13),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,16),
                        new MoveLearnSetEntry(Move.ROLLOUT,20),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,25),
                        new MoveLearnSetEntry(Move.TOXICFUMES,27),
                        new MoveLearnSetEntry(Move.EGG_BOMB,30),
                        new MoveLearnSetEntry(Move.GYRO_BALL,32),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,36),
                        new MoveLearnSetEntry(Move.TOXIC,40),
                        new MoveLearnSetEntry(Move.FILTHY_TERRAIN,44),
                        new MoveLearnSetEntry(Move.SOFTBOILED,49),
                        new MoveLearnSetEntry(Move.BELCH,51),
                        new MoveLearnSetEntry(Move.BANEFUL_BUNKER,55),
                        new MoveLearnSetEntry(Move.METAL_BURST,58),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,62),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.FILTHY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.ICE_SPINNER,"tm"),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,"tm"),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm")                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(22)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FOLIAGE)
    .build(), List.of());
	
           setLangFileName("Ornamelt");

    }


}
