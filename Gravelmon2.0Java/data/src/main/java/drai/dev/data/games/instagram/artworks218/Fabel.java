package drai.dev.data.games.instagram.artworks218;


import drai.dev.data.pokemon.fabel.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Fabel extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Fabel();
    private Fabel() {
        super("Fabel");
    }

    @Override
    public void init(String resourcesDir) {
        super.init(resourcesDir);
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().add(Label.INSTAGRAM);
        });
    }

    @Override
    public void registerPokemon() {
        removePokedexPokemon("yungoos-fabelian, gumshoos-fabelian, bidoof-fabelian, bibarel-fabelian");
        addNewPokemon(new Bibrawler());
        removePokedexPokemon("hoothoot-fabelian, noctowl-fabelian");
        addNewPokemon(new Kloctowl());
        removePokedexPokemon("rattata-fabelian");
        addNewPokemon(new Ratoxicate());
        removePokedexPokemon("wooloo-fabelian, dubwool-fabelian, meowth-fabelian");
        addNewPokemon(new Purrlite());
        removePokedexPokemon("spinarak-fabelian, ariados-fabelian");
        addNewPokemon(new Scariados());
        removePokedexPokemon("glameow-fabelian");
        addNewPokemon(new Purretty());
        removePokedexPokemon("sinistea-fabelian, polteageist-fabelian, timburr-fabelian, gurdurr-fabelian");
        addNewPokemon(new Woodendurr());
        removePokedexPokemon("roggenrola-fabelian, boldore-fabelian");
        addNewPokemon(new Gigasmith());
        removePokedexPokemon("pachirisu-fabelian, tyrogue, hitmonchan, hitmonlee, hitmontop");
        addNewPokemon(new Hitmonthro());
        addNewPokemon(new Hitmonkick());
        removePokedexPokemon("lillipup-fabelian, herdier-fabelian");
        addNewPokemon(new Hoodwoolf());
        removePokedexPokemon("falinks-fabelian, chatot-fabelian");
        addNewPokemon(new Chathroom());
        addNewPokemon(new Chathride());
        removePokedexPokemon("snover-fabelian");
        addNewPokemon(new Abomaswamp());
        removePokedexPokemon("applin-fabelian");
        addNewPokemon(new Applegrum());
        addNewPokemon(new Scrapple());
        removePokedexPokemon("smeargle-fabelian");
        addNewPokemon(new Dalmatoon());
        removePokedexPokemon("ralts-fabelian, kirlia-fabelian");
        addNewPokemon(new Gardefleur());
        removePokedexPokemon("sprigatito, floragato");
        addNewPokemon(new Walpurrgeow());
        removePokedexPokemon("scorbunny, raboot");
        addNewPokemon(new Lorderace());
        removePokedexPokemon("froakie, frogadier");
        addNewPokemon(new Frogermit());
        addNewPokemon(new Ironblaster());
        addNewPokemon(new Ironmask());
        addNewPokemon(new Ironcauldron());
        addNewPokemon(new Savagesword());
        addNewPokemon(new Ragingfist());
        addNewPokemon(new Fluffyscales());
        removePokedexPokemon("poliwag-fabelian, poliwhirl-fabelian");
        addNewPokemon(new Poliwring());
        removePokedexPokemon("shuckle-fabelian");
        addNewPokemon(new Shrookle());
        removePokedexPokemon("yamask-fabelian");
        addNewPokemon(new Mirorigus());
        removePokedexPokemon("onix-fabelian");
        addNewPokemon(new Alphinix());
        removePokedexPokemon("hatenna-fabelian, hattrem-fabelian");
        addNewPokemon(new Hatteficent());
        removePokedexPokemon("stantler-fabelian, wyrdeer-fabelian, oddish-fabelian, gloom-fabelian");
        addNewPokemon(new Potatoom());
        removePokedexPokemon("seel-fabelian, dewgong-fabelian, sableye-fabelian");
        addNewPokemon(new Rumpeleye());
        removePokedexPokemon("woobat-fabelian");
        addNewPokemon(new Nosfroobat());
        removePokedexPokemon("snorunt-fabelian");
        addNewPokemon(new Usuprass());
        removePokedexPokemon("sugarva-fabelian, cottoon-fabelian, sugottornet-fabelian, milcery-fabelian");
        addNewPokemon(new Alcheesie());
        removePokedexPokemon("swablu-fabelian");
        addNewPokemon(new Basiria());
        removePokedexPokemon("mudbray-fabelian");
        addNewPokemon(new Gearbray());
        removePokedexPokemon("minior-fabelian, sandygast-fabelian");
        addNewPokemon(new Gingaucand());
        removePokedexPokemon("smoochum, jynx-fabelian");
        addNewPokemon(new Huldynx());
        removePokedexPokemon("cherubi-fabelian");
        addNewPokemon(new Cherrath());
        removePokedexPokemon("litwick-fabelian, lampent-fabelian, chandelure-fabelian, impidimp-fabelian, morgrem-fabelian");
        addNewPokemon(new Grimmpus());
        removePokedexPokemon("pyukumuku-fabelian, dhelmise-fabelian");
        addNewPokemon(new Dutchmise());
        removePokedexPokemon("deino-fabelian");
        addNewPokemon(new Zweino());
        addNewPokemon(new Bombreino());
        removePokedexPokemon("beldum-fabelian, metang-fabelian, metagross-fabelian, raikou-fabelian, entei-fabelian, suicune-fabelian");
        addNewPokemon(new Schattenwolf());
    }

}
