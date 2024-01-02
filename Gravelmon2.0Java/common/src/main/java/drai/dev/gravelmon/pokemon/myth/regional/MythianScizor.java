package drai.dev.gravelmon.pokemon.myth.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class MythianScizor extends Pokemon {
    public MythianScizor(int dexNo) {
        super(dexNo,"MythianScizor",
                Type.FIRE, Type.GHOST,
                new Stats(70,130,100,55,80,65),
                List.of(Ability.SHEER_FORCE,Ability.CURSED_BODY), Ability.SHADOW_TAG,
                15, 560,
                new Stats(0,1,0,0,0,0), 25,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It has a steel-hard body. It intimidates foes by upraising its eye-patterned pincers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,1),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,1),
                        new MoveLearnSetEntry(Move.AGILITY,1),
                        new MoveLearnSetEntry(Move.AIR_SLASH,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,1),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,1),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,12),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,16),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,20),
                        new MoveLearnSetEntry(Move.SLASH,24),
                        new MoveLearnSetEntry(Move.WILLOWISP,28),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,32),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,36),
                        new MoveLearnSetEntry(Move.THUNDER,40),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,44),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,48),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,48),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"egg"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"egg"),
                        new MoveLearnSetEntry(Move.REVERSAL,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"egg"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.DEFOG,"egg"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"egg"),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,"egg")
                ),
                List.of(Label.GEN2,Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 50, 55, 0.02, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Scizor");
        this.setCanFly(true);
    }
}
