package drai.dev.gravelmon.pokemon.kuria;

public class Frostyke extends drai.dev.gravelmon.pokemon.Pokemon {
    public Frostyke() {
        super("Frostyke",
                Type.SOUND,Type.ICE,
                new Stats(48,
                        75,
                        50,
                        34,
                        50,
                        63),
                List.of(Ability.REFRIGERATE), Ability.REFRIGERATE,
                7, 237,
                new Stats(0,1,0,0,0,0), 200,
                0.75,
                70, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It buries itself in the snow and attacks through ambushed strikes. It makes a distinct chilling howl that makes one shudder."),
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
           setLangFileName("Frostyke");

    }


}
