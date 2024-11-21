package drai.dev.data.games;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.infinity.*;

public class Infinity extends Game {
    public Infinity() {
        super("Infinity");
    }

    @Override
    public void registerPokemon() {
        //Lukpup line
        addNewPokemon(new Lukpup());
        addNewPokemon(new Lukagon());
        //Kokiseed line
        addNewPokemon(new Kokiseed());
        addNewPokemon(new Kokipound());
        addNewPokemon(new Kokismash());

        //Chargo line
        addNewPokemon(new Chargo());
        addNewPokemon(new Burnaram());
        addNewPokemon(new Psysteed());

        //Darpole line
        addNewPokemon(new Darpole());
        addNewPokemon(new Brutoad());
        addNewPokemon(new Godfrogger());

        addNewPokemon(new Gorochu());
        addNewPokemon(new Nidorook());

        addNewPokemon(new Quezsparce());

        addNewPokemon(new Faeralynx());

        addNewPokemon(new Skulkraken());

        addNewPokemon(new Oozma());

        //Eeveelutions
        //TODO add move vanish to eevee evolution moves
        addNewPokemon(new Omeon());
        //TODO add expert belt as evolution condition instead of black belt to eevee file
        addNewPokemon(new Champeon());
        addNewPokemon(new Lepideon());
        addNewPokemon(new Guardeon());
        //TODO add move pressurize to eevee evolution moves
        addNewPokemon(new Obsideon());
        //TODO add move venom swipe to eevee evolution moves
        addNewPokemon(new Scorpeon());
        addNewPokemon(new Sphynxeon());
        addNewPokemon(new Nimbeon());
        addNewPokemon(new Draconeon());
        //TODO add move eevoboost to eevee evolution moves
        addNewPokemon(new Eeveeon());
        addNewPokemon(new Vareon());
        addNewPokemon(new Terathwack());

        addNewPokemon(new Grimfowl());

        addNewPokemon(new Sunflorid());
        //TODO add move brain freeze to jynx evolution moves
        addNewPokemon(new Sorcerice());

        addNewPokemon(new Kecleodon());

        addNewPokemon(new Wereyena());

        addNewPokemon(new Reaptide());

        //Kidfoot line
        addNewPokemon(new Kidfoot());
        addNewPokemon(new Snosquatch());
        addNewPokemon(new Grasquatch());

        //Arctusk line
        addNewPokemon(new Arctusk());
        addNewPokemon(new Gigantusk());

        //Iceros line
        addNewPokemon(new Iceros());
        addNewPokemon(new Glacieros());

        addNewPokemon(new Mockroach());

        addNewPokemon(new Jollibird());

        addNewPokemon(new Kablowfish());

        //Scalarva line
        addNewPokemon(new Scalarva());
        addNewPokemon(new Dragalis());
        addNewPokemon(new Ceregal());

        //Gargon line
        addNewPokemon(new Gargon());
        addNewPokemon(new Wardern());
        addNewPokemon(new Dragoyle());

        addNewPokemon(new PorygonX());

        //Egho Oddish line
        addNewPokemon(new Viledoom());
        addNewPokemon(new Mortossum());

        //Mushling line
        addNewPokemon(new Mushling());
        addNewPokemon(new Psycholyte());
        addNewPokemon(new Shroomage());

        addNewPokemon(new Calfpint());

        addNewPokemon(new Arbird());

        //Girafarig evos
        addNewPokemon(new Girafaraf());
        addNewPokemon(new Giragira());

        //Whave line
        addNewPokemon(new Whave());
        addNewPokemon(new Orcabyss());

        //Zapalope line
        addNewPokemon(new Zapalope());
        addNewPokemon(new Joltalope());

        addNewPokemon(new Mewthree());

        addNewPokemon(new Oculeus());

        addNewPokemon(new Arkhaos());
    }
}
