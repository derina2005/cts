class Computer{
    private final String RAM;
    private final String CPU;
    private final String storage;
    private Computer(String RAM,String CPU,String storage){
        this.RAM=RAM;
        this.CPU=CPU;
        this.storage=storage;
    }
    @Override
    public String toString(){
        return "RAM:"+RAM+" CPU:"+CPU+" storage:"+storage;
    }
    public static  class ComputerBuilder{
        private final String RAM;
        private final String CPU;
        private String storage;
        public ComputerBuilder(String RAM,String CPU){
            this.RAM=RAM;
            this.CPU=CPU;
        }
        public ComputerBuilder Storage(String storage){
        this.storage=storage;
        return this;
        }    
        public Computer build(){
        return new Computer(RAM,CPU,storage);
        }
    }
}
public class BuilderPattern{
    public static void main(String []args){
        Computer co=new Computer.ComputerBuilder("16GB","CPU")
        .Storage("500GB")
        .build();
        System.out.print(co);
    }
}


