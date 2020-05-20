public class Cat implements Movable{

    String type = "Cat";
    String name;

    public Cat(String name){
        this.name=name;
    }
    @Override
    public String getType(){
        return type;
    }

    @Override
    public void start() {
        System.out.println("Cat start");
    }

    @Override
    public void stop() {
        System.out.println("Cat stop");
    }
}
