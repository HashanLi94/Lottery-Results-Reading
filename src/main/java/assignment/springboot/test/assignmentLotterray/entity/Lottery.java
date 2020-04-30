package assignment.springboot.test.assignmentLotterray.entity;

import javax.persistence.*;

@Entity
@Table
public class Lottery {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int lotterytId;



    @Column
    private String lotteryResults;

    public Lottery() {
    }

    public int getLotterytId() {
        return lotterytId;
    }

    public void setLotterytId(int lotterytId) {
        this.lotterytId = lotterytId;
    }


    public String getLotteryResults() {
        return lotteryResults;
    }



    public void setLotteryResults(String lotteryResults) {
        this.lotteryResults = lotteryResults;
    }

    @Override
    public String toString() {
        return "Lottery{" +
                "lotterytId=" + lotterytId +
                ", lotteryResults='" + lotteryResults + '\'' +
                '}';
    }
}


