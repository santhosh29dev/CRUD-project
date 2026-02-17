package com.Legionofcoders.CRUD_project_demo;


import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewsService {


    private ReviewsRepository reviewsRepository;

    private MongoTemplate mongoTemplate;
    public Reviews createReview(String reviewbody,String imdbId){

        Reviews reviews = reviewsRepository.insert(new Reviews(reviewbody));
        mongoTemplate.update(Movie.class).matching(Criteria.where(imdbId).is(imdbId)).apply(new Update().push("Review ids").value(reviews)).first();
        return reviews;

    }
}
