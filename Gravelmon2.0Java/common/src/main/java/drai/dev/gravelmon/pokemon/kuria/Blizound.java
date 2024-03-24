package drai.dev.gravelmon.pokemon.kuria;

public class Blizound extends drai.dev.gravelmon.pokemon.Pokemon {
    public Blizound() {
        super("Blizound",
                Type.SOUND,Type.ICE,
                new Stats(88,
                        115,
                        80,
                        69,
                        80,
                        88),
                List.of(Ability.REFRIGERATE), Ability.REFRIGERATE,
                18, 1651,
                new Stats(0,2,0,0,0,0), 45,
                0.75,
                194, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("With heightened hearing from its ears and powerful sound projection from its jaws, Blizound uses a variety of resonating projectiles and freezing frontal assaults to hunt prey and locate allies."),
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
           setLangFileName("Blizound");

    }


}
