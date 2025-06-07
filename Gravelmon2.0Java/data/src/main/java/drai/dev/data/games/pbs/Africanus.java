package drai.dev.data.games.pbs;


import drai.dev.data.pokemon.africanus.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Africanus extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Africanus();
    private Africanus() {
        super("Africanus");
    }

    @Override
    public void registerPokemon() {

        addNewPokemon(new AfricanusanSlowpoke("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanSlowbro("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanSlowking("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanPonyta("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanRapidash("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanTauros("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanMachop("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanMachoke("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanMachamp("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanPhanpy("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanDonphan("", Aspect.AFRICANUSAN));

        addNewPokemon(new AfricanusanBronzor("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanBronzong("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanCherubi("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanCherrim("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanKricketot("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanKricketune("", Aspect.AFRICANUSAN));

        addNewPokemon(new AfricanusanGothita("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanGothorita("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanGothitelle("", Aspect.AFRICANUSAN));

        addNewPokemon(new AfricanusanHonedge("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanDoublade("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanAegislash("", Aspect.AFRICANUSAN));
        addNewPokemon(new AfricanusanComfey("", Aspect.AFRICANUSAN));

        addNewPokemon(new Petiolis().addLabels(Label.STARTER));
        addNewPokemon(new Virilis().addLabels(Label.STARTER));
        addNewPokemon(new Lupercalis().addLabels(Label.STARTER));
        addNewPokemon(new Harregg().addLabels(Label.STARTER));
        addNewPokemon(new Igneagle().addLabels(Label.STARTER));
        addNewPokemon(new Imperiavem().addLabels(Label.STARTER));
        addNewPokemon(new Hipporos().addLabels(Label.STARTER));
        addNewPokemon(new Equxic().addLabels(Label.STARTER));
        addNewPokemon(new Marecampus().addLabels(Label.STARTER));
        addPokedexPokemon("skiddo, gogoat");
        addNewPokemon(new Fawniae());
        addNewPokemon(new Houndplut().addLabels(Label.LEGENDARY));
    }

}
