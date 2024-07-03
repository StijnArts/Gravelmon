package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Stelysium extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stelysium() {
        super("Stelysium",
                Type.PSYCHIC, Type.ELECTRIC,
                new Stats(118,
                        60,
                        75,
                        150,
                        120,
                        85),
                List.of(Ability.ILLUMINATE,Ability.TELEPATHY), Ability.WONDER_SKIN,
                13, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The counterpart of Bohemolock. Stelysium clandestinely travels village to village search for those who perform beneficent deeds for others to ascend with her to another world after they have passed in this one."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.GRAVITY,1),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,8),
                        new MoveLearnSetEntry(Move.PSYWAVE,16),
                        new MoveLearnSetEntry(Move.WATER_PULSE,24),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,30),
                        new MoveLearnSetEntry(Move.PSYSHOCK,35),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,40),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,46),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,52),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,56),
                        new MoveLearnSetEntry(Move.CALM_MIND,63)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 32, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stelysium");

    }


}
