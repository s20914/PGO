public class Engine {
    private int ProductionYr;
    private double power;

    Engine(int ProductionYr, double power){
        this.power = power;
        this.ProductionYr = ProductionYr;
    }
    public int getProductionYr(){
        return this.ProductionYr;
    }

    public double getPower(){
        return this.power;
    }

    boolean isEco(){
        if(power >20000 && ProductionYr>2000){
            return true;
        }else {
            return false;
        }
    }
}
