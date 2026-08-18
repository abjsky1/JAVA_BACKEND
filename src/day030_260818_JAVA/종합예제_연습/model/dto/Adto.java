package day030_260818_JAVA.종합예제_연습.model.dto;

public class Adto {
    
    String arrival;
    String departure;
    String stopover1;
    String stopover2;
    String stopover3;
    
    public Adto(String departure, String arrival) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public Adto(String departure, String stopover1, String arrival) {
        this.arrival = arrival;
        this.departure = departure;
        this.stopover1 = stopover1;
    }

    public Adto(String departure, String stopover1, String stopover2, String arrival) {
        this.arrival = arrival;
        this.departure = departure;
        this.stopover1 = stopover1;
        this.stopover2 = stopover2;
    }

    public Adto(String departure, String stopover1, String stopover2, String stopover3, String arrival) {
        this.arrival = arrival;
        this.departure = departure;
        this.stopover1 = stopover1;
        this.stopover2 = stopover2;
        this.stopover3 = stopover3;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getStopover1() {
        return stopover1;
    }

    public void setStopover1(String stopover1) {
        this.stopover1 = stopover1;
    }

    public String getStopover2() {
        return stopover2;
    }

    public void setStopover2(String stopover2) {
        this.stopover2 = stopover2;
    }

    public String getStopover3() {
        return stopover3;
    }

    public void setStopover3(String stopover3) {
        this.stopover3 = stopover3;
    }

    @Override
    public String toString() {
        return "Adto [departure=" + departure + 
                   ", stopover1=" + stopover1 + 
                   ", stopover2=" + stopover2 + 
                   ", stopover3=" + stopover3 + 
                   ", arrival=" + arrival + "]";
    }

    

}
