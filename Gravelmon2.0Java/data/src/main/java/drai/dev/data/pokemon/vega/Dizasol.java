package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Dizasol extends Pokemon {
    public Dizasol() {
        super( "Dizasol",
                Type.DARK,
                new Stats(70,
                        135,
                        70,
                        115,
                        80,
                        85),
                List.of(Ability.PRESSURE), Ability.SUPER_LUCK,
                15, 590,
                new Stats(0,3,0,0,0,0), 15,
                0.5,
                199, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYCRUSH,1),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.DARK_ROAR,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.DARK_ROAR,7),
                        new MoveLearnSetEntry(Move.PURSUIT,10),
                        new MoveLearnSetEntry(Move.TAUNT,13),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,19),
                        new MoveLearnSetEntry(Move.SLASH,22),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,25),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,29),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,30),
                        new MoveLearnSetEntry(Move.DETECT,34),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,39),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,44),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,49),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,54),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,59),
                        new MoveLearnSetEntry(Move.PERISH_SONG,64),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FROSTBITE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.DARK_ROAR,"tutor"),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_CUTTER,"tutor"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.PUNISHMENT,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.HEX,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"tutor"),
                        new MoveLearnSetEntry(Move.BLACK_HOLE,"tutor"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg"),
                        new MoveLearnSetEntry(Move.BOUNCE,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DARK_ROAR,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"egg"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"egg"),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"egg"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"egg"),
                        new MoveLearnSetEntry(Move.ROCKET_DRIVE,"egg"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"egg"),
                        new MoveLearnSetEntry(Move.SHADOW_SPLIT,"egg"),
                        new MoveLearnSetEntry(Move.SHARPSHOOT,"egg"),
                        new MoveLearnSetEntry(Move.SNATCH,"egg"),
                        new MoveLearnSetEntry(Move.SPITE,"egg"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"egg"),
                        new MoveLearnSetEntry(Move.VENGEANCE,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(30)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setPreEvolution("absol");
        addAdditionalEvolution("absol", new EvolutionEntry("dizasol", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30"))));
    }
}
