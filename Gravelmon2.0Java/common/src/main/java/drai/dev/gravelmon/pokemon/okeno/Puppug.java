package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Puppug extends drai.dev.gravelmon.pokemon.Pokemon {
    public Puppug() {
        super("Puppug",
                Type.FIRE,
                new Stats(60,
                        51,
                        40,
                        50,
                        40,
                        43),
                List.of(Ability.PICKUP,Ability.FLAME_BODY,Ability.GLUTTONY), Ability.GLUTTONY,
                5, 165,
                new Stats(1,0,0,0,0,0), 190,
                0.5,
                63, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Puppug love eating. Whenever they smell their favourite food they become agitated and start wiggling their tails. If you don't give them what they want, they'll spew flames."),
                List.of(new EvolutionEntry("boshishe", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.FLAMEPOUNCE,5),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,11),
                        new MoveLearnSetEntry(Move.REST,15),
                        new MoveLearnSetEntry(Move.INCINERATE,19),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,23),
                        new MoveLearnSetEntry(Move.FIRE_FANG,28),
                        new MoveLearnSetEntry(Move.OILFIRE,32),
                        new MoveLearnSetEntry(Move.ROAR,35),
                        new MoveLearnSetEntry(Move.REFRESH,39),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,44),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,50),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 2, 29, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Puppug");

    }


}
