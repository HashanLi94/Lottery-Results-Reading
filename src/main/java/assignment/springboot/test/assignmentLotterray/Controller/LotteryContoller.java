package assignment.springboot.test.assignmentLotterray.Controller;

import assignment.springboot.test.assignmentLotterray.entity.Lottery;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import assignment.springboot.test.assignmentLotterray.repo.LotteryRepo;

@RestController
public class LotteryContoller {

    @Autowired
    private LotteryRepo lotteryRepo;



    @GetMapping("/lotteryresults")
    public Lottery getLotteryResults(){

        Lottery lot = new Lottery();

        final String url =
                "https://www.lankaresults.com/view/2228";

        String result = "";
        try {
            final Document document = Jsoup.connect(url).get();

//            System.out.println(document.text());
            for (Element row : document.select(
                    "div.text-center")) {

                System.out.println(row.text());

                result = row.text();

            }


            lot.setLotteryResults(result);




        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(lot);
        return lotteryRepo.save(lot);


    }
}

