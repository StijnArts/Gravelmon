package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Coraga extends Pokemon {
    public Coraga() {
        super( "Coraga",
                Type.GROUND,
                new Stats(95	,
                        135,
                        105	,
                        60,
                        65,
                        70),
                List.of(Ability.SAND_VEIL), Ability.INTIMIDATE,
                16, 805,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                158, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A Pokemon with five different heads. The head covered with a shell is the only one capable of intelligent thought."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,3),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,11),
                        new MoveLearnSetEntry(Move.SANDSTORM,13),
                        new MoveLearnSetEntry(Move.GROWL,15),
                        new MoveLearnSetEntry(Move.SCARY_FACE,21),
                        new MoveLearnSetEntry(Move.BULLDOZE,23),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,25),
                        new MoveLearnSetEntry(Move.BURROW,31),
                        new MoveLearnSetEntry(Move.EGG_BOMB,33),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,35),
                        new MoveLearnSetEntry(Move.GLARE,41),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,43),
                        new MoveLearnSetEntry(Move.PROTECT,45),
                        new MoveLearnSetEntry(Move.OUTRAGE,51),
                        new MoveLearnSetEntry(Move.WORK_UP,53),
                        new MoveLearnSetEntry(Move.GRAND_BOULDER,55),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.DEVASTATE,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.RAGING_FLAME,"tm"),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_BEAT,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.PSYGATLING,"tutor")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 22, 42, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SANDY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
    }
}
