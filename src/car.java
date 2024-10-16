//Andrés Felipe Ortega Cárdenas

public abstract class car {

    public abstract void gas();

    public abstract void brake();

}

class sedan extends car {
    @Override
    public void gas() {
        System.out.println("Este carro....");
    }

    @Override
    public void brake() {
        System.out.println("A que si?");
    }
}
