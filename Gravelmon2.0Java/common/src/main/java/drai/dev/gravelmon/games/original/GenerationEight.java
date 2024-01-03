package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
import drai.dev.gravelmon.pokemon.myth.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;

public class GenerationEight extends Original {
    public GenerationEight() {
        super("generation8");
    }

    @Override
    public void registerPokemon() {
          //Pokemon Blazing Emerald
        pokemon.add(new HoennianDreepy(885));
        pokemon.add(new HoennianDrakloak(886));
        pokemon.add(new HoennianDragapult(887));

        //Radical Red
        pokemon.add(new SeviianSizzlipede(850));
        pokemon.add(new SeviianCentiskorch(851));

        //Myth
        pokemon.add(new MythianKleavor(900));

        //Vanguard
        pokemon.add(new AyreianGrookey(810));
        pokemon.add(new AyreianThwacky(811));
        pokemon.add(new AyreianRillaboom(812));
        pokemon.add(new AyreianSizzlipede(850));
        pokemon.add(new AyreianCentiskorch(851));

        //Kaskadian
        pokemon.add(new KaskadianDubwool(832));

    }
}
