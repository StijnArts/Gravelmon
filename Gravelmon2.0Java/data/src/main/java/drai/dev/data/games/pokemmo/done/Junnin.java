package drai.dev.data.games.pokemmo.done;

import drai.dev.data.pokemon.atlas.*;
import drai.dev.data.pokemon.atlas.Bisommit;
import drai.dev.data.pokemon.atlas.Buffhilla;
import drai.dev.data.pokemon.atlas.Campyre;
import drai.dev.data.pokemon.atlas.Cloacover;
import drai.dev.data.pokemon.atlas.Cobworm;
import drai.dev.data.pokemon.atlas.Dandylie;
import drai.dev.data.pokemon.atlas.Dandyseed;
import drai.dev.data.pokemon.atlas.Electeel;
import drai.dev.data.pokemon.atlas.Emporeel;
import drai.dev.data.pokemon.atlas.Hoodloom;
import drai.dev.data.pokemon.atlas.Hoppereign;
import drai.dev.data.pokemon.atlas.Hoppiler;
import drai.dev.data.pokemon.atlas.Jayzul;
import drai.dev.data.pokemon.atlas.Jayzure;
import drai.dev.data.pokemon.atlas.Liqueel;
import drai.dev.data.pokemon.atlas.Stuckarp;
import drai.dev.data.pokemon.atlas.Stuckry;
import drai.dev.data.pokemon.atlas.Wildyre;
import drai.dev.data.pokemon.atlas.Withereen;
import drai.dev.data.pokemon.junnin.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//done https://pokengine.org/collections/10ryf7r0/Junnin
public class Junnin extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Junnin();
    private Junnin() {
        super("Junnin");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Eucuwala().addLabels(Label.STARTER));
        addNewPokemon(new Gulacuff().addLabels(Label.STARTER));
        addNewPokemon(new Timberawl().addLabels(Label.STARTER));

        addNewPokemon(new Reptling().addLabels(Label.STARTER));
        addNewPokemon(new Rapteror().addLabels(Label.STARTER));
        addNewPokemon(new Velosaur().addLabels(Label.STARTER));

        addNewPokemon(new Yetini().addLabels(Label.STARTER));
        addNewPokemon(new Yeteen().addLabels(Label.STARTER));
        addNewPokemon(new Yetitan().addLabels(Label.STARTER));

        addNewPokemon(new Kindlemur().addLabels(Label.STARTER));
        addNewPokemon(new Burmurly().addLabels(Label.STARTER));
        addNewPokemon(new Merculey().addLabels(Label.STARTER));

        addNewPokemon(new Woolvry().addLabels(Label.STARTER));
        addNewPokemon(new Clokruel().addLabels(Label.STARTER));
        addNewPokemon(new Smoldrine().addLabels(Label.STARTER));

        addNewPokemon(new Batorch().addLabels(Label.STARTER));
        addNewPokemon(new Batrix().addLabels(Label.STARTER));
        addNewPokemon(new Vamfire().addLabels(Label.STARTER));

        addNewPokemon(new Dimetrus().addLabels(Label.STARTER));
        addNewPokemon(new Permidon().addLabels(Label.STARTER));
        addNewPokemon(new Lividon().addLabels(Label.STARTER));

        addNewPokemon(new Liqueel().addLabels(Label.STARTER));
        addNewPokemon(new Electeel().addLabels(Label.STARTER));
        addNewPokemon(new Emporeel().addLabels(Label.STARTER));

        addNewPokemon(new Lochsea().addLabels(Label.STARTER));
        addNewPokemon(new Nesshoal().addLabels(Label.STARTER));
        addNewPokemon(new Psyren().addLabels(Label.STARTER));

        addNewPokemon(new Aromutt());
        addNewPokemon(new Odorog());
        addNewPokemon(new Chinchul());
        addNewPokemon(new Chilleap());
        addNewPokemon(new Chiquail());
        addNewPokemon(new Mavriquail());
        addNewPokemon(new Jayzul());
        addNewPokemon(new Jayzure());
        addNewPokemon(new Hoppiler());
        addNewPokemon(new Cobworm());
        addNewPokemon(new Hoppereign());
        addNewPokemon(new Rollip());
        addNewPokemon(new Rollipod());
        addNewPokemon(new Isopanzer());
        addNewPokemon(new Ploworm());
        addNewPokemon(new Lumbrill());
        addNewPokemon(new Baybolt());
        addNewPokemon(new Bolteen());
        addNewPokemon(new Dandyseed());
        addNewPokemon(new Dandylie());
        addNewPokemon(new Withereen());
        addNewPokemon(new Quartzac());
        addNewPokemon(new Equazar());
        addNewPokemon(new Campyre());
        addNewPokemon(new Wildyre());
        addNewPokemon(new Bloatick());
        addNewPokemon(new Suckeeto());
        addNewPokemon(new Stalad());
        addNewPokemon(new Stelimight());
        addNewPokemon(new Cavernight());
        addNewPokemon(new Sandstrum());
        addNewPokemon(new Sanderon());
        addNewPokemon(new Shoreking());
        addNewPokemon(new Antini());
        addNewPokemon(new Insignel());
        addNewPokemon(new Stagnel());
        addNewPokemon(new Buffhilla());
        addNewPokemon(new Bisommit());
        addNewPokemon(new Coyoco());
        addNewPokemon(new Stuckarp());
        addNewPokemon(new Stuckry());
        addNewPokemon(new Plubus());
        addNewPokemon(new Salamink());
        addNewPokemon(new Frostoss());
        addNewPokemon(new Kaboo());
        addNewPokemon(new Membry());
        addNewPokemon(new Fawntia());
        addNewPokemon(new Reindolph());
        addNewPokemon(new Bansheet());
        addNewPokemon(new Teepolter());
        addNewPokemon(new Hoodloom());
        addNewPokemon(new Cloacover());
        addNewPokemon(new Indascent());
        addNewPokemon(new Lamplume());
        addNewPokemon(new Bottoil());
        addNewPokemon(new Cuncoldron());
        addNewPokemon(new Tarift());
        addNewPokemon(new Tarzorus());
        addNewPokemon(new Tuttby());
        addNewPokemon(new Whiscleo());
        addNewPokemon(new Pharoar());
        addNewPokemon(new Equia().addLabels(Label.LEGENDARY));
        addNewPokemon(new Treiarch().addLabels(Label.LEGENDARY));
        addNewPokemon(new Andromini().addLabels(Label.LEGENDARY));

    }

}
