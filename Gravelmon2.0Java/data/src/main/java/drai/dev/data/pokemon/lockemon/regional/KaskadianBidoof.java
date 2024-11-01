package drai.dev.data.pokemon.lockemon.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class KaskadianBidoof extends Pokemon {
    public KaskadianBidoof(String name, Aspect aspect) {
        super(name, aspect,"KaskadianBidoof",
                Type.NORMAL, Type.STEEL,
                new Stats(59, 40,40,35,45,31),
                List.of(Ability.SIMPLE, Ability.TRACE   ), Ability.GRAVITY_SLING,
                5, 200,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                50, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.FIELD),
                List.of("With a more iron rich diet, Bidoof's teeth become much stronger, allowing it to chomp through trees in seconds. It was brought to the region to help with construction back when Kaskade was young."),
                List.of(new EvolutionEntry("kaskadianbibarel", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,5),
                        new MoveLearnSetEntry(Move.ROLLOUT,9),
                        new MoveLearnSetEntry(Move.METAL_CLAW,13),
                        new MoveLearnSetEntry(Move.TAUNT,17),
                        new MoveLearnSetEntry(Move.YAWN,21),
                        new MoveLearnSetEntry(Move.CRUNCH,25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,29),
                        new MoveLearnSetEntry(Move.SUPER_FANG,33),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,37),
                        new MoveLearnSetEntry(Move.IRON_TAIL,41),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 1, 25, 9.0, List.of(

                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.FRESHWATER),
                0.2, 0.3,
                List.of());
        this.setLangFileName("Bidoof");
        this.setPortraitXYZ(0,1.8,0);
        setCanSwim(true);
    }
}
