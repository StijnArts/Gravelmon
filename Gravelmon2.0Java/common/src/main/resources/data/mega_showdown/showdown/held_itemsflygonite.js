{
    name: "Flygonite",
    spritenum: 620,
    megaStone: "flygon-mega",
    megaEvolves: "flygon",
    itemUser: ["flygon"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10159: 760,
    gen: 6,
    isNonstandard: "Past"
}
