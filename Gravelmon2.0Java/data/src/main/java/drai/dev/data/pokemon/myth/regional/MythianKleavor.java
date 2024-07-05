package drai.dev.data.pokemon.myth.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class MythianKleavor extends Pokemon {
    public MythianKleavor(String name, Aspect aspect) {
        super(name, aspect,"MythianKleavor",
                Type.FIRE, Type.ROCK,
                new Stats(70,135,95,45,70,85),
                List.of(Ability.SHEER_FORCE,Ability.CURSED_BODY), Ability.SHADOW_TAG,
                15, 560,
                new Stats(0,0,0,0,1,0), 45,
                0.5,
                120, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("The minerals native to Mythan cause a weird outbreak that causes Scyther to react to the pure touch or aroma of the minerals."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.SILVER_WIND,6),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,11),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,14),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,14),
                        new MoveLearnSetEntry(Move.AIR_SLASH,18),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,25),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,29),
                        new MoveLearnSetEntry(Move.CURSE,31),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,33),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,34),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,39),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,41),
                        new MoveLearnSetEntry(Move.STARBOLT,46),
                        new MoveLearnSetEntry(Move.BODY_SLAM,51),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,60),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,66),
                        new MoveLearnSetEntry(Move.ERUPTION,71),
                        new MoveLearnSetEntry(Move.SPIRIT_SHACKLE,77),
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
                List.of(Label.GEN8,Label.MYTH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 50, 55, 0.02, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Kleavor");
    }
}
