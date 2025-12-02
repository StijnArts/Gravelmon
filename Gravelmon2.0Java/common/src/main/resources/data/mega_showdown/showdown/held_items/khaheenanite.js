{
    name: "Khaheenanite",
    spritenum: 620,
    megaStone: "khaheena-mega",
    megaEvolves: "khaheena",
    itemUser: ["khaheena"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10077: 760,
    gen: 6,
    isNonstandard: "Past"
}
