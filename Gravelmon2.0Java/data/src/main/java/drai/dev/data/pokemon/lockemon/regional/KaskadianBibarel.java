package drai.dev.data.pokemon.lockemon.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class KaskadianBibarel extends Pokemon {
    public KaskadianBibarel(String name, Aspect aspect) {
        super(name, aspect,"KaskadianBibarel",
                Type.STEEL, Type.PSYCHIC,
                new Stats(79, 50,55,85,70,71),
                List.of(Ability.SIMPLE, Ability.TRACE   ), Ability.GRAVITY_SLING,
                12, 654,
                new Stats(2,0,0,0,0,0), 127,
                0.5,
                150, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.FIELD),
                List.of("Through its antenna like whiskers, Bibarel can pick up on radio waves, making it highly intelligent. Its rumored that spies use Bibarel but it has never been confirmed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,5),
                        new MoveLearnSetEntry(Move.ROLLOUT,9),
                        new MoveLearnSetEntry(Move.METAL_CLAW,13),
                        new MoveLearnSetEntry(Move.TAUNT,17),
                        new MoveLearnSetEntry(Move.YAWN,21),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,25),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,29),
                        new MoveLearnSetEntry(Move.PSYCHIC,33),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,37),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,41),
                        new MoveLearnSetEntry(Move.SUPERPOWER,45),
                        new MoveLearnSetEntry(Move.CURSE,49),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,"egg"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"egg")
                ),
                List.of(Label.GEN4,Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 15, 39, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.2, 0.3,
                List.of());
        this.setLangFileName("Bibarel");
        this.setPortraitXYZ(0,1.8,0);
        setCanSwim(true);
    }
}
