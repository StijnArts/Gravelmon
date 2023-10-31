package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.insurgence.delta.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

public class GenerationSix extends Original {
    public GenerationSix() {
        super("generation6");
    }

    @Override
    public void registerPokemon() {
        //Pokemon Insurgance
        pokemon.add(new DeltaFroakie(656));
        pokemon.add(new DeltaFrogadier(657));
        pokemon.add(new DeltaGreninja(658));
        pokemon.add(new DeltaAmaura(698));
        pokemon.add(new DeltaAurorus(699));
        pokemon.add(new DeltaGoomy(704));
        pokemon.add(new DeltaSliggoo(705));
        pokemon.add(new DeltaGoodra(706));
        pokemon.add(new DeltaPhantump(708));
        pokemon.add(new DeltaTrevenant(709));
        pokemon.add(new DeltaBergmite(712));
        pokemon.add(new DeltaAvalugg(713));
        pokemon.add(new DeltaNoibat(714));
        pokemon.add(new DeltaNoivern(715));
        pokemon.add(new DeltaHoopa(720));
        pokemon.add(new DeltaHoopaUnleashed(720));

        //X-Species (Xenoverse)
        pokemon.add(new GreninjaX(658));
        pokemon.add(new AegislashX(681));
        pokemon.add(new SwirlixX(684));
        pokemon.add(new SlurpuffX(685));

        //Pokemon Blazing Emerald
        pokemon.add(new HoennianGoomy(704));

    }
}
