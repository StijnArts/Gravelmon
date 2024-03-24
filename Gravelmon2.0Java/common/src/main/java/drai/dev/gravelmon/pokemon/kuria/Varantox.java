package drai.dev.gravelmon.pokemon.kuria;

public class Varantox extends drai.dev.gravelmon.pokemon.Pokemon {
    public Varantox() {
        super("Varantox",
                Type.POISON,Type.COSMIC,
                new Stats(80,
                        68,
                        110,
                        120,
                        90,
                        54),
                List.of(Ability.WONDER_SKIN,Ability.ANTICIPATION), Ability.MAGIC_GUARD,
                15, 205,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                201, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MONSTER),
                List.of("Varantox hunts prey by putting webs coated in a powerful poison which can distort the reality around it. They use this to disorient those they trap."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Varantox");

    }


}
