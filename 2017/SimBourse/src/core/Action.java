package core;

public enum Action {
	Apple("Apple"), Facebook("Facebook"), Trydea("Trydea"), Google("Google");

	private String name;

	private Action(String name) {
		this.name = name;
	}

	public static boolean estValide(String s) {
		for(Action a : Action.values())
			if(a.name.equalsIgnoreCase(s))
				return true;
		return false;
	}

	public static Action from(String s) {
		for(Action a : Action.values())
			if(a.name.equalsIgnoreCase(s))
				return a;
		System.out.println("ERROR Action.from " + s);
		return null;
	}
}
