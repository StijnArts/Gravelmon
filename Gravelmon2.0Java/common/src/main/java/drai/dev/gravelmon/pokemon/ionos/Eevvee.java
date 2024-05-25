package drai.dev.gravelmon.pokemon.ionos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Eevvee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eevvee() {
        super("Eevvee",
                Type.QUESTION_MARK,
                new Stats(65,
                        55,
                        65,
                        60,
                        65,
                        45),
                List.of(Ability.ANALYTIC), Ability.ANALYTIC,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Around 3,000 years ago, Eevvee was claimed as the true ancestor of Eevee by the royal families of Ionos. The people of the region later found out that it was the other way around. The true intentions of this Pokémon was to control certain events in history; such as war, plagues and even during times of peace. The origins of Eevvee still remains a mystery."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.MIMIC,1),
                        new MoveLearnSetEntry(Move.COPYCAT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CURSE,1),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.DISABLE,18),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,28),
                        new MoveLearnSetEntry(Move.BITE,33),
                        new MoveLearnSetEntry(Move.PUNISHMENT,38),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,43),
                        new MoveLearnSetEntry(Move.RECOVER,50),
                        new MoveLearnSetEntry(Move.LAST_RESORT,55)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eevvee");

    }


}
