import java.awt.Color;

public interface TypeData {
	  static Type monitorType = new Type(new Color(0, 0, 0), "Monitor", "Umbra (Darkness)", "Bellim (1st)", "Belline (Protection)", "Forked tongue and long claws", "Sirca", "Garnet", "Black");
      static Type teguType = new Type(new Color(204, 0, 255), "Tegu", "Astro (Stars)", "Soulim (2nd)", "Soulano (Wisdom)", "Forked tongue and white speckles", "Prose", "Amethyst", "Violet");
      static Type whiptailType = new Type(new Color(255, 204, 255), "Whiptail", "Aero (Air)", "Yvim (3rd)", "Yveni (Serenity)", "Speckles and a long, thin tail", "Kimbri", "Aquamarine", "Pink");
      static Type geckoType = new Type(new Color(255, 255, 102), "Gecko", "Electro (Electricity)", "Lerim (4th)", "Lerez (Strength)", "Spots and thin vertical pupils", "Magnus", "Diamond", "Yellow");
      static Type iguanaType = new Type(new Color(204, 102, 0), "Iguana", "Terra (Earth)", "Tillim (5th)", "Tillinis (Hope)", "Striped tail and long, thin spikes", "Chio", "Emerald", "Brown");
      static Type chameleonType = new Type(new Color(255, 153, 0), "Chameleon", "Lux (Light)", "Inim (6th)", "Inia (Love)", "Tightly curled tail and vertical body stripes", "Solar", "Alexandrite", "Orange");
      static Type salamanderType = new Type(new Color(255, 0, 0), "Salamander", "Pyro (Fire)", "Jonim (7th)", "Jonick (Bravery)", "Haphazard stripes and a long tail", "Talon", "Ruby", "Red");
      static Type anoleType = new Type(new Color(0, 204, 0), "Anole", "Herbo (Flora)", "Ayim (8th)", "Ayala (Creativity)", "Crest on the back of the head and a long, thin tail", "Fennel", "Peridot", "Green");
      static Type lacertaType = new Type(new Color(204, 204, 204), "Lacerta", "Ferro (Metal)", "Morjim (9th)", "Morjin (Justice)", "Spots with a dark outline and dark speckles", "Cozom", "Sapphire", "Gray");
      static Type agamaType = new Type(new Color(153, 153, 255), "Agama", "Zoo (Fauna)", "Naylim (10th)",  "Nayleen (Nurturing)", "Multicolored and/or patterned", "Dane, Tyger", "Tourmaline", "Indigo");
      static Type caimanType = new Type(new Color(0, 204, 255), "Caiman", "Hydro (Water)", "Rivim (11th)", "Rivall (Joy)", "Webbed feet and ridges on the back", "Cirrus", "Citrine", "Blue");
      static Type skinkType = new Type(new Color(255, 255, 255), "Skink", "Cryo (Ice)", "Hirim (12th)", "Hirisia (Empathy)", "Thin stripes and a tail that is a separate color from the rest of the body", "Freeze, Liza", "Turquoise", "White");

      static Type[] types = {monitorType, teguType, whiptailType, geckoType, iguanaType, chameleonType, salamanderType, anoleType, lacertaType, agamaType, caimanType, skinkType};
      
      
      static Element umbra = new Element("Umbra (Darkness)", new Color(0, 0, 0), "Bellim (1st)", "Belline (Protection)", "Monitor", "Lethe", "Lampad", "Adie", "Garnet");
      static Element astro = new Element("Astro (stars)", new Color(204, 0, 255), "Soulim (2nd)", "Soulano (Wisdom)", "Tegu", "Xenandra", "Polaris", "Namid", "Amethyst");
      static Element aero = new Element("Aero (Air)", new Color(255, 204, 255), "Yvim (3rd)", "Yveni (Serenity)", "Whiptail", "Triphysa", "Aurai", "Sylph", "Aquamarine");
      static Element electro = new Element("Electro (Electricity)", new Color(255, 255, 102), "Lerim (4th)", "Lerez (Strength)", "Gecko", "Voltinia", "Hyades", "Veton", "Diamond");
      static Element terra = new Element("Terra (Earth)", new Color(204, 102, 0), "Tillim (5th)", "Tillinis (Hope)", "Iguana", "Riodina", "Oread", "Petra", "Emerald");
      static Element lux = new Element("Lux (Light)", new Color(255, 153, 0), "Inim (6th)", "Inia (Love)", "Chameleon", "Chlosyne", "Hesperides", "Ilka", "Alexandrite");
      static Element pyro = new Element("Pyro (Fire)", new Color(255, 0, 0), "Jonim (7th)", "Jonick (Bravery)", "Salamander", "Pyronia", "Enkavmas", "Maipe", "Ruby");
      static Element herbo = new Element("Herbo (Flora)", new Color(0, 204, 0), "Ayim (8th)", "Ayala (Creativity)", "Anole", "Kallima", "Dryad", "Dier", "Peridot");
      static Element ferro = new Element("Ferro (Metal)", new Color(204, 204, 204), "Morjim (8th)", "Morjin (Justice)", "Lacerta", "Caria", "Klangi", "Cairn", "Sapphire");
      static Element zoo = new Element("Zoo (Fauna)", new Color(153, 153, 255), "Naylim (10th)", "Nayleen (Nurturing)", "Agama", "Aglais", "Thirio", "Dier", "Tourmaline");
      static Element hydro = new Element("Hydro (Water)", new Color(0, 204, 255), "Rivim (11th)", "Rivall (Joy)", "Caiman", "Atlantea", "Naiad", "Nix", "Citrine");
      static Element cryo = new Element("Cryo (Ice)", new Color(255, 255, 255), "Hirim (12th)", "Hirisia (Empathy)", "Skink", "Necyria", "Aurai", "Eira", "Turquoise");

      static Element[] elements = {umbra, astro, aero, electro, terra, lux, pyro, herbo, ferro, zoo, hydro, cryo};
}
