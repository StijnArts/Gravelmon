package drai.dev.data.pokemon.lockemon.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class MixRotom extends Pokemon {
    public MixRotom(String name, Aspect aspect) {
        super(name, aspect,"MixRotom",
                Type.ELECTRIC, Type.GROUND,
                new Stats(50, 65,107,105,107,86),
                List.of(Ability.LEVITATE, Ability.ADAPTABILITY), Ability.MOLD_BREAKER,
                3, 3,
                new Stats(0,0,0,1,0,1), 45,
                0.5,
                67, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,10),
                        new MoveLearnSetEntry(Move.CHARGE,15),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,20),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,25),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,30),
                        new MoveLearnSetEntry(Move.HEX,35),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,40),
                        new MoveLearnSetEntry(Move.TRICK,45),
                        new MoveLearnSetEntry(Move.DISCHARGE,50),
                        new MoveLearnSetEntry(Move.UPROAR,55),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm")
                ),
                List.of(Label.GEN4,Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(40)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
        this.setLangFileName("Rotom");
        this.setCanFly(true);
    }
}
