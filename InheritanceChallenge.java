//vehicle class
public class Vehicle{
	//variables(states)	
	private int engine;
	private int wires;
	private double tank_size;
	private string name;
	
	//overload constructor
	public vehicle(int engine, int wires, double tank_size, string name){
		//this keyword means the variable(private int engine) is updated with the parameter(int engine) in the method
        //during code execution, this.engine is replaced by object.engine, and engine on the left hand side is the instance variable
        //and engine on the right side is the local variable(parameter)
		this.engine = engine;
		this.wires = wires;
		this.tank_size = tank_size;
		this.name = name;
	}
	
	//getter is a method that reads value of a variable
	public int getEngine(){
		return engine;
	}
	
	public int getWires(){
		return wires;
	}
	
	public double getTank_size(){
		return tank_size;
	}
	
	public String getName(){
		return name;
	}
	
	//method
	public void move(){
		 System.out.println("The vehicle moves at a certain speed");
	}

	
	
}


public class Car extends Vehicle{
	//variables(states)
	private int tires;
	private int brakes;
	private int windows;
	
	//override the eat method from the Animal class
    @Override
	public void move(){
		System.out.println("Cars can go from 0mph to 240mph");
		//super means call the same class name in the superclass
        super.move();
	}
	
	//overload constructor
	public Car(int engine, int wires, double tank_size, String name, int tires, int brakes, int windows){
		/*super keyword can also be used to access the parent class constructor.
        invoke or call parent class constructor
        Call to super() must be first statement in Derived(Student) Class constructor.
        If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
        If the superclass does not have a no-argument constructor, you will get a compile-time error.
        Object does have such a constructor, so if Object is the only superclass, there is no problem.*/
		super(engine, wires, tank_size, name);
		//engine, wires, tank_size, name were already initialized when calling the parent class constructor
        //need to initialize the other variables
		this.tires = tires;
		this.brakes = brakes;
		this.windows = windows;
	}
	
	//getter is a method that reads value of a variable
	public int getTires(){
		return tires;
	}
	
	public int getBrakes(){
		return brakes;
	}
	
	public int windows(){
		return windows;
	}
	
	//methods
	public void dragRace(){
		System.out.println("Cars can have drag races and some other vehicles can't ");
	}
	
	
}


public class Honda extends Car{
	//variables(states)
	private String powerSteering;
	
	//overload constructor
	public Honda(int engine, int wires, double tank_size, String name, int tires, int brakes, int windows, String powerSteering){
		super(engine, wires, tank_size, name, tires, brakes, windows)
		//engine, wires, tank_size, name, tires, brakes, windows were already initialized when calling the parent class constructor
        //need to initialize the other variables
		this.powerSteering = powerSteering;
	}
	
	//getter is a method that reads value of a variable
	public String getPowerSteering(){
		return powerSteering;
	}
	
}

