package drai.dev.data.games.instagram.artworks218;


import drai.dev.data.pokemon.fabel.*;
import drai.dev.data.pokemon.fabel.regional.*;
import drai.dev.data.pokemon.mahal.regional.*;
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

//



        addNewPokemon(new FabelianYungoos("", Aspect.FABELIAN));
        addNewPokemon(new FabelianGumshoos("", Aspect.FABELIAN));
        addNewPokemon(new FabelianBidoof("", Aspect.FABELIAN));
        addNewPokemon(new FabelianBibarel("", Aspect.FABELIAN));
        addNewPokemon(new Bibrawler());
        addNewPokemon(new FabelianHoothoot("", Aspect.FABELIAN));
        addNewPokemon(new FabelianNoctowl("", Aspect.FABELIAN));
        addNewPokemon(new Kloctowl());
        addNewPokemon(new FabelianRattata("", Aspect.FABELIAN));
        addNewPokemon(new Ratoxicate());
        addNewPokemon(new FabelianWooloo("", Aspect.FABELIAN));
        addNewPokemon(new FabelianDubwool("", Aspect.FABELIAN));
        addNewPokemon(new FabelianMeowth("", Aspect.FABELIAN));
        addNewPokemon(new Purrlite());
        addNewPokemon(new FabelianSpinarak("", Aspect.FABELIAN));
        addNewPokemon(new FabelianAriados("", Aspect.FABELIAN));
        addNewPokemon(new Scariados());
        addNewPokemon(new FabelianGlameow("", Aspect.FABELIAN));
        addNewPokemon(new Purretty());
        addNewPokemon(new FabelianSinistea("", Aspect.FABELIAN));
        addNewPokemon(new FabelianPolteageist("", Aspect.FABELIAN));
        addNewPokemon(new FabelianTimburr("", Aspect.FABELIAN));
        addNewPokemon(new FabelianGurdurr("", Aspect.FABELIAN));
        addNewPokemon(new Woodendurr());
        addNewPokemon(new FabelianRoggenrola("", Aspect.FABELIAN));
        addNewPokemon(new FabelianBoldore("", Aspect.FABELIAN));
        addNewPokemon(new Gigasmith());
        addNewPokemon(new FabelianPachirisu("", Aspect.FABELIAN));
        removePokedexPokemon("tyrogue, hitmonchan, hitmonlee, hitmontop");
        addNewPokemon(new Hitmonthro());
        addNewPokemon(new Hitmonkick());
        addNewPokemon(new FabelianLillipup("", Aspect.FABELIAN));
        addNewPokemon(new FabelianHerdier("", Aspect.FABELIAN));
        addNewPokemon(new Hoodwoolf());
        addNewPokemon(new FabelianFalinks("", Aspect.FABELIAN));
        addNewPokemon(new FabelianChatot("", Aspect.FABELIAN));
        addNewPokemon(new Chathroom());
        addNewPokemon(new Chathride());
        addNewPokemon(new FabelianSnover("", Aspect.FABELIAN));
        addNewPokemon(new Abomaswamp());
        addNewPokemon(new FabelianApplin("", Aspect.FABELIAN));
        addNewPokemon(new Applegrum());
        addNewPokemon(new Scrapple());
        addNewPokemon(new FabelianSmeargle("", Aspect.FABELIAN));
        addNewPokemon(new Dalmatoon());
        addNewPokemon(new FabelianRalts("", Aspect.FABELIAN));
        addNewPokemon(new FabelianKirlia("", Aspect.FABELIAN));
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
        addNewPokemon(new FabelianPoliwag("", Aspect.FABELIAN).fishingSpawnFromExisting());
        addNewPokemon(new FabelianPoliwhirl("", Aspect.FABELIAN).fishingSpawnFromExisting());
        addNewPokemon(new Poliwring());
        addNewPokemon(new FabelianShuckle("", Aspect.FABELIAN));
        addNewPokemon(new Shrookle());
        addNewPokemon(new FabelianYamask("", Aspect.FABELIAN));
        addNewPokemon(new Mirorigus());
        addNewPokemon(new FabelianOnix("", Aspect.FABELIAN));
        addNewPokemon(new Alphinix());
        addNewPokemon(new FabelianMimikyu("", Aspect.FABELIAN));
        addNewPokemon(new FabelianHatenna("", Aspect.FABELIAN));
        addNewPokemon(new FabelianHattrem("", Aspect.FABELIAN));
        addNewPokemon(new Hatteficent());
        addNewPokemon(new FabelianStantler("", Aspect.FABELIAN));
        addNewPokemon(new FabelianWyrdeer("", Aspect.FABELIAN));
        addNewPokemon(new FabelianOddish("", Aspect.FABELIAN));
        addNewPokemon(new FabelianGloom("", Aspect.FABELIAN));
        addNewPokemon(new Potatoom());
        addNewPokemon(new FabelianSeel("", Aspect.FABELIAN).fishingSpawnFromExisting());
        addNewPokemon(new FabelianDewgong("", Aspect.FABELIAN).fishingSpawnFromExisting());
        addNewPokemon(new FabelianSableye("", Aspect.FABELIAN));
        addNewPokemon(new Rumpeleye());
        removePokedexPokemon("sugarva-fabelian");
        removePokedexPokemon("cottoon-fabelian");
        removePokedexPokemon("sugottornet-fabelian");
        addNewPokemon(new FabelianWoobat("", Aspect.FABELIAN));
        addNewPokemon(new Nosfroobat());
        addNewPokemon(new FabelianSnorunt("", Aspect.FABELIAN));
        addNewPokemon(new Usuprass());
        removePokedexPokemon("sugarva-fabelian, cottoon-fabelian, sugottornet-fabelian");
        addNewPokemon(new FabelianMilcery("", Aspect.FABELIAN));
        addNewPokemon(new Alcheesie());
        addNewPokemon(new FabelianSwablu("", Aspect.FABELIAN));
        addNewPokemon(new Basiria());
        addNewPokemon(new FabelianMudbray("", Aspect.FABELIAN));
        addNewPokemon(new Gearbray());
        addNewPokemon(new FabelianMinior("", Aspect.FABELIAN));
        addNewPokemon(new FabelianSandygast("", Aspect.FABELIAN));
        addNewPokemon(new Gingaucand());
        removePokedexPokemon("smoochum");
        addNewPokemon(new FabelianJynx("", Aspect.FABELIAN));
        addNewPokemon(new Huldynx());
        addNewPokemon(new FabelianCherubi("", Aspect.FABELIAN));
        addNewPokemon(new Cherrath());
        addNewPokemon(new FabelianLitwick("", Aspect.FABELIAN));
        addNewPokemon(new FabelianLampent("", Aspect.FABELIAN));
        addNewPokemon(new FabelianChandelure("", Aspect.FABELIAN));
        addNewPokemon(new FabelianImpidimp("", Aspect.FABELIAN));
        addNewPokemon(new FabelianMorgrem("", Aspect.FABELIAN));
        addNewPokemon(new Grimmpus());
        addNewPokemon(new FabelianPyukumuku("", Aspect.FABELIAN));
        addNewPokemon(new FabelianDhelmise("", Aspect.FABELIAN).fishingSpawnFromExisting());
        addNewPokemon(new Dutchmise());
        addNewPokemon(new FabelianDeino("", Aspect.FABELIAN));
        addNewPokemon(new Zweino());
        addNewPokemon(new Bombreino());
        addNewPokemon(new FabelianBeldum("", Aspect.FABELIAN));
        addNewPokemon(new FabelianMetang("", Aspect.FABELIAN));
        addNewPokemon(new FabelianMetagross("", Aspect.FABELIAN));
        addNewPokemon(new FabelianRaikou("", Aspect.FABELIAN));
        addNewPokemon(new FabelianEntei("", Aspect.FABELIAN));
        addNewPokemon(new FabelianSuicune("", Aspect.FABELIAN));
        addNewPokemon(new Schattenwolf());
    }

}
