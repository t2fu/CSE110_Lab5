package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float t =this.getValue();
        t= ((t*9)/5) + 32;
        Celsius newT = new Celsius(t);
        return newT;
    }

    public String toString()
    {
        // TODO: Complete this method
        float value = this.getValue();
        String v = String.valueOf(value);
        return ""+ v + " C";
    }
}