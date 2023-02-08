package model;

public class Ticket {

    private String from;
    private String to;
    private Integer distance;
    private Integer noOfTravellers;
    private Integer totalFare;

    public Ticket() {
    }

    public Ticket(String from, String to, Integer distance, Integer noOfTravellers, Integer totalFare) {
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.noOfTravellers = noOfTravellers;
        this.totalFare = totalFare;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getNoOfTravellers() {
        return noOfTravellers;
    }

    public void setNoOfTravellers(Integer noOfTravellers) {
        this.noOfTravellers = noOfTravellers;
    }

    public Integer getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(Integer totalFare) {
        this.totalFare = totalFare;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", distance=" + distance +
                ", noOfTravellers=" + noOfTravellers +
                ", totalFare=" + totalFare +
                '}';
    }
}
