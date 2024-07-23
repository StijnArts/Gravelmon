package drai.dev.data.games.og;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.infinity.*;

public class Infinity extends Game {
    public Infinity() {
        super("Infinity");
    }

    @Override
    public void registerPokemon() {
        //Lukpup line
        pokemon.add(new Lukpup());
        pokemon.add(new Lukagon());
        //Kokiseed line
        pokemon.add(new Kokiseed());
        pokemon.add(new Kokipound());
        pokemon.add(new Kokismash());

        //Chargo line
        pokemon.add(new Chargo());
        pokemon.add(new Burnaram());
        pokemon.add(new Psysteed());

        //Darpole line
        pokemon.add(new Darpole());
        pokemon.add(new Brutoad());
        pokemon.add(new Godfrogger());

        pokemon.add(new Gorochu());
        pokemon.add(new Nidorook());

        pokemon.add(new Quezsparce());

        pokemon.add(new Faeralynx());

        pokemon.add(new Skulkraken());

        pokemon.add(new Oozma());

        //Eeveelutions
        //TODO add move vanish to eevee evolution moves
        pokemon.add(new Omeon());
        //TODO add expert belt as evolution condition instead of black belt to eevee file
        pokemon.add(new Champeon());
        pokemon.add(new Lepideon());
        pokemon.add(new Guardeon());
        //TODO add move pressurize to eevee evolution moves
        pokemon.add(new Obsideon());
        //TODO add move venom swipe to eevee evolution moves
        pokemon.add(new Scorpeon());
        pokemon.add(new Sphynxeon());
        pokemon.add(new Nimbeon());
        pokemon.add(new Draconeon());
        //TODO add move eevoboost to eevee evolution moves
        pokemon.add(new Eeveeon());
        pokemon.add(new Vareon());
        pokemon.add(new Terathwack());

        pokemon.add(new Grimfowl());

        pokemon.add(new Sunflorid());
        //TODO add move brain freeze to jynx evolution moves
        pokemon.add(new Sorcerice());

        pokemon.add(new Kecleodon());

        pokemon.add(new Wereyena());

        pokemon.add(new Reaptide());

        //Kidfoot line
        pokemon.add(new Kidfoot());
        pokemon.add(new Snosquatch());
        pokemon.add(new Grasquatch());

        //Arctusk line
        pokemon.add(new Arctusk());
        pokemon.add(new Gigantusk());

        //Iceros line
        pokemon.add(new Iceros());
        pokemon.add(new Glacieros());

        pokemon.add(new Mockroach());

        pokemon.add(new Jollibird());

        pokemon.add(new Kablowfish());

        //Scalarva line
        pokemon.add(new Scalarva());
        pokemon.add(new Dragalis());
        pokemon.add(new Ceregal());

        //Gargon line
        pokemon.add(new Gargon());
        pokemon.add(new Wardern());
        pokemon.add(new Dragoyle());

        pokemon.add(new PorygonX());

        //Egho Oddish line
        pokemon.add(new Viledoom());
        pokemon.add(new Mortossum());

        //Mushling line
        pokemon.add(new Mushling());
        pokemon.add(new Psycholyte());
        pokemon.add(new Shroomage());

        pokemon.add(new Calfpint());

        pokemon.add(new Arbird());

        //Girafarig evos
        pokemon.add(new Girafaraf());
        pokemon.add(new Giragira());

        //Whave line
        pokemon.add(new Whave());
        pokemon.add(new Orcabyss());

        //Zapalope line
        pokemon.add(new Zapalope());
        pokemon.add(new Joltalope());

        pokemon.add(new Mewthree());

        pokemon.add(new Oculeus());

        pokemon.add(new Arkhaos());
    }
}
