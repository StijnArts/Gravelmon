package drai.dev.data.games.instagram.eldark;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.raian.*;
import drai.dev.data.pokemon.raian.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

//DONE
public class Norse extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Norse();
    private Norse() {
        super("Norse");
    }

    @Override
    public void init(String resourcesDir) {
        super.init(resourcesDir);
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().add(Label.NORSE);
            pokemon1.getLabels().remove(Label.RAIAN);
            pokemon1.getLabels().add(Label.INSTAGRAM);
        });
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Loctus().addLabels(Label.STARTER));
        addNewPokemon(new Caclender().addLabels(Label.STARTER));
        addNewPokemon(new Okigon(new Stats(525, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).addLabels(Label.STARTER)); //Evolves into Vesgrass
        addNewPokemon(new Lavades().fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Hadcano().addLabels(Label.STARTER));
        addNewPokemon(new Surtacno(new Stats(525, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).addLabels(Label.STARTER)); //Evolves into Vesfire
        addNewPokemon(new Rayside().fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Royray().addLabels(Label.STARTER));
        addNewPokemon(new Aegiking(new Stats(525, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).addLabels(Label.STARTER)); //Evolves into Veswater

        addNewPokemon(new Humu());
        addNewPokemon(new Crodin());
        addNewPokemon(new Crouinn(new Stats(494, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Ratatoby());
        addNewPokemon(new Ratatosk(new Stats(440, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Larvaorg());
        addNewPokemon(new Tanccoon());
        addNewPokemon(new Tanshild(new Stats(450, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Jotucoon());
        addNewPokemon(new Manticorp(new Stats(450, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED, StatType.ATTACK))));
        addNewPokemon(new Cloudbebe());
        addNewPokemon(new Scandibe(new Stats(430, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Elfachu(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Roboar());
        addNewPokemon(new Wisdisvini(new Stats(460, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Daieenn(new Stats(590, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));

        addNewPokemon(new Lizanir().addLabels(Label.STARTER));
        addNewPokemon(new Fafrotic().addLabels(Label.STARTER));
        addNewPokemon(new Fafreeze(new Stats(524, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).addLabels(Label.STARTER));//Evolves into Veselectric
        addNewPokemon(new Moroll().addLabels(Label.STARTER));
        addNewPokemon(new Megatro().addLabels(Label.STARTER));
        addNewPokemon(new Trolking(new Stats(524, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).addLabels(Label.STARTER));//Evolves into Vesground
        addNewPokemon(new Gloefa().addLabels(Label.STARTER));
        addNewPokemon(new Flotago().addLabels(Label.STARTER));
        addNewPokemon(new Highelfa(new Stats(524, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).addLabels(Label.STARTER)); //Evolves into Vesflying

        addNewPokemon(new Floramic(new Stats(420, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Garruff());
        addNewPokemon(new Eitrgar(new Stats(440, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Moeez());
        addNewPokemon(new Froosorn(new Stats(450, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Bereolf());
        addNewPokemon(new Werowulf(new Stats(450, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addPokedexPokemon(
                "eevee," +
                        "vaporeon," +
                        "jolteon," +
                        "flareon," +
                        "espeon," +
                        "umbreon," +
                        "leafeon," +
                        "glaceon," +
                        "sylveon");
        addNewPokemon(new Dnaeon(new Stats(525, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).addLabels(Label.EEVEELUTION));
        addNewPokemon(new Darteon(new Stats(525, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).addLabels(Label.EEVEELUTION));
        addNewPokemon(new Tiniweb());
        addNewPokemon(new Rogider(new Stats(440, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Lyngortos());
        addNewPokemon(new Whalyn(new Stats(480, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Freyter(new Stats(490, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Freytera(new Stats(490, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Dvaleenn(new Stats(590, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).addLabels(Label.SUB_LEGENDARY));

        addNewPokemon(new Bearmal().addLabels(Label.STARTER));
        addNewPokemon(new Claopaw().addLabels(Label.STARTER));
        addNewPokemon(new Velvetake(new Stats(525, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))).addLabels(Label.STARTER));//Evolves into Vesnormal
        addNewPokemon(new Draukid().addLabels(Label.STARTER));
        addNewPokemon(new Draudager().addLabels(Label.STARTER));
        addNewPokemon(new Drauking(new Stats(525, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).addLabels(Label.STARTER));//Evolves into Vesghost
        addNewPokemon(new Troboi().addLabels(Label.STARTER));
        addNewPokemon(new Yetroll().addLabels(Label.STARTER));
        addNewPokemon(new Drakotol(new Stats(525, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).addLabels(Label.STARTER));//Evolves into Vesfighting

        addNewPokemon(new Vedotel());
        addNewPokemon(new Vedrawk(new Stats(470, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Leafinx());
        addNewPokemon(new Grelinx());
        addNewPokemon(new Lynxedow(new Stats(530, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Miscelliz());
        addNewPokemon(new Bigabellz(new Stats(470, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))));
        addNewPokemon(new Falrok());
        addNewPokemon(new Cacorok());
        addNewPokemon(new Centirok(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Mintrap(new Stats(310, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Smotrap(new Stats(310, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))));
        addNewPokemon(new Needatrap(new Stats(310, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Collectrap(new Stats(410, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Rapnagon(new Stats(570, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Duneerr(new Stats(590, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))).addLabels(Label.SUB_LEGENDARY));

        addNewPokemon(new Scalasaur().addLabels(Label.STARTER));
        addNewPokemon(new Toxisaur().addLabels(Label.STARTER));
        addNewPokemon(new Biosaur(new Stats(525, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).addLabels(Label.STARTER));//Evolves into Vesfairy
        addNewPokemon(new Clawmander().addLabels(Label.STARTER));
        addNewPokemon(new Armoreleon().addLabels(Label.STARTER));
        addNewPokemon(new Knitzard(new Stats(534, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).addLabels(Label.STARTER));//Evolves into Vessteel
        addNewPokemon(new Flortle().addLabels(Label.STARTER));
        addNewPokemon(new Emetortle().addLabels(Label.STARTER));
        addNewPokemon(new Carvtoise(new Stats(530, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).addLabels(Label.STARTER)); //Evolves into Vesdragon

        addNewPokemon(new Lilcteria());
        addNewPokemon(new Furirus(new Stats(460, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Duself());
        addNewPokemon(new Dimelf(new Stats(450, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Magelf(new Stats(450, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Stukin().fishingSpawnFromExisting());
        addNewPokemon(new Punkin(new Stats(440, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Lygiest());
        addNewPokemon(new Spectelyca(new Stats(470, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Toxicotyl(new Stats(450, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Eggower());
        addNewPokemon(new Electroost(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Hideklt());
        addNewPokemon(new Furkeleton());
        addNewPokemon(new Brutalice(new Stats(600, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Durapbor(new Stats(590, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));

        addNewPokemon(new Uendrasil(new Stats(680, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.ATTACK))).addLabels(Label.LEGENDARY));
        addNewPokemon(new Uppdrasil(new Stats(680, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK, StatType.ATTACK))).addLabels(Label.LEGENDARY));
        addNewPokemon(new Niddevour(new Stats(680, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).addLabels(Label.LEGENDARY));
        addNewPokemon(new Odirose(new Stats(600, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Drostya(new Stats(600, StatArchetype.ALL_ROUND, List.of())).addLabels(Label.SUB_LEGENDARY));

        addNewPokemon(new Vesgrass(new Stats(580, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Vesfire(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Veswater(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Veslectric(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Vesground(new Stats(580, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Vesflying(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Vesnormal(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Vesghost(new Stats(580, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Vesfight(new Stats(580, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Vesdragon(new Stats(580, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Vessteel(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.DEFENCE))).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new Vesfairy(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).addLabels(Label.SUB_LEGENDARY));

        addNewPokemon(new NorsePichu("", Aspect.NORSE));
        addNewPokemon(new NorsePikachu("", Aspect.NORSE));
        addNewPokemon(new NorseRaichu("", Aspect.NORSE, new Stats(485, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));

        addNewPokemon(new NorseSentret("", Aspect.NORSE));
        addNewPokemon(new NorseFurret("", Aspect.NORSE, new Stats(415, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))));

        addNewPokemon(new NorseAbsol("", Aspect.NORSE, new Stats(465, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPEED))));

        addNewPokemon(new NorseGible("", Aspect.NORSE).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new NorseGabite("", Aspect.NORSE).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new NorseGarchomp("", Aspect.NORSE, new Stats(600,
                StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.DEFENCE, StatType.DEFENCE))).addLabels(Label.PSEUDO_LEGENDARY));


    }
}
