package drai.dev.data.games.pokemmo;


import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.tochi.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tochi extends drai.dev.data.games.registry.Game {
	public static final Game INSTANCE = new Tochi();
	private Tochi() {
        super("Tochi");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Brambli());
        addNewPokemon(new Sapli());
        addNewPokemon(new Coatimber());
//        addNewPokemon(new Salamagma());   Missing Stats
//        addNewPokemon(new Salamolten());   Missing Stats
//        addNewPokemon(new Amphibroil());   Missing Stats
//        addNewPokemon(new Octiny());   Missing Stats
//        addNewPokemon(new Octricity());   Missing Stats
//        addNewPokemon(new Plasmapod());   Missing Stats
        addNewPokemon(new Squirrey());
//        addNewPokemon(new Raspberrel());   Missing Stats
        addNewPokemon(new Adoved());
        addNewPokemon(new Admibird());
        addNewPokemon(new Extravagale());
//        addNewPokemon(new Silkapillar());   Missing Stats
        addNewPokemon(new Mothread());
//        addNewPokemon(new Strawbabe());   Missing Stats
//        addNewPokemon(new Fragalia());   Missing Stats
//        addNewPokemon(new Fraquility());   Missing Stats
//        addNewPokemon(new Martwig());   Missing Stats
//        addNewPokemon(new Martimber());   Missing Stats
//        addNewPokemon(new Glidair());   Missing Stats
//        addNewPokemon(new Pepshroom());   Missing Stats
//        addNewPokemon(new Chimary());   Missing Stats
//        addNewPokemon(new Canaring());   Missing Stats
//        addNewPokemon(new Pitoxin());   Missing Stats
//        addNewPokemon(new Satymp());   Missing Stats
//        addNewPokemon(new Bapherno());   Missing Stats
//        addNewPokemon(new Apheeble());   Missing Stats
//        addNewPokemon(new Aphur());   Missing Stats
//        addNewPokemon(new Calvolt());   Missing Stats
//        addNewPokemon(new Wildebolt());   Missing Stats
//        addNewPokemon(new Voltebeast());   Missing Stats
//        addNewPokemon(new Rabineer());   Missing Stats
//        addNewPokemon(new Clofae());   Missing Stats
//        addNewPokemon(new Firant());   Missing Stats
//        addNewPokemon(new Dynamant());   Missing Stats
//        addNewPokemon(new Vermoist());   Missing Stats
//        addNewPokemon(new Drizzlingua());   Missing Stats
//        addNewPokemon(new Spriterra());   Missing Stats
//        addNewPokemon(new Faearth());   Missing Stats
//        addNewPokemon(new Trainymph());   Missing Stats
//        addNewPokemon(new Locusteka());   Missing Stats
        addNewPokemon(new Chiqua());
        addNewPokemon(new Turphoon());
        addNewPokemon(new Typhitty());
        addNewPokemon(new Typheline());
        addNewPokemon(new Swampole());
        addNewPokemon(new Poliwamp());
        addNewPokemon(new Swamphibian());
//        addNewPokemon(new Childew());   Missing Stats
//        addNewPokemon(new Salimist());   Missing Stats
//        addNewPokemon(new Needlish());   Missing Stats
//        addNewPokemon(new IVish());   Missing Stats
//        addNewPokemon(new Heartbill());   Missing Stats
//        addNewPokemon(new Rubster());   Missing Stats
//        addNewPokemon(new Immortoise());   Missing Stats
//        addNewPokemon(new Ruffurchin());   Missing Stats
//        addNewPokemon(new Hatox());   Missing Stats
//        addNewPokemon(new Shellice());   Missing Stats
//        addNewPokemon(new Reefool());   Missing Stats
//        addNewPokemon(new Lakalf());   Missing Stats
//        addNewPokemon(new Bullake());   Missing Stats
//        addNewPokemon(new Pesketch());   Missing Stats
//        addNewPokemon(new Nurshark());   Missing Stats
//        addNewPokemon(new Sharkure());   Missing Stats
//        addNewPokemon(new Shrimpno());   Missing Stats
//        addNewPokemon(new Shrimpadelic());   Missing Stats
//        addNewPokemon(new Garbezoa());   Missing Stats
//        addNewPokemon(new Jetsowar());   Missing Stats
//        addNewPokemon(new Spectacea());   Missing Stats
//        addNewPokemon(new Helux());   Missing Stats
//        addNewPokemon(new Helectric());   Missing Stats
//        addNewPokemon(new Tentacult());   Missing Stats
//        addNewPokemon(new Cultamari());   Missing Stats
//        addNewPokemon(new Eggozoa());   Missing Stats
//        addNewPokemon(new Hydravenge());   Missing Stats
//        addNewPokemon(new Booblue());   Missing Stats
//        addNewPokemon(new Submarooby());   Missing Stats
//        addNewPokemon(new Whalobe());   Missing Stats
//        addNewPokemon(new Cerebeluga());   Missing Stats
//        addNewPokemon(new Glorm());   Missing Stats
//        addNewPokemon(new Flyminate());   Missing Stats
//        addNewPokemon(new Fearit());   Missing Stats
//        addNewPokemon(new Haunthin());   Missing Stats
//        addNewPokemon(new Bisoil());   Missing Stats
//        addNewPokemon(new Buffalearth());   Missing Stats
//        addNewPokemon(new Gecksquire());   Missing Stats
//        addNewPokemon(new Knightile());   Missing Stats
//        addNewPokemon(new Geckombat());   Missing Stats
//        addNewPokemon(new Pyrogorgia());   Missing Stats
//        addNewPokemon(new Snowbowll());   Missing Stats
//        addNewPokemon(new Overcowl());   Missing Stats
//        addNewPokemon(new Puncholla());   Missing Stats
//        addNewPokemon(new Caimolt());   Missing Stats
//        addNewPokemon(new Reptigon());   Missing Stats
//        addNewPokemon(new Spectragon());   Missing Stats
//        addNewPokemon(new Farenhead());   Missing Stats
//        addNewPokemon(new Pyranium());   Missing Stats
//        addNewPokemon(new Seworm());   Missing Stats
//        addNewPokemon(new Velvorm());   Missing Stats
//        addNewPokemon(new Fungramp());   Missing Stats
//        addNewPokemon(new Foscal());   Missing Stats
//        addNewPokemon(new Fossasin());   Missing Stats
//        addNewPokemon(new Dodie());   Missing Stats
//        addNewPokemon(new Dodoc());   Missing Stats
//        addNewPokemon(new Serpebble());   Missing Stats
//        addNewPokemon(new Serpentite());   Missing Stats
//        addNewPokemon(new Rolyboly());   Missing Stats
//        addNewPokemon(new Endearasite());   Missing Stats
//        addNewPokemon(new Erosite());   Missing Stats
//        addNewPokemon(new Venusite());   Missing Stats
//        addNewPokemon(new Impelt());   Missing Stats
//        addNewPokemon(new Puzzlock());   Missing Stats
//        addNewPokemon(new Chubaby());   Missing Stats
//        addNewPokemon(new Chubuffet());   Missing Stats
//        addNewPokemon(new Carnicabra());   Missing Stats
//        addNewPokemon(new Sentennial());   Missing Stats
    }

}
