package it.academy.FinalExam.Service.ServiceImplimitation;

import it.academy.FinalExam.Entity.PostCount;
import it.academy.FinalExam.Repository.PostCountRepo;
import it.academy.FinalExam.Service.PostCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostCountServiceImpl implements PostCountService {
    @Autowired
    private PostCountRepo postCountRepo;

    @Override
    public PostCount save(PostCount postCount) {
        return postCountRepo.save(postCount);
    }
}
