package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Eleflutter extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eleflutter() {
        super("Eleflutter",
                Type.FAIRY,
                new Stats(125,
                        68,
                        68,
                        68,
                        68,
                        55),
                List.of(Ability.SUPER_LUCK,Ability.THICK_FAT,Ability.PIXILATE), Ability.PIXILATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Double-Edge Normal Water Gun Water Heal Bell Normal Wish Normal Healing Wish Psychic Heal Pulse Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.WATER_GUN,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.HEALING_WISH,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eleflutter");

    }


}
