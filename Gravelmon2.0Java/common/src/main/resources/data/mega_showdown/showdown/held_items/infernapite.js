{
    name: "Infernapite",
    spritenum: 620,
    megaStone: "infernape-mega",
    megaEvolves: "infernape",
    itemUser: ["infernape"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10191: 760,
    gen: 6,
    isNonstandard: "Past"
}
