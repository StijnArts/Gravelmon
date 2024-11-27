package drai.dev.data.games.instagram.eldark;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.raian.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Norse extends drai.dev.data.games.registry.Game {
    public Norse() {
        super("Norse");
    }

    @Override
    public void init() {
        super.init();
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().remove(Label.RAIAN);
            pokemon1.getLabels().add(Label.NORSE);
        });
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Loctus().setUsesBigModel());
        addNewPokemon(new Caclender().setUsesBigModel());
        addNewPokemon(new Okigon(new Stats(525, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel()); //Evolves into Vesgrass
        addNewPokemon(new Lavades().setUsesBigModel());
        addNewPokemon(new Hadcano().setUsesBigModel());
        addNewPokemon(new Surtacno(new Stats(525, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel()); //Evolves into Vesfire
        addNewPokemon(new Rayside().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Royray().setUsesBigModel());
        addNewPokemon(new Aegiking(new Stats(525, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel()); //Evolves into Veswater

        addNewPokemon(new Humu().setUsesBigModel());
        addNewPokemon(new Crodin().setUsesBigModel());
        addNewPokemon(new Crouinn(new Stats(494, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Ratatoby().setUsesBigModel());
        addNewPokemon(new Ratatosk(new Stats(440, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Larvaorg().setUsesBigModel());
        addNewPokemon(new Tanccoon().setUsesBigModel());
        addNewPokemon(new Tanshild(new Stats(450, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Jotucoon().setUsesBigModel());
        addNewPokemon(new Manticorp(new Stats(450, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED, StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Cloudbebe().setUsesBigModel());
        addNewPokemon(new Scandibe(new Stats(430, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Elfachu(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Roboar().setUsesBigModel());
        addNewPokemon(new Wisdisvini(new Stats(460, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Daieenn(new Stats(590, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());

        addNewPokemon(new Lizanir().setUsesBigModel());
        addNewPokemon(new Fafrotic().setUsesBigModel());
        addNewPokemon(new Fafreeze(new Stats(524, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());//Evolves into Veselectric
        addNewPokemon(new Moroll().setUsesBigModel());
        addNewPokemon(new Megatro().setUsesBigModel());
        addNewPokemon(new Trolking(new Stats(524, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());//Evolves into Vesground
        addNewPokemon(new Gloefa().setUsesBigModel());
        addNewPokemon(new Flotago().setUsesBigModel());
        addNewPokemon(new Highelfa(new Stats(524, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel()); //Evolves into Vesflying

        addNewPokemon(new Floramic(new Stats(420, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Garruff().setUsesBigModel());
        addNewPokemon(new Eitrgar(new Stats(440, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Moeez().setUsesBigModel());
        addNewPokemon(new Froosorn(new Stats(450, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Bereolf().setUsesBigModel());
        addNewPokemon(new Werowulf(new Stats(450, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Dnaeon(new Stats(525, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Darteon(new Stats(525, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Tiniweb().setUsesBigModel());
        addNewPokemon(new Rogider(new Stats(440, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Lyngortos(new Stats(480, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Whalyn(new Stats(480, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Freyter(new Stats(490, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Freytera(new Stats(490, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Dvaleenn(new Stats(590, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());

        addNewPokemon(new Bearmal().setUsesBigModel());
        addNewPokemon(new Claopaw().setUsesBigModel());
        addNewPokemon(new Velvetake(new Stats(525, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))).setUsesBigModel());//Evolves into Vesnormal
        addNewPokemon(new Draukid().setUsesBigModel());
        addNewPokemon(new Draudager().setUsesBigModel());
        addNewPokemon(new Drauking(new Stats(525, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());//Evolves into Vesghost
        addNewPokemon(new Troboi().setUsesBigModel());
        addNewPokemon(new Yetroll().setUsesBigModel());
        addNewPokemon(new Drakotol(new Stats(525, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());//Evolves into Vesfighting

        addNewPokemon(new Vedotel().setUsesBigModel());
        addNewPokemon(new Vedrawk(new Stats(470, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Leafinx().setUsesBigModel());
        addNewPokemon(new Grelinx().setUsesBigModel());
        addNewPokemon(new Lynxedow(new Stats(530, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Miscelliz().setUsesBigModel());
        addNewPokemon(new Bigabellz(new Stats(470, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Falrok().setUsesBigModel());
        addNewPokemon(new Cacorok().setUsesBigModel());
        addNewPokemon(new Centirok(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Mintrap(new Stats(310, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Smotrap(new Stats(310, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Needatrap(new Stats(310, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Collectrap(new Stats(410, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Rapnagon(new Stats(570, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Duneerr(new Stats(590, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());

        addNewPokemon(new Scalasaur().setUsesBigModel());
        addNewPokemon(new Toxisaur().setUsesBigModel());
        addNewPokemon(new Biosaur(new Stats(525, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());//Evolves into Vesfairy
        addNewPokemon(new Clawmander().setUsesBigModel());
        addNewPokemon(new Armoreleon().setUsesBigModel());
        addNewPokemon(new Knitzard(new Stats(534, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());//Evolves into Vessteel
        addNewPokemon(new Flortle().setUsesBigModel());
        addNewPokemon(new Emetortle().setUsesBigModel());
        addNewPokemon(new Carvtoise(new Stats(530, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel()); //Evolves into Vesdragon

        addNewPokemon(new Lilcteria().setUsesBigModel());
        addNewPokemon(new Furirus(new Stats(460, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Duself().setUsesBigModel());
        addNewPokemon(new Dimelf(new Stats(450, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Magelf(new Stats(450, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Stukin().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Punkin(new Stats(440, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Lygiest().setUsesBigModel());
        addNewPokemon(new Spectelyca(new Stats(470, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Toxicotyl(new Stats(450, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Eggower(new Stats(370, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Electroost(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Hideklt().setUsesBigModel());
        addNewPokemon(new Furkeleton().setUsesBigModel());
        addNewPokemon(new Brutalice(new Stats(600, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Durapbor(new Stats(590, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());

        addNewPokemon(new Uendrasil(new Stats(680, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Uppdrasil(new Stats(680, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK, StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Niddevour(new Stats(680, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Odirose(new Stats(600, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Drostya(new Stats(600, StatArchetype.ALL_ROUND, List.of())).setUsesBigModel());

        addNewPokemon(new Vesgrass(new Stats(580, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Vesfire(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Veswater(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Veslectric(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Vesground(new Stats(580, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Vesflying(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Vesnormal(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Vesghost(new Stats(580, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Vesfight(new Stats(580, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Vesdragon(new Stats(580, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Vessteel(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Vesfairy(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addPokedexPokemon("pichu-norse, pikachu-norse, raichu-norse, sentret-norse, furret-norse, absol-norse, gible-norse, gabite-norse, garchomp-norse");

    }
}
