package drai.dev.data.pokemon.insurgence.delta;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaSunkern extends Pokemon {
    public DeltaSunkern(String name, Aspect aspect) {
        super(name, aspect,"DeltaSunkern",
                Type.FIRE, Type.POISON,
                new Stats(30, 30,30,30,30,30),
                List.of(Ability.FLAME_BODY, Ability.ANALYTIC), Ability.POISON_POINT,
                3, 18,
                new Stats(0,0,0,1,0,0), 235,
                0.5,
                36, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("A Delta Species discovered by DankRabbit and EchoTheThird. It is able to emit a purple fire that poisons its enemies."),
                List.of(new EvolutionEntry("deltasunflora", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.INGRAIN,4),
                        new MoveLearnSetEntry(Move.POISON_POWDER,7),
                        new MoveLearnSetEntry(Move.EMBER,10),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,13),
                        new MoveLearnSetEntry(Move.SLUDGE,16),
                        new MoveLearnSetEntry(Move.INCINERATE,19),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,22),
                        new MoveLearnSetEntry(Move.ENDEAVOR,25),
                        new MoveLearnSetEntry(Move.WILLOWISP,28),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,31),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,34),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,37),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,40),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,43),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ACHILLES_HEEL,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.CORRODE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.WILDFIRE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_MATTER,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ACID,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor"),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor")
                        ),
                List.of(Label.GEN2,Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_CRIMSON)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Sunkern");
    }
}
