package DesignPatternLearning;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
		display = new DisplayType();
	}
	
	public void display() {
		System.out.println("I'm a model duck.");
	}
}
