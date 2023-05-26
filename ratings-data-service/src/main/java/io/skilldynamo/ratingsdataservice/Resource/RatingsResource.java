package io.skilldynamo.ratingsdataservice.Resource;

import io.skilldynamo.ratingsdataservice.Model.Rating;
import io.skilldynamo.ratingsdataservice.Model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId")String movieId){
        return new Rating(movieId,3);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId")String userId){
         List<Rating> ratings= Arrays.asList(
                new Rating("1234",3),
                new Rating("3578",4)
        );
         UserRating rs = new UserRating();
         rs.setRatings(ratings);
         return rs;
    }


}
