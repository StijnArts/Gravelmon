package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Grieflame extends Pokemon {
    public Grieflame() {
        super( "Grieflame",
                Type.FIRE, Type.GHOST,
                new Stats(45	,
                        45,
                        40	,
                        60,
                        45,
                        80),
                List.of(Ability.FLAME_BODY), Ability.INSOMNIA,
                7, 24,
                new Stats(0,0,0,0,0,1), 120,
                0.25,
                82, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS, EggGroup.FAIRY),
                List.of("Looking closely into its face during the night will reveal images of the Distortion World."),
                List.of(new EvolutionEntry("scorment", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,6),
                        new MoveLearnSetEntry(Move.HYPNOSIS,8),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,13),
                        new MoveLearnSetEntry(Move.DIZZY_WHIRL,15),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,20),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,22),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,27),
                        new MoveLearnSetEntry(Move.DREAM_EATER,29),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,34),
                        new MoveLearnSetEntry(Move.WILLOWISP,36),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,41),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,43),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,48),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,50),
                        new MoveLearnSetEntry(Move.INFERNO,55),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.RAGING_FLAME,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_SPARK,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.PSYGATLING,"tutor"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.CURSED_WRATH,"egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"egg"),
                        new MoveLearnSetEntry(Move.FLATTER,"egg"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"egg"),
                        new MoveLearnSetEntry(Move.GRUDGE,"egg"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"egg"),
                        new MoveLearnSetEntry(Move.MIMIC,"egg"),
                        new MoveLearnSetEntry(Move.MINIMIZE,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"egg"),
                        new MoveLearnSetEntry(Move.POSSESS,"egg"),
                        new MoveLearnSetEntry(Move.PROTECT,"egg"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"egg"),
                        new MoveLearnSetEntry(Move.PSYWAVE,"egg"),
                        new MoveLearnSetEntry(Move.RETURN,"egg"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"egg"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"egg"),
                        new MoveLearnSetEntry(Move.SNATCH,"egg"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.SOUL_BREAK,"egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
    }
}
