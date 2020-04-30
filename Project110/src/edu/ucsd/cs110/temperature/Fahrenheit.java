package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float t =this.getValue();
        t= ((t-32)*5)/9;
        Fahrenheit newT = new Fahrenheit(t);
        return newT;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        float value = this.getValue();
        String v = String.valueOf(value);
        return ""+ v + " F";
    }
}