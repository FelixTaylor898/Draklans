import java.util.concurrent.ThreadLocalRandom;

public class Entity {
	String name;
	Type type;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
	public Entity(int age) {
		name = Util.generate(NameSet.names);
		type = TypeData.types[ThreadLocalRandom.current().nextInt(0, 12)];
		this.age = age;
	}
	
	public Entity(Type type, int age) {
		name = Util.generate(NameSet.names);
		this.type = type;
		this.age = age;
	}
	
	public String toString() {
		return name + " - " + age+"-year-old " + type.getName().toLowerCase();
	}
	

}
