package test;

import java.util.Date;

public class Message {
    public Message(byte[] data) {
        this.data = data;
        this.asText = data.toString();
        this.asDouble = Double.parseDouble(this.asText);
        this.date = new Date();
    }
    public Message(string asText){
        this(asText.getBytes());
    }
    public Message(double asDouble) {
        this(Double.toString(asDouble));
    }
    private double tryParse(string data)
    {
        try{
            return Duoble.parseDouble(data);
        } catch (NumberFormatException exception)
        {
            system.out.println(exception.getMessage());
            return Double.NaN;
        }
    }


    public final byte[] data;
    public final String asText;
    public final double asDouble;
    public final Date date;



}
