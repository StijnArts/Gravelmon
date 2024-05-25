package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Machu extends Pokemon {
    public Machu() {
        super("Machu",
                Type.ELECTRIC, Type.FIGHTING,
                new Stats(85, 130, 80, 50, 40, 90),
                List.of(Ability.STATIC), Ability.CUTE_CHARM,
                13, 698,
                new Stats(0,3,0,0,0,0), 35,
                0.5,
                152, ExperienceGroup.MEDIUM_FAST,
                70,
                39, List.of(EggGroup.FIELD, EggGroup.FAIRY),
                List.of("Its throat is so powerful that a loud enough roar can form a blade of air that slices even the sky. "),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.FORESIGHT,10),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,13),
                        new MoveLearnSetEntry(Move.ROLLING_KICK,18),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,21),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,26),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,29),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,34),
                        new MoveLearnSetEntry(Move.DETECT,37),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,42),
                        new MoveLearnSetEntry(Move.BULK_UP,45),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,50),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DEVASTATE,"tm"),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_SPARK,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.DIG,"tutor"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.PSYGATLING,"tutor"),
                        new MoveLearnSetEntry(Move.BIDE,"egg"),
                        new MoveLearnSetEntry(Move.CHARGE,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,"egg"),
                        new MoveLearnSetEntry(Move.ENCORE,"egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.ENERGIZE,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"egg"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"egg"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"egg"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"egg"),
                        new MoveLearnSetEntry(Move.MIMIC,"egg"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"egg"),
                        new MoveLearnSetEntry(Move.PRESENT,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.RETURN,"egg"),
                        new MoveLearnSetEntry(Move.REVERSAL,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg"),
                        new MoveLearnSetEntry(Move.SPARK,"egg"),
                        new MoveLearnSetEntry(Move.SWIFT,"egg"),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.VOLT_TACKLE,"egg"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")
                        ),
                List.of(Label.VEGA),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 8, 28, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.43, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setBaseScale(1);
        this.setHitbox(0.8,1.4);
        this.setModeled(true);
        this.setPreEvolution("pikachu");
    }
}
