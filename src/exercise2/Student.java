package exercise2;

public abstract class Student {

    // Variables
    private  String name;
    private  String status;
    protected  double cost;

    public Student(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public double getCost()
    {
        return cost;
    }

    public String getStatus()
    {
        return status;
    }

    //abstract method
    public abstract void tuition();


    }


