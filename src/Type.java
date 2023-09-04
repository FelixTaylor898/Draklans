import java.awt.Color;

public class Type {
	
	String name, color, magic, month, titanic, traits, characters, gem;
	Color rgb;
	
	

	public String getGem() {
		return gem;
	}

	public void setGem(String gem) {
		this.gem = gem;
	}

	public Type(Color rgb, String name, String magic, String month, String titanic, String traits,
			String characters, String gem, String color) {
		super();
		this.rgb = rgb;
		this.name = name;
		this.magic = magic;
		this.month = month;
		this.titanic = titanic;
		this.traits = traits;
		this.characters = characters;
		this.gem = gem;
		this.color = color;
	}

	public Color getRgb() {
		return rgb;
	}

	public void setRgb(Color rgb) {
		this.rgb = rgb;
	}

	public String getCharacters() {
		return characters;
	}

	public void setCharacters(String characters) {
		this.characters = characters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMagic() {
		return magic;
	}

	public void setMagic(String magic) {
		this.magic = magic;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getTitanic() {
		return titanic;
	}

	public void setTitanic(String titanic) {
		this.titanic = titanic;
	}

	public String getTraits() {
		return traits;
	}

	public void setTraits(String traits) {
		this.traits = traits;
	}
	

}
