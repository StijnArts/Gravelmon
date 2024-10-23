package drai.dev.data.games.instagram.eldark;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.raian.*;
import drai.dev.data.pokemon.raian.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Norse extends drai.dev.data.games.registry.Game {
    public Norse() {
        super("Norse");
    }

    @Override
    public void init() {
        super.init();
        pokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().remove(Label.RAIAN);
            pokemon1.getLabels().add(Label.NORSE);
        });
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Loctus().setUsesBigModel());
        pokemon.add(new Caclender().setUsesBigModel());
        pokemon.add(new Okigon(new Stats(525, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel()); //Evolves into Vesgrass
        pokemon.add(new Lavades().setUsesBigModel());
        pokemon.add(new Hadcano().setUsesBigModel());
        pokemon.add(new Surtacno(new Stats(525, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel()); //Evolves into Vesfire
        pokemon.add(new Rayside().setUsesBigModel());
        pokemon.add(new Royray().setUsesBigModel());
        pokemon.add(new Aegiking(new Stats(525, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel()); //Evolves into Veswater

        pokemon.add(new Humu().setUsesBigModel());
        pokemon.add(new Crodin().setUsesBigModel());
        pokemon.add(new Crouinn(new Stats(494, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Ratatoby().setUsesBigModel());
        pokemon.add(new Ratatosk(new Stats(440, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Larvaorg().setUsesBigModel());
        pokemon.add(new Tanccoon().setUsesBigModel());
        pokemon.add(new Tanshild(new Stats(450, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Jotucoon().setUsesBigModel());
        pokemon.add(new Manticorp(new Stats(450, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED, StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Cloudbebe().setUsesBigModel());
        pokemon.add(new Scandibe(new Stats(430, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Elfachu(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Roboar().setUsesBigModel());
        pokemon.add(new Wisdisvini(new Stats(460, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Daieenn(new Stats(590, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());

        pokemon.add(new Lizanir().setUsesBigModel());
        pokemon.add(new Fafrotic().setUsesBigModel());
        pokemon.add(new Fafreeze(new Stats(524, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());//Evolves into Veselectric
        pokemon.add(new Moroll().setUsesBigModel());
        pokemon.add(new Megatro().setUsesBigModel());
        pokemon.add(new Trolking(new Stats(524, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());//Evolves into Vesground
        pokemon.add(new Gloefa().setUsesBigModel());
        pokemon.add(new Flotago().setUsesBigModel());
        pokemon.add(new Highelfa(new Stats(524, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel()); //Evolves into Vesflying

        pokemon.add(new Floramic(new Stats(420, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Garruff().setUsesBigModel());
        pokemon.add(new Eitrgar(new Stats(440, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Moeez().setUsesBigModel());
        pokemon.add(new Froosorn(new Stats(450, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Bereolf().setUsesBigModel());
        pokemon.add(new Werowulf(new Stats(450, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Dnaeon(new Stats(525, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Darteon(new Stats(525, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Tiniweb().setUsesBigModel());
        pokemon.add(new Rogider(new Stats(440, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Lyngortos(new Stats(480, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Whalyn(new Stats(480, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Freyter(new Stats(490, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Freytera(new Stats(490, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Dvaleenn(new Stats(590, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());

        pokemon.add(new Bearmal().setUsesBigModel());
        pokemon.add(new Claopaw().setUsesBigModel());
        pokemon.add(new Velvetake(new Stats(525, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))).setUsesBigModel());//Evolves into Vesnormal
        pokemon.add(new Draukid().setUsesBigModel());
        pokemon.add(new Draudager().setUsesBigModel());
        pokemon.add(new Drauking(new Stats(525, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());//Evolves into Vesghost
        pokemon.add(new Roboi().setUsesBigModel());
        pokemon.add(new Yetroll().setUsesBigModel());
        pokemon.add(new Drakotol(new Stats(525, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());//Evolves into Vesfighting

        pokemon.add(new Vedotel().setUsesBigModel());
        pokemon.add(new Vedrawk(new Stats(470, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Leafinx().setUsesBigModel());
        pokemon.add(new Grelinx().setUsesBigModel());
        pokemon.add(new Lynxedow(new Stats(530, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Miscelliz().setUsesBigModel());
        pokemon.add(new Bigabellz(new Stats(470, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Falrok().setUsesBigModel());
        pokemon.add(new Cacorok().setUsesBigModel());
        pokemon.add(new Centirok(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Mintrap(new Stats(310, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Smotrap(new Stats(310, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Needatrap(new Stats(310, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Collectrap(new Stats(410, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Rapnagon(new Stats(570, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Duneerr(new Stats(590, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());

        pokemon.add(new Scalasaur().setUsesBigModel());
        pokemon.add(new Oxisaur().setUsesBigModel());
        pokemon.add(new Biosaur(new Stats(525, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());//Evolves into Vesfairy
        pokemon.add(new Clawmander().setUsesBigModel());
        pokemon.add(new Armoreleon().setUsesBigModel());
        pokemon.add(new Knitzard(new Stats(534, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());//Evolves into Vessteel
        pokemon.add(new Flortle().setUsesBigModel());
        pokemon.add(new Emetortle().setUsesBigModel());
        pokemon.add(new Carvtoise(new Stats(530, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel()); //Evolves into Vesdragon

        pokemon.add(new Lilcteria().setUsesBigModel());
        pokemon.add(new Furirus(new Stats(460, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Duself().setUsesBigModel());
        pokemon.add(new Dimelf(new Stats(450, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Magelf(new Stats(450, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Stukin().setUsesBigModel());
        pokemon.add(new Punkin(new Stats(440, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Lygiest().setUsesBigModel());
        pokemon.add(new Spectelyca(new Stats(470, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Oxicotyl(new Stats(450, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Eggower(new Stats(370, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Electroost(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Hideklt().setUsesBigModel());
        pokemon.add(new Furkeleton().setUsesBigModel());
        pokemon.add(new Brutalice(new Stats(600, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Durapbor(new Stats(590, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());

        pokemon.add(new Uendrasil(new Stats(680, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Uppdrasil(new Stats(680, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK, StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Niddevour(new Stats(680, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Odirose(new Stats(600, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Drostya(new Stats(600, StatArchetype.ALL_ROUND, List.of())).setUsesBigModel());

        pokemon.add(new Vesgrass(new Stats(580, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Vesfire(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Veswater(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Veslectric(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Vesground(new Stats(580, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Vesflying(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Vesnormal(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Vesghost(new Stats(580, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Vesfight(new Stats(580, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Vesdragon(new Stats(580, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Vessteel(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Vesfairy(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());

    }
}
