package drai.dev.gravelmon.pokemon.otopo;

public class Molooze extends drai.dev.gravelmon.pokemon.Pokemon {
    public Molooze() {
        super("Molooze",
                Type.POISON,Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.WEAK_ARMOR,Ability.LIQUID_OOZE), Ability.HYDRATION,
                0, 0,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its shell is getting brittle due to the high acid content in the fluid it releases. Because the fluid it discharges dilutes in the water it lives in, it is presently not powerful enough to damage other Pokemon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAIN_DANCE,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Molooze");

    }


}
