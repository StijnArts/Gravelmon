package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Boshishe extends drai.dev.gravelmon.pokemon.Pokemon {
    public Boshishe() {
        super("Boshishe",
                Type.FIRE,
                new Stats(127,
                        92,
                        70,
                        70,
                        70,
                        55),
                List.of(Ability.OBLIVIOUS,Ability.FLAME_BODY,Ability.GLUTTONY), Ability.GLUTTONY,
                9, 165,
                new Stats(2,0,0,0,0,0), 75,
                0.5,
                174, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Boshishe eat more than 50 pounds of food every day. Keeping one as a pet is no easy task because of their never-ending appetite. In spite of this, they make incredibly loyal partners."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.CRUNCH,49),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,53),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,63),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_BURST,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.BURN_UP,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.BELCH,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 45, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Boshishe");

    }


}
