package drai.dev.gravelmon.pokemon.nodorro;

public class Crabbish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crabbish() {
        super("Crabbish",
                Type.POISON,Type.BUG,
                new Stats(50,
                        85,
                        110,
                        60,
                        75,
                        75),
                List.of(Ability.SWARM,Ability.POISON_TOUCH), Ability.LIQUID_OOZE,
                10, 280,
                new Stats(0,1,2,0,0,0), 0,
                0.5,
                183, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crabbish");

    }


}
