package Herencias;


public abstract class Animal
{
    private String nombre;

    public Animal(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public abstract void comunicarse();

    public abstract void respirar();

    public void moverse()
    {
        System.out.println("Me muevo a 4 patas");
    }

    public String toString()
    {
        return "Animal: " + nombre;
    }
}