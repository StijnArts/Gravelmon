package drai.dev.data.games.pokengine;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.interregional.*;
import drai.dev.data.pokemon.interregional.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

//done
public class Interregional extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Interregional();
    private Interregional() {
        super("Interregional", "https://pokengine.org/collections/10nk64pi/Interregional");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Leafrog().addLabels(Label.STARTER));
        addNewPokemon(new Ribbush().addLabels(Label.STARTER));
        addNewPokemon(new Agacloakis().addLabels(Label.STARTER));
        addNewPokemon(new Giraze().addLabels(Label.STARTER));
        addNewPokemon(new Bonfah().addLabels(Label.STARTER));
        addNewPokemon(new Magmaraffa().addLabels(Label.STARTER));
        addNewPokemon(new Damphant().addLabels(Label.STARTER));
        addNewPokemon(new Droophant().addLabels(Label.STARTER));
        addNewPokemon(new Cyclodon().addLabels(Label.STARTER));
        addNewPokemon(new Solcorn());
        addNewPokemon(new Ferrutail());
        addNewPokemon(new Tweejay());
        addNewPokemon(new Marchawk());
        addNewPokemon(new Harmosoar());
        addNewPokemon(new Pipillar());
        addNewPokemon(new Vicoon());
        addNewPokemon(new Arisfly());
        addNewPokemon(new Juvy());
        addNewPokemon(new Convird());
        addNewPokemon(new Thefcoon());
        addNewPokemon(new Rascoon());
        addNewPokemon(new Bulpy());
        addNewPokemon(new Filthound());
        addNewPokemon(new Gleamuse());
        addNewPokemon(new Spookrab());
        addNewPokemon(new Crustgeist());
        addNewPokemon(new Hermish());
        addNewPokemon(new Conkamite());
        addNewPokemon(new Whirm());
        addNewPokemon(new Grappore());
        addPokedexPokemon("spinda");
        addNewPokemon(new Panditsy());
        addPokedexPokemon("zangoose");
        addNewPokemon(new Zangarsh());
        addPokedexPokemon("smeargle");
        addNewPokemon(new Beagasso());
        addNewPokemon(new Onnidix());
        addNewPokemon(new Onnibud());
        addNewPokemon(new Vittion());
        addNewPokemon(new Maskost());
        addNewPokemon(new Tomaskost());
        addNewPokemon(new Threevilasks());
        addNewPokemon(new Ogopoing());
        addNewPokemon(new Ogospiral());
        addNewPokemon(new Nesspin());
        addNewPokemon(new Bitumin());
        addNewPokemon(new Ligniter());
        addNewPokemon(new Conflaracite());
        addNewPokemon(new Pyrockit());
        addNewPokemon(new Zooboom());
        addNewPokemon(new Kraboom());
        addNewPokemon(new Audibaah());
        addNewPokemon(new Bellabaah());
        addNewPokemon(new Marifin());
        addNewPokemon(new Umiveil());
        addNewPokemon(new Sniffreze());
        addNewPokemon(new Kloakold());
        addNewPokemon(new Blastine());
        addNewPokemon(new Navolatle());
        addNewPokemon(new Lochnes());
        addNewPokemon(new Lochitent());
        addNewPokemon(new Turbilly());
        addNewPokemon(new Dynabuck());
        addNewPokemon(new Kristallant());
        addNewPokemon(new Miniradae());
        addNewPokemon(new Sorbeak());
        addNewPokemon(new Dulswoop());
        addNewPokemon(new Squiwer());
        addNewPokemon(new Quisewer());
        addNewPokemon(new Bactiny());
        addNewPokemon(new Liquphage());
        addNewPokemon(new Katakun());
        addNewPokemon(new Shurisan());
        addNewPokemon(new Shaltuff());
        addNewPokemon(new Gnawgorus());
        addNewPokemon(new Polluga());
        addNewPokemon(new Junkqual());
        addNewPokemon(new Trashan());
        addNewPokemon(new Scrapiteer());
        addNewPokemon(new Cactabit());
        addNewPokemon(new Gymnozard());
//        addNewPokemon(new Lilytad()); Missing Art
        addNewPokemon(new Tuxechik());
        addNewPokemon(new Juavarrior());
        addNewPokemon(new Luxereguin());
        addNewPokemon(new Sliezen());
        addNewPokemon(new Glacitrave());
        addNewPokemon(new Oofoe());
        addNewPokemon(new Intellifoe());

        addNewPokemon(new Zallut());
        addNewPokemon(new Zerbrahg());
        addNewPokemon(new Cryvus());
        addNewPokemon(new Etheeria());
        addNewPokemon(new Shocalf());
        addNewPokemon(new Voltuff());
        addNewPokemon(new Chargibull());
        addNewPokemon(new Sebrium().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Kirastrum().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Vitoshum().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Bubblea());
        addNewPokemon(new Chesture());
        addNewPokemon(new Acard());
        addNewPokemon(new Hiveum());
        addNewPokemon(new Gigantoid());
//        addNewPokemon(new Exwahyzee()); Missing Art
        addNewPokemon(new Periyeti().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Magness().addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Tyranntric().addLabels(Label.LEGENDARY));
        addNewPokemon(new Phoeuck().addLabels(Label.LEGENDARY));
        addNewPokemon(new Metamarine().addLabels(Label.LEGENDARY));
        addNewPokemon(new Mechrazore().addLabels(Label.LEGENDARY));
        addNewPokemon(new Slanbolos().addLabels(Label.LEGENDARY));
        addNewPokemon(new Oceausky().addLabels(Label.MYTHICAL));
        addNewPokemon(new Nifflom().addLabels(Label.MYTHICAL));
        addNewPokemon(new InterianGenesect("", Aspect.INTERIAN).addLabels(Label.MYTHICAL));
        addNewPokemon(new InterianArceus("", Aspect.INTERIAN).addLabels(Label.MYTHICAL));
        addNewPokemon(new InterianPiplup("", Aspect.INTERIAN).addLabels(Label.STARTER));
        addNewPokemon(new InterianPrinplup("", Aspect.INTERIAN).addLabels(Label.STARTER));
        addNewPokemon(new InterianEmpoleon("", Aspect.INTERIAN, new Stats(534, StatArchetype.FAST_SPECIAL_WALL,
                List.of(StatType.SPECIAL_ATTACK))).addLabels(Label.STARTER));
    }

}
