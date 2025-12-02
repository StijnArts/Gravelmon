{
    name: "Deltatyphlosionite",
    spritenum: 620,
    megaStone: "typhlosion-deltaactive_mega",
    megaEvolves: "typhlosion",
    itemUser: ["typhlosion"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== deltaactive)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10075: 760,
    gen: 6,
    isNonstandard: "Past"
}
