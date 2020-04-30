package assignment.springboot.test.assignmentLotterray.repo;

import assignment.springboot.test.assignmentLotterray.entity.Lottery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotteryRepo extends JpaRepository <Lottery, Integer>{


}
