package dal.gravity;

public class GravityConstant implements GravityModel{
    
    private double gravity;
    
    public GravityConstant(){
	this.gravity=9.80665;
    }
    public GravityConstant(double gravity){
	this.gravity=gravity;
    }
    
    public double getGravitationalField(){
	return gravity;
    }
    
    
}