package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.azure.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Azure extends Game {
    public static final Game INSTANCE = new Azure();

    private Azure() {
        super("Azure");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new MysticTreecko("Treecko", Aspect.MYSTIC).setPreferredBlocks("minecraft:blue_wool"));
        addNewPokemon(new MysticGrovyle("Grovyle", Aspect.MYSTIC));
        addNewPokemon(new MysticSceptile("Sceptile", Aspect.MYSTIC));
        addNewPokemon(new MysticTorchic("Torchic", Aspect.MYSTIC).setPreferredBlocks("minecraft:amethyst_block"));
        addNewPokemon(new MysticCombusken("Combusken", Aspect.MYSTIC));
        addNewPokemon(new MysticBlaziken("Blaziken", Aspect.MYSTIC));
        addNewPokemon(new MysticMudkip("Mudkip", Aspect.MYSTIC).setPreferredBlocks("minecraft:sandstone"));
        addNewPokemon(new MysticMarshtomp("Marshtomp", Aspect.MYSTIC));
        addNewPokemon(new MysticSwampert("Swampert", Aspect.MYSTIC));
        addNewPokemon(new MysticPoochyena("Poochyena", Aspect.MYSTIC).setPreferredBlocks("minecraft:bone_block"));
        addNewPokemon(new MysticMightyena("Mightyena", Aspect.MYSTIC));
        addNewPokemon(new MysticRiolu("", Aspect.MYSTIC).setPreferredBlocks("minecraft:sandstone"));
        addNewPokemon(new MysticLucario("", Aspect.MYSTIC));

        addNewPokemon(new MysticStufful("", Aspect.MYSTIC));
        addNewPokemon(new MysticBewear("", Aspect.MYSTIC));

        addNewPokemon(new MysticVoltorb("", Aspect.MYSTIC).setPreferredBlocks("minecraft:amethyst_block"));
        addNewPokemon(new MysticElectrode("", Aspect.MYSTIC));

        addNewPokemon(new MysticSolosis("", Aspect.MYSTIC));
        addNewPokemon(new MysticDuosion("", Aspect.MYSTIC));
        addNewPokemon(new MysticReuniclus("", Aspect.MYSTIC));
    }
}
