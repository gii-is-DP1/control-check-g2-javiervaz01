package org.springframework.samples.petclinic.feeding;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FeedingService {

    @Autowired
    private FeedingRepository feedingRepository;

    
    @Transactional(readOnly = true)
    public List<Feeding> getAll(){
        return feedingRepository.findAll();
    }

    public List<FeedingType> getAllFeedingTypes(){
        return null;
    }
    @Transactional
    public FeedingType getFeedingType(String typeName) {
        FeedingType type = feedingRepository.getFeedingType(typeName);
        return type;
    }

    public Feeding save(Feeding p) throws UnfeasibleFeedingException {
        return null;       
    }

    
}
