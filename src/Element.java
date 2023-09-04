import java.awt.Color;

public class Element {
	
	Color color;
	String name, month, titanic, dragon, fairy, nymph, sprite, gem;
	public String getSprite() {
		return sprite;
	}
	public void setSprite(String sprite) {
		this.sprite = sprite;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
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
	public String getDragon() {
		return dragon;
	}
	public void setDragon(String dragon) {
		this.dragon = dragon;
	}
	public String getFairy() {
		return fairy;
	}
	public void setFairy(String fairy) {
		this.fairy = fairy;
	}
	public String getNymph() {
		return nymph;
	}
	public void setNymph(String nymph) {
		this.nymph = nymph;
	}
	public Element(String name, Color color, String month, String titanic, String dragon, String fairy, String nymph, String sprite, String gem) {
		super();
		this.name = name;
		this.color = color;
		this.month = month;
		this.titanic = titanic;
		this.dragon = dragon;
		this.fairy = fairy;
		this.nymph = nymph;
		this.sprite = sprite;
		this.gem = gem;
	}
	public String getGem() {
		return gem;
	}
	public void setGem(String gem) {
		this.gem = gem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
